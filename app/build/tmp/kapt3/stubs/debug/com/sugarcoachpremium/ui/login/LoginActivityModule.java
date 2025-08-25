package com.sugarcoachpremium.ui.login;

@dagger.Module()
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a2\u0006\u0002\b\bJ-\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\rH\u0001\u00a2\u0006\u0002\b\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/sugarcoachpremium/ui/login/LoginActivityModule;", "", "<init>", "()V", "provideloginInteractor", "Lcom/sugarcoachpremium/ui/login/interactor/LoginInteractorImp;", "loginInteractor", "Lcom/sugarcoachpremium/ui/login/interactor/LoginInteractor;", "provideloginInteractor$app_debug", "provideloginPresenter", "Lcom/sugarcoachpremium/ui/login/presenter/LoginPresenterImp;", "Lcom/sugarcoachpremium/ui/login/view/LoginView;", "loginPresenter", "Lcom/sugarcoachpremium/ui/login/presenter/LoginPresenter;", "provideloginPresenter$app_debug", "app_debug"})
public final class LoginActivityModule {
    
    public LoginActivityModule() {
        super();
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.login.interactor.LoginInteractorImp provideloginInteractor$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.login.interactor.LoginInteractor loginInteractor) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.login.presenter.LoginPresenterImp<com.sugarcoachpremium.ui.login.view.LoginView, com.sugarcoachpremium.ui.login.interactor.LoginInteractorImp> provideloginPresenter$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.login.presenter.LoginPresenter<com.sugarcoachpremium.ui.login.view.LoginView, com.sugarcoachpremium.ui.login.interactor.LoginInteractorImp> loginPresenter) {
        return null;
    }
}