package com.sugarcoach.ui.login



import com.sugarcoach.ui.login.interactor.LoginInteractor
import com.sugarcoach.ui.login.interactor.LoginInteractorImp
import com.sugarcoach.ui.login.presenter.LoginPresenter
import com.sugarcoach.ui.login.presenter.LoginPresenterImp
import com.sugarcoach.ui.login.view.LoginView
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