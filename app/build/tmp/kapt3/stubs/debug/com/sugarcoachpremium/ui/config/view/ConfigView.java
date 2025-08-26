package com.sugarcoachpremium.ui.config.view;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\u0003H&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0006H&\u00a8\u0006\u0019"}, d2 = {"Lcom/sugarcoachpremium/ui/config/view/ConfigView;", "Lcom/sugarcoachpremium/ui/base/view/BaseView;", "createDialogCongratulation", "", "explain", "msg", "", "getUserData", "user", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "openDailyActivity", "openMainActivity", "openStatisticActivity", "openTreatmentActivity", "premiumAccount", "setControl", "value", "", "setControlMedico", "setType", "showInvalidPromoCodeMessage", "showSuccessQR", "showSuccessToast", "showValidationMessage", "errorCode", "app_debug"})
public abstract interface ConfigView extends com.sugarcoachpremium.ui.base.view.BaseView {
    
    public abstract void showSuccessToast();
    
    public abstract void showSuccessQR();
    
    public abstract void getUserData(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.user.User user);
    
    public abstract void setType(boolean value);
    
    public abstract void openDailyActivity();
    
    public abstract void openMainActivity();
    
    public abstract void openStatisticActivity();
    
    public abstract void openTreatmentActivity();
    
    public abstract void explain(int msg);
    
    public abstract void premiumAccount();
    
    public abstract void showValidationMessage(int errorCode);
    
    public abstract void setControl(boolean value);
    
    public abstract void setControlMedico(boolean value);
    
    public abstract void createDialogCongratulation();
    
    public abstract void showInvalidPromoCodeMessage();
}