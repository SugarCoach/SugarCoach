package com.sugarcoachpremium.ui.signEmail.presenter

import android.util.Log
import com.facebook.AccessToken
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginResult
import com.google.firebase.Firebase
import com.google.firebase.auth.AuthCredential
import com.google.firebase.auth.EmailAuthProvider
import com.google.firebase.auth.FacebookAuthProvider
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.auth.auth
import com.sugarcoachpremium.BuildConfig
import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister
import com.sugarcoachpremium.data.database.repository.treament.Treament
import com.sugarcoachpremium.data.network.RegistersResponse
import com.sugarcoachpremium.databinding.ActivitySignEmailBinding
import com.sugarcoachpremium.ui.base.presenter.BasePresenter
import com.sugarcoachpremium.ui.signEmail.interactor.SignEmailInteractorImp
import com.sugarcoachpremium.ui.signEmail.view.SignEmailView
import com.sugarcoachpremium.util.AppConstants
import com.sugarcoachpremium.util.SchedulerProvider
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.joda.time.DateTime
import java.text.SimpleDateFormat
import java.util.Locale
import javax.inject.Inject


class SignEmailPresenter <V : SignEmailView, I : SignEmailInteractorImp> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = disposable),
    SignEmailPresenterImp<V, I> {

    private val permissionNeeds = listOf("public_profile", "email")

    lateinit var user: FirebaseUser

    var RC_SIGN_IN: Int = 123

    override fun facebookLogin(
        binding: ActivitySignEmailBinding,
        callbackManager: CallbackManager,
        auth: FirebaseAuth
    ) {
        binding.loginButton.permissions = permissionNeeds

        binding.loginButton.registerCallback(callbackManager,
            object : FacebookCallback<LoginResult> {
                override fun onSuccess(result: LoginResult) {
                    Log.i("OnFacebookSuccess", "Se Loggeo correctamente")
                    handleFacebookAccessToken(result.accessToken, auth)
                }

                override fun onCancel() {
                    Log.i("OnCancel", "Se cancelo el login")
                    getView()?.showErrorToast()
                }

                override fun onError(exception: FacebookException) {
                    Log.i("OnFacebookError", "Ocrurrió un error al logear")
                    println(exception.message)
                    getView()?.showErrorToast()
                }
            })
    }


    override fun authWithFirebase(idToken: String, auth: FirebaseAuth) {
        Log.i("firebaseAuth", "Autenticando con Firebase")
        val credential = GoogleAuthProvider.getCredential(idToken, null)
        //signWithLinkCredential(credential, auth)
        auth.signInWithCredential(credential)
            .addOnCompleteListener() { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d("OnPresenter", "signInWithCredential:success")
                    user = auth.currentUser!!
                    updateUser(user)
                } else {
                    // If sign in fails, display a message to the user.
                    Log.i("OnPresenter", "signInWithCredential:failure", task.exception)
                    getView()?.showErrorToast()
                }
            }
    }

    override fun handleFacebookAccessToken(token: AccessToken, auth: FirebaseAuth) {
        val credential = FacebookAuthProvider.getCredential(token.token)
        Log.i("OnFacebookHandler", "handleFacebookAccessToken:$token, el credential:$credential")

        //signWithLinkCredential(credential, auth)
        auth.signInWithCredential(credential)
            .addOnCompleteListener() { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d("TAG", "signInWithCredential:success")
                    user = auth.currentUser!!
                    updateUser(user)
                } else {
                    // If sign in fails, display a message to the user.
                    Log.w("TAG", "signInWithCredential:failure", task.exception)
                    getView()?.showErrorToast()
                }
            }
    }

    private fun signWithLinkCredential(credential: AuthCredential, auth: FirebaseAuth){
        auth.currentUser!!.linkWithCredential(credential)
            .addOnCompleteListener() { task ->
                if (task.isSuccessful) {
                    Log.d("OnLinkSuccess", "linkWithCredential:success")
                    val user = task.result?.user
                    getView()?.startMain()
                } else {
                    Log.w("OnLinkFailure", "Este usuario ya esta loggeado", task.exception)
                }
            }
    }
    /*override fun activityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        Log.i("OnFragmentActivityResul","Se ejeceute el result del fragment")

        if (FacebookSdk.isFacebookRequestCode(requestCode)) {
            Log.i("OnActivityResult", "OnActivityResult Facebook")
            //callbackManager?.onActivityResult(requestCode, resultCode, data)
        }else if(requestCode == RC_SIGN_IN){
            getView()?.onGoogleLogin()
            /*    var task: Task<GoogleSignInAccount> = GoogleSignIn.getSignedInAccountFromIntent(data)
                googleSuccess(task)*/
        }
    }*/

    /*private fun googleSuccess(task: Task<GoogleSignInAccount>){
        val account = task.getResult(ApiException::class.java)
        val token: String? = account?.idToken
        Log.e("token", token!!)
        getView()?.showProgress()
        interactor?.let {
            compositeDisposable.add(it.doGoogleLoginApiCall(token)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({
                        loginResponse ->
                    updateUserSocial(loginResponse)
                    getView()?.let {
                        it.hideProgress()
                        it.onSign()
                    }
                }, {err -> println(err)})
            )
        }
    }*/
    /*private fun updateUserSocial(loginResponse: LoginResponse) =
        interactor?.updateUserSocial(loginResponse)*/


    override fun signIn(username: String, email: String, password: String, auth: FirebaseAuth) {
        when {
            username.isEmpty() -> getView()?.showValidationMessage(AppConstants.EMPTY_EMAIL_ERROR)
            email.isEmpty() -> getView()?.showValidationMessage(AppConstants.EMPTY_EMAIL_ERROR)
            !isEmailValid(email) -> getView()?.showValidationMessage(AppConstants.INVALID_EMAIL_ERROR)
            password.isEmpty() -> getView()?.showValidationMessage(AppConstants.EMPTY_PASSWORD_ERROR)
            else -> {
                val credential = EmailAuthProvider.getCredential(email, password)
                auth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(){ task ->
                        if(task.isSuccessful){
                            Log.i("OnSuccessful", "Se registro correctamente")
                            user = auth.currentUser!!
                            Log.i("OnEmailRegister", "El user que se registro es: ${user.email}")
                            updateUser(user)
                        }else{
                            Log.i("OnFailure", "Ocurrió un error al registrar el mail")
                            getView()?.showErrorToast()
                        }
                    }
                /*interactor?.let {
                    compositeDisposable.add(it.doServerSignApiCall(username,email, password)
                        .observeOn(AndroidSchedulers.mainThread())
                        .doOnSubscribe{getView()?.showProgress()}
                        .doOnNext { getView()?.hideProgress() }
                        .subscribe({ signResponse ->
                            updateUser(signResponse = signResponse)
                            feedInDatabase()
                        }, { throwable -> showException(throwable)
                            getView()?.showErrorToast()
                            getView()?.hideProgress()
                        }))
                }*/

            }
        }
    }

    private fun feedInDatabase() = interactor?.let {
        Log.i("OnFeedDb", "Se esta llenando la Db")
        getView()?.showProgress()
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
        var treament = Treament(1, false, 120f,0f, 60f, 180f, null, null,null,null, 0f, 0f, 0f, DateTime.now().toDate())
        interactor?.let {
            compositeDisposable.add(it.treament(treament)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe {
                    Log.i("OnCreatedTreatment", "El result fue: $it")
                    if (it) {
                        CoroutineScope(Dispatchers.IO).launch {
                            interactor!!.insertTreatment(treament).onSuccess {
                                if (it){
                                    interactor!!.createUserData().onSuccess {
                                        Log.i("OnCreateUserData", "El response fue: $it")
                                        if(it){
                                            createdCategories()
                                        }
                                    }
                                }
                            }
                        }
                    }
                }).runCatching {
                    throw Exception("Error creando el tratamiento")
            }
        }
    }

    private fun createdCategories() {
        Log.i("OnCreatedCategories", "Se estan creando las categories")
        interactor?.let {
            compositeDisposable.add(it.category()
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe {
                    Log.i("OnCreatedCategories", "El category trajo respuesta: $it")
                    createdExercises()
                })
        }

    }

    private fun createdExercises() {
        Log.i("OnCreatedExercises", "Se estan creando los ejercicios")
        interactor?.let {
            compositeDisposable.add(it.exercises()
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe {
                    createdStates()
                })
        }

    }

    private fun createdStates() {
        Log.i("OnCreatedStates", "Se estan creando los estados")
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
                .flatMap { interactor?.treamentBasalHora() }
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe {
                    getView()?.onSign()
                    getView()?.hideProgress()
                })
        }

    }
    private fun createdTreatmentBasalHora() {
        interactor?.let {
            compositeDisposable.add(it.treamentHorarios()
                .flatMap { interactor?.treatmentHorariosCorrectora() }
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe {
                    getView()?.onSign()
                })
        }

    }

    private fun updateUser(signResponse: FirebaseUser?) {
        getView()?.showProgress()
        interactor?.updateUser(signResponse)?.subscribe(object: Observer<Boolean>{
            override fun onSubscribe(d: Disposable) {
                Log.i("OnUpdateUser", "Se suscribió")
            }

            override fun onNext(t: Boolean) {
                Log.i("OnUpdateUser", "Se ejecuto el next")
            }

            override fun onError(e: Throwable){
                Log.i("OnUpdateUser", "Ocurrió un error: $e")
                Firebase.auth.currentUser?.delete()?.addOnCompleteListener {
                    getView()?.hideProgress()
                    getView()?.showErrorToast()
                }
            }

            //@SuppressLint("CheckResult")
            override fun onComplete() {
                CoroutineScope(Dispatchers.IO).launch {
                    interactor?.updateCloudUser(signResponse)!!.fold({
                        feedInDatabase()
                    },{
                        var message = it.message;
                        Log.i("OnUpdateUser", "Ocurrió un error: $message")
                        withContext(Dispatchers.Main) {
                            FirebaseAuth.getInstance().signOut()
                            if (message != null) {
                                getView()?.showErrorToast(message)
                            }else{
                                getView()?.showErrorToast()
                            }
                            getView()?.hideProgress()
                        }
                    })
                }
            }
        })
    }

    fun saveRegisters(registers: List<RegistersResponse>) {

        val parser =  SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault())
        val parser2 =  SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        val dailyRegisters: List<DailyRegister> = registers.map { register ->
            DailyRegister(0, register.id.toString(), register.glucose, register.insulin, register.carbohydrates, register.emotional_state, register.exercise, 1,  "", register.photo?.let { BuildConfig.BASE_URL + it.url }?: "" , true , parser.parse(register.createdAt), parser2.format(parser.parse(register.createdAt)),0f,"")
        }

        interactor?.let {
            compositeDisposable.add(it.saveRegisters(dailyRegisters)
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe { getView()?.showProgress() }
                .doOnNext { getView()?.hideProgress() }
                .subscribe({
                    if (it) {
                        getView()?.onSign()
                    }else
                        getView()?.showErrorToast()
                }, { throwable ->
                    getView()?.hideProgress()
                    showException(throwable)
                })
            )
        }

    }
}