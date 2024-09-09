package com.sugarcoachpremium.ui.sign;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J-\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\fH\u0001\u00a2\u0006\u0002\b\r\u00a8\u0006\u000e"}, d2 = {"Lcom/sugarcoachpremium/ui/sign/SignActivityModule;", "", "()V", "providesignInteractor", "Lcom/sugarcoachpremium/ui/sign/interactor/SignInteractorImp;", "signInteractor", "Lcom/sugarcoachpremium/ui/sign/interactor/SignInteractor;", "providesignInteractor$app_debug", "providesignPresenter", "Lcom/sugarcoachpremium/ui/sign/presenter/SignPresenterImp;", "Lcom/sugarcoachpremium/ui/sign/view/SignView;", "signPresenter", "Lcom/sugarcoachpremium/ui/sign/presenter/SignPresenter;", "providesignPresenter$app_debug", "app_debug"})
public final class SignActivityModule {
    
    public SignActivityModule() {
        super();
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.sign.interactor.SignInteractorImp providesignInteractor$app_debug(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.sign.interactor.SignInteractor signInteractor) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.sign.presenter.SignPresenterImp<com.sugarcoachpremium.ui.sign.view.SignView, com.sugarcoachpremium.ui.sign.interactor.SignInteractorImp> providesignPresenter$app_debug(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.sign.presenter.SignPresenter<com.sugarcoachpremium.ui.sign.view.SignView, com.sugarcoachpremium.ui.sign.interactor.SignInteractorImp> signPresenter) {
        return null;
    }
}