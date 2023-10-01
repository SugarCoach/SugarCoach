package com.sugarcoach.ui.login.presenter

import android.app.Activity
import android.content.Intent
import android.util.Log
import com.google.android.gms.vision.barcode.Barcode
import com.notbytes.barcode_reader.BarcodeReaderActivity
import com.sugarcoach.BuildConfig
import com.sugarcoach.data.database.repository.dailyregister.DailyRegister
import com.sugarcoach.data.database.repository.treament.Treament
import com.sugarcoach.data.network.LoginResponse
import com.sugarcoach.data.network.RegistersResponse
import com.sugarcoach.ui.base.presenter.BasePresenter
import com.sugarcoach.ui.login.interactor.LoginInteractorImp
import com.sugarcoach.ui.login.view.LoginView
import com.sugarcoach.util.AppConstants
import com.sugarcoach.util.SchedulerProvider
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import org.joda.time.DateTime
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

class LoginPresenter  <V : LoginView, I : LoginInteractorImp> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider,compositeDisposable = disposable),
    LoginPresenterImp<V, I> {


    val barcodeREQUEST = 1002
    override fun onLogin(email: String, password: String, mirror: Boolean, medico: Boolean) {
        when {
            email.isEmpty() -> getView()?.showValidationMessage(AppConstants.EMPTY_EMAIL_ERROR)
            !isEmailValid(email) -> getView()?.showValidationMessage(AppConstants.INVALID_EMAIL_ERROR)
            password.isEmpty() -> getView()?.showValidationMessage(AppConstants.EMPTY_PASSWORD_ERROR)
            else -> {
                interactor?.let {
                    compositeDisposable.add(it.doServerLoginpiCall(email, password)
                        .observeOn(AndroidSchedulers.mainThread())
                        .doOnSubscribe { getView()?.showProgress() }
                        .doOnNext { getView()?.hideProgress() }
                        .subscribe({ loginResponse ->
                            updateUserInSharedPref(loginResponse = loginResponse,mirror = mirror,medico = medico)
                            feedInDatabase()

                        }, { throwable ->
                            getView()?.hideProgress()
                            showException(throwable)
                        })
                    )
                }
            }
        }
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

        val parser = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault())
        val parser2 = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        var dailyRegisters: List<DailyRegister> = registers.map { register ->
            DailyRegister(
                0,
                register.id.toString(),
                register.glucose,
                register.insulin,
                register.carbohydrates,
                register.emotional_state,
                register.exercise,
                1,
                "",
                register.photo?.let { BuildConfig.BASE_URL + it.url } ?: "",
                true,
                parser.parse(register.createdAt),
                parser2.format(parser.parse(register.createdAt)),
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

    private fun feedInDatabase() = interactor?.let {
        compositeDisposable.add(it.getCorrectora()
            .flatMap { interactor?.getBasal() }
            .flatMap { interactor?.getMedidor() }
            .flatMap { interactor?.getBombas() }
            .compose(schedulerProvider.ioToMainObservableScheduler())
            .subscribe {
                getView()?.let { createdTreament() }
            })
    }

    private fun createdTreament() {
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

    private fun createdCategories() {
        interactor?.let {
            compositeDisposable.add(it.category()
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe {
                    createdExercises()
                })
        }

    }

    private fun createdExercises() {
        interactor?.let {
            compositeDisposable.add(it.exercises()
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe {
                    createdStates()
                })
        }

    }

    private fun createdStates() {
        interactor?.let {
            compositeDisposable.add(it.states()
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe {
                    createdTreatmentHorarios()
                })
        }

    }

    private fun createdTreatmentHorarios() {
        interactor?.let {
            compositeDisposable.add(it.treamentHorarios()
                .flatMap { interactor?.treatmentHorariosCorrectora() }
                .flatMap { interactor?.treatmentBasalHora() }
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe {
                    getRegisters()
                })
        }

    }

    override fun activityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == barcodeREQUEST && data != null) {
                val barcode: Barcode = data.getParcelableExtra (BarcodeReaderActivity.KEY_CAPTURED_BARCODE)!!
                when (barcode.displayValue) {
                    "sugar" -> {
                        onLogin("n@n.com", "1", true,false)
                    }
                    "sugar_medico" -> {
                        onLogin("n2@n.com", "1", true, true)
                    }
                    else -> {
                        getView()?.showErrorToast()
                    }
                }
            }
        }else{
            getView()?.showErrorToast()
        }
    }
    override fun getBarcode(): Int {
        return barcodeREQUEST
    }
}