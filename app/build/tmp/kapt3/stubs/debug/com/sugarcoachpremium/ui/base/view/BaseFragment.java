package com.sugarcoachpremium.ui.base.view;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0013B\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0012\u001a\u00020\bH&R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/sugarcoachpremium/ui/base/view/BaseFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/sugarcoachpremium/ui/base/view/BaseView;", "<init>", "()V", "parentActivity", "Lcom/sugarcoachpremium/ui/base/view/BaseActivity;", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "getBaseActivity", "setUp", "CallBack", "app_debug"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment implements com.sugarcoachpremium.ui.base.view.BaseView {
    @org.jetbrains.annotations.Nullable()
    private com.sugarcoachpremium.ui.base.view.BaseActivity parentActivity;
    
    public BaseFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.sugarcoachpremium.ui.base.view.BaseActivity getBaseActivity() {
        return null;
    }
    
    public abstract void setUp();
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007\u00c0\u0006\u0003"}, d2 = {"Lcom/sugarcoachpremium/ui/base/view/BaseFragment$CallBack;", "", "onFragmentAttached", "", "onFragmentDetached", "tag", "", "app_debug"})
    public static abstract interface CallBack {
        
        public abstract void onFragmentAttached();
        
        public abstract void onFragmentDetached(@org.jetbrains.annotations.NotNull()
        java.lang.String tag);
    }
}