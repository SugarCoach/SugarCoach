package com.sugarcoachpremium.ui.login



import com.sugarcoachpremium.ui.login.interactor.LoginInteractor
import com.sugarcoachpremium.ui.login.interactor.LoginInteractorImp
import com.sugarcoachpremium.ui.login.presenter.LoginPresenter
import com.sugarcoachpremium.ui.login.presenter.LoginPresenterImp
import com.sugarcoachpremium.ui.login.view.LoginView
import dagger.Module
import dagger.Provides

@Module
class LoginActivityModule {

    @Provides
    internal fun provideloginInteractor(loginInteractor: LoginInteractor): LoginInteractorImp = loginInteractor

    @Provides
    internal fun provideloginPresenter(loginPresenter: LoginPresenter<LoginView, LoginInteractorImp>)
            : LoginPresenterImp<LoginView, LoginInteractorImp> = loginPresenter
}