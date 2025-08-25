package com.sugarcoachpremium.ui.forgot.view;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0013H\u0014J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0002R*\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001f"}, d2 = {"Lcom/sugarcoachpremium/ui/forgot/view/ForgotActivity;", "Lcom/sugarcoachpremium/ui/base/view/BaseActivity;", "Lcom/sugarcoachpremium/ui/forgot/view/ForgotView;", "<init>", "()V", "presenter", "Lcom/sugarcoachpremium/ui/forgot/presenter/ForgotPresenterImp;", "Lcom/sugarcoachpremium/ui/forgot/interactor/ForgotInteractorImp;", "getPresenter", "()Lcom/sugarcoachpremium/ui/forgot/presenter/ForgotPresenterImp;", "setPresenter", "(Lcom/sugarcoachpremium/ui/forgot/presenter/ForgotPresenterImp;)V", "binding", "Lcom/sugarcoachpremium/databinding/ActivityForgotBinding;", "getBinding", "()Lcom/sugarcoachpremium/databinding/ActivityForgotBinding;", "setBinding", "(Lcom/sugarcoachpremium/databinding/ActivityForgotBinding;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "showValidationMessage", "errorCode", "", "showErrorToast", "msg", "", "onForgot", "setOnClickListeners", "app_debug"})
public final class ForgotActivity extends com.sugarcoachpremium.ui.base.view.BaseActivity implements com.sugarcoachpremium.ui.forgot.view.ForgotView {
    @javax.inject.Inject()
    public com.sugarcoachpremium.ui.forgot.presenter.ForgotPresenterImp<com.sugarcoachpremium.ui.forgot.view.ForgotView, com.sugarcoachpremium.ui.forgot.interactor.ForgotInteractorImp> presenter;
    public com.sugarcoachpremium.databinding.ActivityForgotBinding binding;
    
    public ForgotActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.forgot.presenter.ForgotPresenterImp<com.sugarcoachpremium.ui.forgot.view.ForgotView, com.sugarcoachpremium.ui.forgot.interactor.ForgotInteractorImp> getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.forgot.presenter.ForgotPresenterImp<com.sugarcoachpremium.ui.forgot.view.ForgotView, com.sugarcoachpremium.ui.forgot.interactor.ForgotInteractorImp> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.databinding.ActivityForgotBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.databinding.ActivityForgotBinding p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void showValidationMessage(int errorCode) {
    }
    
    @java.lang.Override()
    public void showErrorToast(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @java.lang.Override()
    public void onForgot() {
    }
    
    private final void setOnClickListeners() {
    }
}