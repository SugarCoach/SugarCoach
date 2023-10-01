package com.sugarcoach.ui.sign.presenter

import android.app.Activity
import android.content.Intent
import com.facebook.*
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.google.android.gms.auth.api.signin.*
import com.google.android.gms.tasks.Task
import com.sugarcoach.data.network.LoginResponse
import com.sugarcoach.ui.base.presenter.BasePresenter
import com.sugarcoach.ui.sign.interactor.SignInteractorImp
import com.sugarcoach.ui.sign.view.SignView
import com.sugarcoach.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import java.util.*
import javax.inject.Inject
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import android.util.Log


class SignPresenter <V : SignView, I : SignInteractorImp> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider ,disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = disposable),
    SignPresenterImp<V, I> {
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

    override fun emailSign() {
        getView()?.onEmailSign()
    }


    override
    fun activityResult(requestCode: Int, resultCode: Int, data: Intent?) {
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
                    loginResponse -> updateUser(loginResponse)
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
        Log.e("token", token!!)
        getView()?.showProgress()
        interactor?.let {
            compositeDisposable.add(it.doGoogleLoginApiCall(token)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({
                        loginResponse ->
                    updateUser(loginResponse)
                    getView()?.let {
                        it.hideProgress()
                        it.onFacebookLogin()
                    }
                }, {err -> println(err)})
            )
        }
    }

    private fun updateUser(loginResponse: LoginResponse) =
        interactor?.updateUser(loginResponse)

}