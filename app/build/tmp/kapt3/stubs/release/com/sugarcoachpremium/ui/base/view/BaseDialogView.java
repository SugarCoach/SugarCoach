package com.sugarcoachpremium.ui.base.view;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\n\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\u0012\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0002J\b\u0010\u0010\u001a\u00020\u0007H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/sugarcoachpremium/ui/base/view/BaseDialogView;", "Landroidx/fragment/app/DialogFragment;", "Lcom/sugarcoachpremium/ui/base/view/DialogView;", "()V", "parentActivity", "Lcom/sugarcoachpremium/ui/base/view/BaseActivity;", "dismissDialog", "", "tag", "", "getBaseActivity", "hideProgress", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "performDependencyInjection", "showProgress", "app_release"})
public abstract class BaseDialogView extends androidx.fragment.app.DialogFragment implements com.sugarcoachpremium.ui.base.view.DialogView {
    @org.jetbrains.annotations.Nullable
    private com.sugarcoachpremium.ui.base.view.BaseActivity parentActivity;
    
    public BaseDialogView() {
        super();
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void hideProgress() {
    }
    
    @java.lang.Override
    public void showProgress() {
    }
    
    private final void performDependencyInjection() {
    }
    
    public final void dismissDialog(@org.jetbrains.annotations.NotNull
    java.lang.String tag) {
    }
    
    private final com.sugarcoachpremium.ui.base.view.BaseActivity getBaseActivity() {
        return null;
    }
}