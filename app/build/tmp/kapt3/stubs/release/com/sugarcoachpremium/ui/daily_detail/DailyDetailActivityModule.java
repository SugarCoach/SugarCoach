package com.sugarcoachpremium.ui.daily_detail;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0001\u00a2\u0006\u0002\b\fJ-\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u0011H\u0001\u00a2\u0006\u0002\b\u0012J\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0015J\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0018\u00a8\u0006\u0019"}, d2 = {"Lcom/sugarcoachpremium/ui/daily_detail/DailyDetailActivityModule;", "", "()V", "provideCategoryAdapter", "Lcom/sugarcoachpremium/ui/daily_detail/view/CategoryAdapter;", "context", "Lcom/sugarcoachpremium/ui/daily_detail/view/DailyDetailActivity;", "provideCategoryAdapter$app_release", "provideDailyDetailInteractor", "Lcom/sugarcoachpremium/ui/daily_detail/interactor/DailyDetailInteractorImp;", "dailyDetailInterador", "Lcom/sugarcoachpremium/ui/daily_detail/interactor/DailyDetailInterador;", "provideDailyDetailInteractor$app_release", "provideDailyDetailPresenter", "Lcom/sugarcoachpremium/ui/daily_detail/presenter/DailyDetailPresenterImp;", "Lcom/sugarcoachpremium/ui/daily_detail/view/DailyDetailView;", "dailyDetailPresenter", "Lcom/sugarcoachpremium/ui/daily_detail/presenter/DailyDetailPresenter;", "provideDailyDetailPresenter$app_release", "provideItemAdapter", "Lcom/sugarcoachpremium/ui/daily_detail/view/ItemAdapter;", "provideItemAdapter$app_release", "provideLinearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "provideLinearLayoutManager$app_release", "app_release"})
public final class DailyDetailActivityModule {
    
    public DailyDetailActivityModule() {
        super();
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.daily_detail.interactor.DailyDetailInteractorImp provideDailyDetailInteractor$app_release(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.daily_detail.interactor.DailyDetailInterador dailyDetailInterador) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.daily_detail.presenter.DailyDetailPresenterImp<com.sugarcoachpremium.ui.daily_detail.view.DailyDetailView, com.sugarcoachpremium.ui.daily_detail.interactor.DailyDetailInteractorImp> provideDailyDetailPresenter$app_release(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.daily_detail.presenter.DailyDetailPresenter<com.sugarcoachpremium.ui.daily_detail.view.DailyDetailView, com.sugarcoachpremium.ui.daily_detail.interactor.DailyDetailInteractorImp> dailyDetailPresenter) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.daily_detail.view.ItemAdapter provideItemAdapter$app_release(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.daily_detail.view.DailyDetailActivity context) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.daily_detail.view.CategoryAdapter provideCategoryAdapter$app_release(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.daily_detail.view.DailyDetailActivity context) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final androidx.recyclerview.widget.LinearLayoutManager provideLinearLayoutManager$app_release(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.daily_detail.view.DailyDetailActivity context) {
        return null;
    }
}