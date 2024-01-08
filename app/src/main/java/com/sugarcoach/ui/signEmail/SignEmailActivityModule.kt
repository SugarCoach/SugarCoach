package com.sugarcoach.ui.signEmail



import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.sugarcoach.R
import com.sugarcoach.ui.signEmail.interactor.SignEmailInteractor
import com.sugarcoach.ui.signEmail.interactor.SignEmailInteractorImp
import com.sugarcoach.ui.signEmail.presenter.SignEmailPresenter
import com.sugarcoach.ui.signEmail.presenter.SignEmailPresenterImp
import com.sugarcoach.ui.signEmail.view.SignEmailActivity
import com.sugarcoach.ui.signEmail.view.SignEmailView
import dagger.Module
import dagger.Provides

@Module
class SignEmailActivityModule {

    @Provides
    internal fun providesignInteractor(signEmailInteractor: SignEmailInteractor): SignEmailInteractorImp =
        signEmailInteractor

    @Provides
    internal fun providesignPresenter(signEmailPresenter: SignEmailPresenter<SignEmailView, SignEmailInteractorImp>)
            : SignEmailPresenterImp<SignEmailView, SignEmailInteractorImp> = signEmailPresenter

    @Provides
    internal fun provideFirebaseAuth(): FirebaseAuth {
        return Firebase.auth
    }
}