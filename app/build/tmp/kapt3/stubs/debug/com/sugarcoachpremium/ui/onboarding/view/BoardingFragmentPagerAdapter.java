package com.sugarcoachpremium.ui.onboarding.view;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u001e\u0010\u0011\u001a\u00020\u00122\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0013j\b\u0012\u0004\u0012\u00020\u0007`\u0014R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/sugarcoachpremium/ui/onboarding/view/BoardingFragmentPagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "itemList", "", "Lcom/sugarcoachpremium/ui/onboarding/view/BoardingItem;", "getItemList", "()Ljava/util/List;", "setItemList", "(Ljava/util/List;)V", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getItemCount", "setData", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Companion", "app_debug"})
public final class BoardingFragmentPagerAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ARG_BACKGROUND_COLOR = "param1";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ARG_RESOURCE = "param2";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ARG_TITLE = "param3";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ARG_SUBTITLE = "param4";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ARG_SHOWBUTTON = "param5";
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.sugarcoachpremium.ui.onboarding.view.BoardingItem> itemList;
    @org.jetbrains.annotations.NotNull
    public static final com.sugarcoachpremium.ui.onboarding.view.BoardingFragmentPagerAdapter.Companion Companion = null;
    
    public BoardingFragmentPagerAdapter(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentActivity activity) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sugarcoachpremium.ui.onboarding.view.BoardingItem> getItemList() {
        return null;
    }
    
    public final void setItemList(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.ui.onboarding.view.BoardingItem> p0) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.sugarcoachpremium.ui.onboarding.view.BoardingItem> itemList) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.fragment.app.Fragment createFragment(int position) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/sugarcoachpremium/ui/onboarding/view/BoardingFragmentPagerAdapter$Companion;", "", "()V", "ARG_BACKGROUND_COLOR", "", "ARG_RESOURCE", "ARG_SHOWBUTTON", "ARG_SUBTITLE", "ARG_TITLE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}