package com.sugarcoachpremium.ui.statistics;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\nJ\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0001\u00a2\u0006\u0002\b\u000fJ-\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u0014H\u0001\u00a2\u0006\u0002\b\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/sugarcoachpremium/ui/statistics/StatisticsActivityModule;", "", "()V", "provideLinearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Lcom/sugarcoachpremium/ui/statistics/view/StatisticsActivity;", "provideLinearLayoutManager$app_release", "provideStatisticsAdapter", "Lcom/sugarcoachpremium/ui/statistics/view/StatisticsAdapter;", "provideStatisticsAdapter$app_release", "provideStatisticsInteractor", "Lcom/sugarcoachpremium/ui/statistics/interactor/StatisticsInteractorImp;", "statisticsInteractor", "Lcom/sugarcoachpremium/ui/statistics/interactor/StatisticsInteractor;", "provideStatisticsInteractor$app_release", "provideStatisticsPresenter", "Lcom/sugarcoachpremium/ui/statistics/presenter/StatisticsPresenterImp;", "Lcom/sugarcoachpremium/ui/statistics/view/StatisticsView;", "statisticsPresenter", "Lcom/sugarcoachpremium/ui/statistics/presenter/StatisticsPresenter;", "provideStatisticsPresenter$app_release", "app_release"})
public final class StatisticsActivityModule {
    
    public StatisticsActivityModule() {
        super();
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.statistics.interactor.StatisticsInteractorImp provideStatisticsInteractor$app_release(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.statistics.interactor.StatisticsInteractor statisticsInteractor) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.statistics.presenter.StatisticsPresenterImp<com.sugarcoachpremium.ui.statistics.view.StatisticsView, com.sugarcoachpremium.ui.statistics.interactor.StatisticsInteractorImp> provideStatisticsPresenter$app_release(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.statistics.presenter.StatisticsPresenter<com.sugarcoachpremium.ui.statistics.view.StatisticsView, com.sugarcoachpremium.ui.statistics.interactor.StatisticsInteractorImp> statisticsPresenter) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.statistics.view.StatisticsAdapter provideStatisticsAdapter$app_release(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.statistics.view.StatisticsActivity context) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final androidx.recyclerview.widget.LinearLayoutManager provideLinearLayoutManager$app_release(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.statistics.view.StatisticsActivity context) {
        return null;
    }
}