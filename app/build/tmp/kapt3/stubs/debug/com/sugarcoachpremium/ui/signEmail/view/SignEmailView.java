package com.sugarcoachpremium.ui.signEmail.view;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lcom/sugarcoachpremium/ui/signEmail/view/SignEmailView;", "Lcom/sugarcoachpremium/ui/base/view/BaseView;", "onSign", "", "showValidationMessage", "errorCode", "", "startMain", "app_debug"})
public abstract interface SignEmailView extends com.sugarcoachpremium.ui.base.view.BaseView {
    
    public abstract void onSign();
    
    public abstract void showValidationMessage(int errorCode);
    
    public abstract void startMain();
}