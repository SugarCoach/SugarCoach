package com.sugarcoachpremium.ui.daily_detail;

@dagger.Module()
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a2\u0006\u0002\b\bJ-\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\rH\u0001\u00a2\u0006\u0002\b\u000eJ\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0001\u00a2\u0006\u0002\b\u0013J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0001\u00a2\u0006\u0002\b\u0016J\u0015\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0012H\u0001\u00a2\u0006\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/sugarcoachpremium/ui/daily_detail/DailyDetailActivityModule;", "", "<init>", "()V", "provideDailyDetailInteractor", "Lcom/sugarcoachpremium/ui/daily_detail/interactor/DailyDetailInteractorImp;", "dailyDetailInterador", "Lcom/sugarcoachpremium/ui/daily_detail/interactor/DailyDetailInterador;", "provideDailyDetailInteractor$app_debug", "provideDailyDetailPresenter", "Lcom/sugarcoachpremium/ui/daily_detail/presenter/DailyDetailPresenterImp;", "Lcom/sugarcoachpremium/ui/daily_detail/view/DailyDetailView;", "dailyDetailPresenter", "Lcom/sugarcoachpremium/ui/daily_detail/presenter/DailyDetailPresenter;", "provideDailyDetailPresenter$app_debug", "provideItemAdapter", "Lcom/sugarcoachpremium/ui/daily_detail/view/ItemAdapter;", "context", "Lcom/sugarcoachpremium/ui/daily_detail/view/DailyDetailActivity;", "provideItemAdapter$app_debug", "provideCategoryAdapter", "Lcom/sugarcoachpremium/ui/daily_detail/view/CategoryAdapter;", "provideCategoryAdapter$app_debug", "provideLinearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "provideLinearLayoutManager$app_debug", "app_debug"})
public final class DailyDetailActivityModule {
    
    public DailyDetailActivityModule() {
        super();
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.daily_detail.interactor.DailyDetailInteractorImp provideDailyDetailInteractor$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.daily_detail.interactor.DailyDetailInterador dailyDetailInterador) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.daily_detail.presenter.DailyDetailPresenterImp<com.sugarcoachpremium.ui.daily_detail.view.DailyDetailView, com.sugarcoachpremium.ui.daily_detail.interactor.DailyDetailInteractorImp> provideDailyDetailPresenter$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.daily_detail.presenter.DailyDetailPresenter<com.sugarcoachpremium.ui.daily_detail.view.DailyDetailView, com.sugarcoachpremium.ui.daily_detail.interactor.DailyDetailInteractorImp> dailyDetailPresenter) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.daily_detail.view.ItemAdapter provideItemAdapter$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.daily_detail.view.DailyDetailActivity context) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.daily_detail.view.CategoryAdapter provideCategoryAdapter$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.daily_detail.view.DailyDetailActivity context) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.LinearLayoutManager provideLinearLayoutManager$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.daily_detail.view.DailyDetailActivity context) {
        return null;
    }
}