package com.sugarcoachpremium.ui.onboarding.view;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\b\u0010\"\u001a\u00020\u001fH\u0014J\b\u0010#\u001a\u00020\u001fH\u0016J \u0010$\u001a\u00020\u001f2\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\'0&j\b\u0012\u0004\u0012\u00020\'`(H\u0017J\b\u0010)\u001a\u00020\u001fH\u0016J\b\u0010*\u001a\u00020\u001fH\u0016J\b\u0010+\u001a\u00020\u001fH\u0016J\b\u0010,\u001a\u00020\u001fH\u0016J\u0010\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020/H\u0016R*\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u00060"}, d2 = {"Lcom/sugarcoachpremium/ui/onboarding/view/OnBoardingActivity;", "Lcom/sugarcoachpremium/ui/base/view/BaseActivity;", "Lcom/sugarcoachpremium/ui/onboarding/view/OnBoardingView;", "<init>", "()V", "presenter", "Lcom/sugarcoachpremium/ui/onboarding/presenter/OnBoardingPresenterImp;", "Lcom/sugarcoachpremium/ui/onboarding/interactor/OnBoardingInteractorImp;", "getPresenter", "()Lcom/sugarcoachpremium/ui/onboarding/presenter/OnBoardingPresenterImp;", "setPresenter", "(Lcom/sugarcoachpremium/ui/onboarding/presenter/OnBoardingPresenterImp;)V", "adapter", "Lcom/sugarcoachpremium/ui/onboarding/view/BoardingFragmentPagerAdapter;", "getAdapter", "()Lcom/sugarcoachpremium/ui/onboarding/view/BoardingFragmentPagerAdapter;", "setAdapter", "(Lcom/sugarcoachpremium/ui/onboarding/view/BoardingFragmentPagerAdapter;)V", "binding", "Lcom/sugarcoachpremium/databinding/ActivityOnboardingBinding;", "getBinding", "()Lcom/sugarcoachpremium/databinding/ActivityOnboardingBinding;", "setBinding", "(Lcom/sugarcoachpremium/databinding/ActivityOnboardingBinding;)V", "dots", "Lcom/mazenrashed/dotsindicator/DotsIndicator;", "getDots", "()Lcom/mazenrashed/dotsindicator/DotsIndicator;", "setDots", "(Lcom/mazenrashed/dotsindicator/DotsIndicator;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "openLoginActivity", "setData", "itemList", "Ljava/util/ArrayList;", "Lcom/sugarcoachpremium/ui/onboarding/view/BoardingItem;", "Lkotlin/collections/ArrayList;", "verifyLogin", "startMain", "showProgress", "hideProgress", "showErrorToast", "msg", "", "app_debug"})
public final class OnBoardingActivity extends com.sugarcoachpremium.ui.base.view.BaseActivity implements com.sugarcoachpremium.ui.onboarding.view.OnBoardingView {
    @javax.inject.Inject()
    public com.sugarcoachpremium.ui.onboarding.presenter.OnBoardingPresenterImp<com.sugarcoachpremium.ui.onboarding.view.OnBoardingView, com.sugarcoachpremium.ui.onboarding.interactor.OnBoardingInteractorImp> presenter;
    @javax.inject.Inject()
    public com.sugarcoachpremium.ui.onboarding.view.BoardingFragmentPagerAdapter adapter;
    public com.sugarcoachpremium.databinding.ActivityOnboardingBinding binding;
    public com.mazenrashed.dotsindicator.DotsIndicator dots;
    
    public OnBoardingActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.onboarding.presenter.OnBoardingPresenterImp<com.sugarcoachpremium.ui.onboarding.view.OnBoardingView, com.sugarcoachpremium.ui.onboarding.interactor.OnBoardingInteractorImp> getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.onboarding.presenter.OnBoardingPresenterImp<com.sugarcoachpremium.ui.onboarding.view.OnBoardingView, com.sugarcoachpremium.ui.onboarding.interactor.OnBoardingInteractorImp> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.onboarding.view.BoardingFragmentPagerAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.onboarding.view.BoardingFragmentPagerAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.databinding.ActivityOnboardingBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.databinding.ActivityOnboardingBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mazenrashed.dotsindicator.DotsIndicator getDots() {
        return null;
    }
    
    public final void setDots(@org.jetbrains.annotations.NotNull()
    com.mazenrashed.dotsindicator.DotsIndicator p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void openLoginActivity() {
    }
    
    @java.lang.Override()
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public void setData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.sugarcoachpremium.ui.onboarding.view.BoardingItem> itemList) {
    }
    
    @java.lang.Override()
    public void verifyLogin() {
    }
    
    @java.lang.Override()
    public void startMain() {
    }
    
    @java.lang.Override()
    public void showProgress() {
    }
    
    @java.lang.Override()
    public void hideProgress() {
    }
    
    @java.lang.Override()
    public void showErrorToast(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
}