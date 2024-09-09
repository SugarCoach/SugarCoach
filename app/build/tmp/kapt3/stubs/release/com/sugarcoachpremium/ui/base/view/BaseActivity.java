package com.sugarcoachpremium.ui.base.view;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u000bH\u0002J\b\u0010\u0011\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0012"}, d2 = {"Lcom/sugarcoachpremium/ui/base/view/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/sugarcoachpremium/ui/base/view/BaseView;", "()V", "dialog", "Landroidx/appcompat/app/AlertDialog;", "getDialog", "()Landroidx/appcompat/app/AlertDialog;", "setDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "createDialog", "", "hideProgress", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "performDI", "showProgress", "app_release"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity implements com.sugarcoachpremium.ui.base.view.BaseView {
    public androidx.appcompat.app.AlertDialog dialog;
    
    public BaseActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.appcompat.app.AlertDialog getDialog() {
        return null;
    }
    
    public final void setDialog(@org.jetbrains.annotations.NotNull
    androidx.appcompat.app.AlertDialog p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void hideProgress() {
    }
    
    @java.lang.Override
    public void showProgress() {
    }
    
    private final void performDI() {
    }
    
    private final void createDialog() {
    }
}