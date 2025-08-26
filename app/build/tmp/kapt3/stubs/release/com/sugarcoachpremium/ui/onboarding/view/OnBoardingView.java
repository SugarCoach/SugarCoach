package com.sugarcoachpremium.ui.onboarding.view;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J \u0010\u0004\u001a\u00020\u00032\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&\u00a8\u0006\u000b"}, d2 = {"Lcom/sugarcoachpremium/ui/onboarding/view/OnBoardingView;", "Lcom/sugarcoachpremium/ui/base/view/BaseView;", "openLoginActivity", "", "setData", "itemList", "Ljava/util/ArrayList;", "Lcom/sugarcoachpremium/ui/onboarding/view/BoardingItem;", "Lkotlin/collections/ArrayList;", "startMain", "verifyLogin", "app_release"})
public abstract interface OnBoardingView extends com.sugarcoachpremium.ui.base.view.BaseView {
    
    public abstract void openLoginActivity();
    
    public abstract void setData(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.sugarcoachpremium.ui.onboarding.view.BoardingItem> itemList);
    
    public abstract void verifyLogin();
    
    public abstract void startMain();
}