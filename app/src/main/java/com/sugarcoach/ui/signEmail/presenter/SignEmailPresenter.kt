package com.sugarcoach.ui.signEmail.presenter

import android.app.Activity
import android.content.Intent
import android.content.IntentSender
import android.util.Log
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.fragment.app.Fragment
import com.facebook.*
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FacebookAuthProvider
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import com.sugarcoach.BuildConfig
import com.sugarcoach.data.database.repository.dailyregister.DailyRegister
import com.sugarcoach.data.database.repository.treament.Treament
import com.sugarcoach.data.network.LoginResponse
import com.sugarcoach.data.network.RegistersResponse
import com.sugarcoach.data.network.SignResponse
import com.sugarcoach.databinding.ActivitySignEmailBinding
import com.sugarcoach.ui.base.presenter.BasePresenter
import com.sugarcoach.ui.signEmail.interactor.SignEmailInteractorImp
import com.sugarcoach.ui.signEmail.view.SignEmailView
import com.sugarcoach.util.AppConstants
import com.sugarcoach.util.SchedulerProvider
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import org.joda.time.DateTime
import retrofit2.HttpException
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject


class SignEmailPresenter <V : SignEmailView, I : SignEmailInteractorImp> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = disposable),
    SignEmailPresenterImp<V, I> {

    private val permissionNeeds = listOf("public_profile", "email")
    lateinit var mGoogleSignInClient: GoogleSignInClient

    var RC_SIGN_IN: Int = 123

    override fun facebookLogin(
        binding: ActivitySignEmailBinding,
        callbackManager: CallbackManager,
        auth: FirebaseAuth
    ) {
        binding.loginButton.permissions = permissionNeeds

        Log.i("OnConfigure", "Se esta configurando el facebook")

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
                    Log.i("OnFacebookError", "Ocrurró un error al logear")
                    println(exception.message)
                    getView()?.showErrorToast()
                }
            })
    }

    override fun googleLogin(client: GoogleSignInClient) {
        val signInIntent = client.signInIntent
        //startActivityForResult()

        //mGoogleSignInClient = GoogleSignIn.getClient(getView() as Activity, gso)
        //getView()?.googleSignIntent(client, RC_SIGN_IN)
    }

    override fun authWithFirebase(idToken: String, auth: FirebaseAuth) {
        val credential = GoogleAuthProvider.getCredential(idToken, null)
        auth.signInWithCredential(credential)
            .addOnCompleteListener() { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d("OnPresenter", "signInWithCredential:success")
                    val user = FirebaseAuth.getInstance().currentUser
                    getView()?.onGoogleLogin()
                } else {
                    // If sign in fails, display a message to the user.
                    Log.i("OnPresenter", "signInWithCredential:failure", task.exception)
                    getView()?.showErrorToast()
                }
            }
    }

    override fun handleFacebookAccessToken(token: AccessToken, auth: FirebaseAuth) {
        Log.i("OnFacebookHandler", "handleFacebookAccessToken:$token")

        val credential = FacebookAuthProvider.getCredential(token.token)
        auth.signInWithCredential(credential)
            .addOnCompleteListener() { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d("TAG", "signInWithCredential:success")
                    val user = auth.currentUser
                    getView()?.onFacebookLogin()
                } else {
                    // If sign in fails, display a message to the user.
                    Log.w("TAG", "signInWithCredential:failure", task.exception)
                    getView()?.showErrorToast()
                }
            }
    }
    override fun activityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        Log.i("OnFragmentActivityResul","Se ejeceute el result del fragment")

        if (FacebookSdk.isFacebookRequestCode(requestCode)) {
            Log.i("OnActivityResult", "OnActivityResult Facebook")
            //callbackManager?.onActivityResult(requestCode, resultCode, data)
        }else if(requestCode == RC_SIGN_IN){
            getView()?.onGoogleLogin()
            /*    var task: Task<GoogleSignInAccount> = GoogleSignIn.getSignedInAccountFromIntent(data)
                googleSuccess(task)*/
        }
    }

    private fun googleSuccess(task: Task<GoogleSignInAccount>){
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
                        it.onFacebookLogin()
                    }
                }, {err -> println(err)})
            )
        }
    }
    private fun updateUserSocial(loginResponse: LoginResponse) =
        interactor?.updateUserSocial(loginResponse)


    override fun signIn(username: String, email: String, password: String) {
        when {
            username.isEmpty() -> getView()?.showValidationMessage(AppConstants.EMPTY_EMAIL_ERROR)
            email.isEmpty() -> getView()?.showValidationMessage(AppConstants.EMPTY_EMAIL_ERROR)
            !isEmailValid(email) -> getView()?.showValidationMessage(AppConstants.INVALID_EMAIL_ERROR)
            password.isEmpty() -> getView()?.showValidationMessage(AppConstants.EMPTY_PASSWORD_ERROR)
            else -> {
                interactor?.let {
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
                }

            }
        }
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
            var treament = Treament(1, false, 120f,0f, 60f, 180f, null, null,null,null, 0f, 0f, 0f, DateTime.now().toDate())
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
                .flatMap { interactor?.treamentBasalHora() }
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe {
                    getView()?.onSign()
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

    private fun updateUser(signResponse: SignResponse) =
        interactor?.updateUser(signResponse)


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

        val parser =  SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault())
        val parser2 =  SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        var dailyRegisters: List<DailyRegister> = registers.map { register ->
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