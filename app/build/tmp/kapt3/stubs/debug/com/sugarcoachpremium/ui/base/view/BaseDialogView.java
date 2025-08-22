package com.sugarcoachpremium.ui.base.view;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\bH\u0002J\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/sugarcoachpremium/ui/base/view/BaseDialogView;", "Landroidx/fragment/app/DialogFragment;", "Lcom/sugarcoachpremium/ui/base/view/DialogView;", "<init>", "()V", "parentActivity", "Lcom/sugarcoachpremium/ui/base/view/BaseActivity;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "hideProgress", "showProgress", "performDependencyInjection", "dismissDialog", "tag", "", "getBaseActivity", "app_debug"})
public abstract class BaseDialogView extends androidx.fragment.app.DialogFragment implements com.sugarcoachpremium.ui.base.view.DialogView {
    @org.jetbrains.annotations.Nullable()
    private com.sugarcoachpremium.ui.base.view.BaseActivity parentActivity;
    
    public BaseDialogView() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void hideProgress() {
    }
    
    @java.lang.Override()
    public void showProgress() {
    }
    
    private final void performDependencyInjection() {
    }
    
    public final void dismissDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    private final com.sugarcoachpremium.ui.base.view.BaseActivity getBaseActivity() {
        return null;
    }
}