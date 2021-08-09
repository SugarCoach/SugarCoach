package com.sugarcoach.ui.signEmail.presenter

import android.app.Activity
import android.content.Intent
import android.util.Log
import com.facebook.*
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task
import com.sugarcoach.BuildConfig
import com.sugarcoach.data.database.repository.dailyregister.DailyRegister
import com.sugarcoach.data.database.repository.treament.Treament
import com.sugarcoach.data.network.LoginResponse
import com.sugarcoach.data.network.RegistersResponse
import com.sugarcoach.data.network.SignResponse
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
    private var callbackManager: CallbackManager? = null
    private val permissionNeeds = Arrays.asList("public_profile", "email")
    lateinit var mGoogleSignInClient: GoogleSignInClient
    var RC_SIGN_IN: Int = 1010

    override fun facebookLogin() {
        LoginManager.getInstance().logInWithReadPermissions(getView() as Activity, permissionNeeds)
        callbackManager = CallbackManager.Factory.create()
        callbackManager = CallbackManager.Factory.create()
        LoginManager.getInstance().registerCallback(callbackManager,
            object : FacebookCallback<LoginResult> {
                override fun onSuccess(loginResult: LoginResult) {
                    getView()?.onFacebookLogin()
//                    facebookSuccess(loginResult.accessToken)
                }

                override fun onCancel() {
                    getView()?.showErrorToast()
                }

                override fun onError(exception: FacebookException) {
                    println(exception.message)
                    getView()?.showErrorToast()
                }
            })
    }


    override fun googleLogin(client: String) {
        var gso: GoogleSignInOptions = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestIdToken(client).build()
        mGoogleSignInClient = GoogleSignIn.getClient(getView() as Activity, gso)
        getView()?.googleSignIntent(mGoogleSignInClient, RC_SIGN_IN)
    }



    override fun activityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (FacebookSdk.isFacebookRequestCode(requestCode)) {
            callbackManager?.onActivityResult(requestCode, resultCode, data)
        }else if(requestCode == RC_SIGN_IN){
            getView()?.onGoogleLogin()
            /*    var task: Task<GoogleSignInAccount> = GoogleSignIn.getSignedInAccountFromIntent(data)
                googleSuccess(task)*/
        }
    }

    private fun facebookSuccess(accessToken: AccessToken){
        getView()?.showProgress()
        interactor?.let {
            compositeDisposable.add(it.doFBLoginApiCall(accessToken)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({
                        loginResponse -> updateUserSocial(loginResponse)
                    getView()?.let {
                        it.hideProgress()
                        it.onFacebookLogin()
                    }
                }, {err -> println(err)})
            )
        }
    }

    private fun googleSuccess(task: Task<GoogleSignInAccount>){
        val account = task.getResult(ApiException::class.java)
        val token: String? = account?.idToken
        Log.e("token", token)
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