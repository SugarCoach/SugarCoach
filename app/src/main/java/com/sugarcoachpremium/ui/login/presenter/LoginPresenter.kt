package com.sugarcoachpremium.ui.login.presenter

import android.app.Activity
import android.content.Intent
import android.util.Log
import com.google.android.gms.vision.barcode.Barcode
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.notbytes.barcode_reader.BarcodeReaderActivity
import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister
import com.sugarcoachpremium.data.database.repository.treament.Treament
import com.sugarcoachpremium.data.network.LoginResponse
import com.sugarcoachpremium.data.network.RegistersResponse
import com.sugarcoachpremium.ui.base.presenter.BasePresenter
import com.sugarcoachpremium.ui.login.interactor.LoginInteractorImp
import com.sugarcoachpremium.ui.login.view.LoginView
import com.sugarcoachpremium.util.AppConstants
import com.sugarcoachpremium.util.SchedulerProvider
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.joda.time.DateTime
import org.joda.time.LocalDate
import java.text.SimpleDateFormat
import java.util.Locale
import javax.inject.Inject

class LoginPresenter  <V : LoginView, I : LoginInteractorImp> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider,compositeDisposable = disposable),
    LoginPresenterImp<V, I> {


    val barcodeREQUEST = 1002
    val auth: FirebaseAuth = Firebase.auth
    lateinit var userId: String

    override fun onLogin(email: String, password: String, mirror: Boolean, medico: Boolean) {
        when {
            email.isEmpty() -> getView()?.showValidationMessage(AppConstants.EMPTY_EMAIL_ERROR)
            !isEmailValid(email) -> getView()?.showValidationMessage(AppConstants.INVALID_EMAIL_ERROR)
            password.isEmpty() -> getView()?.showValidationMessage(AppConstants.EMPTY_PASSWORD_ERROR)
            else -> {
                auth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener() { task ->
                        if (task.isSuccessful) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.i("onLogin", "signInWithEmail:success")
                            val uid = Firebase.auth.currentUser?.uid
                            if (uid != null) {
                                // Actualizar usuario y guardar en local
                                CoroutineScope(Dispatchers.IO).launch {
                                    updateUser(uid, mirror, medico)
                                }
                            } else {
                                getView()?.hideProgress()
                                getView()?.showErrorToast("Usuario no encontrado")
                            }
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.i("onLogin", "signInWithEmail:failure", task.exception)
                            getView()?.showErrorToast("Mail o contraseña incorrectos")
                            getView()?.hideProgress()
                        }
                    }
            }
        }
    }

    private suspend fun updateUser(firebaseUID: String, mirror: Boolean, medico: Boolean) {
        interactor?.getUserData(firebaseUID)?.fold({ user ->
            if (user == null) {
                withContext(Dispatchers.Main) {
                    getView()?.hideProgress()
                    getView()?.showErrorToast("Usuario no encontrado")
                }
                return@fold
            }

            // Guardar usuario localmente
            interactor?.makeLocalUser(user)?.observeOn(AndroidSchedulers.mainThread())?.subscribe(object : Observer<Boolean> {
                override fun onSubscribe(d: Disposable) {}
                override fun onNext(t: Boolean) {}
                override fun onError(e: Throwable) {
                    Firebase.auth.currentUser?.delete()
                    getView()?.hideProgress()
                    getView()?.showErrorToast("Error al guardar usuario")
                }
                override fun onComplete() {
                    // 🔹 Login exitoso: ir a MainActivity YA
                    getView()?.onLogin()

                    // 🔹 Continuar con el resto de la carga en background
                    CoroutineScope(Dispatchers.IO).launch {
                        feedInDatabase()
                    }
                }
            })
        }, {
            withContext(Dispatchers.Main) {
                getView()?.hideProgress()
                getView()?.showErrorToast("Error al obtener datos del usuario")
            }
        })
    }

    private suspend fun suspendLogin(email: String, password: String, mirror: Boolean, medico: Boolean) = coroutineScope{
         val waitResponse = async {
            interactor?.let {
                compositeDisposable.add(it.doServerLoginpiCall(email, password)
                    .observeOn(AndroidSchedulers.mainThread())
                    .doOnSubscribe { getView()?.showProgress() }
                    .doOnNext { getView()?.hideProgress() }
                    .subscribe({ loginResponse ->
                        updateUserInSharedPref(
                            loginResponse = loginResponse,
                            mirror = mirror,
                            medico = medico
                        )
                        feedInDatabase()

                    }, { throwable ->
                        getView()?.hideProgress()
                        showException(throwable)
                    })
                )
            }
        }
        Log.i("OnSuspendLogin", "${waitResponse.await()}")
    }
    private fun updateUserInSharedPref(loginResponse: LoginResponse, mirror: Boolean,medico: Boolean) =
        interactor?.updateUserInSharedPref(loginResponse,mirror,medico)


    fun getRegisters() {
        interactor?.let {
            compositeDisposable.add(it.getRegistersCall()
                .doOnSubscribe { getView()?.showProgress() }
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ response ->
                    saveRegisters(response)

                }, { throwable ->
                    getView()?.showErrorToast()
                })
            )
        }
    }


    fun saveRegisters(registers: List<RegistersResponse>) {
        Log.i("saveRegister", "Creando treatment")

        val parser = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault())
        val parser2 = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        var dailyRegisters: List<DailyRegister> = registers.map { register ->
            DailyRegister(
                0,
                "",
                0F,
                0F,
                0F,
                "",
                "",
                1,
                "",
                "",
                true,
                LocalDate.now().toDate(),
                "",
                0f,
                ""
            )
        }

        interactor?.let {
            compositeDisposable.add(it.saveRegisters(dailyRegisters)
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe { getView()?.showProgress() }
                .doOnNext { getView()?.hideProgress() }
                .subscribe({
                    if (it) {
                        getView()?.let { getView()?.onLogin() }
                    } else
                        getView()?.showErrorToast()
                }, { throwable ->
                    getView()?.hideProgress()
                    showException(throwable)
                })
            )
        }

    }

    override fun emailSign() {
        getView()?.onEmailSign()
    }

    override fun forgot() {
        getView()?.onForgot()
    }

    override fun feedInDatabase() {
        interactor?.let {
            Log.i("OnFeedDatabase", "Se esta llenando la db")
            compositeDisposable.add(it.getCorrectora()
                .flatMap { interactor?.getBasal() }
                .flatMap { interactor?.getMedidor() }
                .flatMap { interactor?.getBombas() }
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe {
                    getView()?.let { createdTreament() }
                })
        }
    }

    private fun createdTreament() {
        //getView()?.showProgress()
        CoroutineScope(Dispatchers.IO).launch {
            Log.i("OnCoroutine", "Creando treatment")
            interactor?.let {
                var treament = Treament(1, false, 120f,0f, 60f, 180f, null,null, null, null,0f, 0f, 0f, DateTime.now().toDate())
                compositeDisposable.add(it.treament(treament)
                    .compose(schedulerProvider.ioToMainObservableScheduler())
                    .subscribe {
                        if (it) {
                            createdCategories()
                        }
                    })
            }
        }

    }

    private fun createdCategories() {
        Log.i("onCreatedTreatment", "Creando treatment")
        interactor?.let {
            compositeDisposable.add(it.category()
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe {
                    createdExercises()
                })
        }

    }

    private fun createdExercises() {
        Log.i("onCreatedTreatment", "Creando treatment")
        interactor?.let {
            compositeDisposable.add(it.exercises()
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe {
                    createdStates()
                })
        }

    }

    private fun createdStates() {
        Log.i("onCreatedTreatment", "Creando treatment")
        interactor?.let {
            compositeDisposable.add(it.states()
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe {
                    createdTreatmentHorarios()
                })
        }

    }

    private fun createdTreatmentHorarios() {
        Log.i("onCreatedTreatment", "Creando treatment")
        interactor?.let { it ->
            compositeDisposable.add(it.treamentHorarios()
                .flatMap { interactor?.treatmentHorariosCorrectora() }
                .flatMap { interactor?.treatmentBasalHora() }
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe {response ->
                    saveRegisters(emptyList())
                })
        }

    }

    override suspend fun activityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        coroutineScope {
            if (resultCode == Activity.RESULT_OK) {
                if (requestCode == barcodeREQUEST && data != null) {
                    val barcode: Barcode =
                        data.getParcelableExtra(BarcodeReaderActivity.KEY_CAPTURED_BARCODE)!!
                    when (barcode.displayValue) {
                        "sugar" -> {
                            onLogin("n@n.com", "1", true, false)
                        }

                        "sugar_medico" -> {
                            onLogin("n2@n.com", "1", true, true)
                        }

                        else -> {
                            getView()?.showErrorToast()
                        }
                    }
                }else{
                    Log.i("OnResultCode", "El result codew no fue RESULT_OK")
                }
            } else {
                getView()?.showErrorToast()
            }
        }
    }
    override fun getBarcode(): Int {
        return barcodeREQUEST
    }
}