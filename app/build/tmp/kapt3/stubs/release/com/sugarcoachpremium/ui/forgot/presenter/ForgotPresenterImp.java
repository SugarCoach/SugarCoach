package com.sugarcoachpremium.ui.forgot.presenter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/sugarcoachpremium/ui/forgot/presenter/ForgotPresenterImp;", "V", "Lcom/sugarcoachpremium/ui/forgot/view/ForgotView;", "I", "Lcom/sugarcoachpremium/ui/forgot/interactor/ForgotInteractorImp;", "Lcom/sugarcoachpremium/ui/base/presenter/Presenter;", "onForgot", "", "email", "", "app_release"})
public abstract interface ForgotPresenterImp<V extends com.sugarcoachpremium.ui.forgot.view.ForgotView, I extends com.sugarcoachpremium.ui.forgot.interactor.ForgotInteractorImp> extends com.sugarcoachpremium.ui.base.presenter.Presenter<V, I> {
    
    public abstract void onForgot(@org.jetbrains.annotations.NotNull
    java.lang.String email);
}