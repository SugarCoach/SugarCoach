package com.sugarcoachpremium.ui.signEmail



import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.sugarcoachpremium.ui.signEmail.interactor.SignEmailInteractor
import com.sugarcoachpremium.ui.signEmail.interactor.SignEmailInteractorImp
import com.sugarcoachpremium.ui.signEmail.presenter.SignEmailPresenter
import com.sugarcoachpremium.ui.signEmail.presenter.SignEmailPresenterImp
import com.sugarcoachpremium.ui.signEmail.view.SignEmailView
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