package com.sugarcoachpremium.ui.statistics;

@dagger.Module()
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a2\u0006\u0002\b\bJ-\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\rH\u0001\u00a2\u0006\u0002\b\u000eJ\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0001\u00a2\u0006\u0002\b\u0013J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0001\u00a2\u0006\u0002\b\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/sugarcoachpremium/ui/statistics/StatisticsActivityModule;", "", "<init>", "()V", "provideStatisticsInteractor", "Lcom/sugarcoachpremium/ui/statistics/interactor/StatisticsInteractorImp;", "statisticsInteractor", "Lcom/sugarcoachpremium/ui/statistics/interactor/StatisticsInteractor;", "provideStatisticsInteractor$app_debug", "provideStatisticsPresenter", "Lcom/sugarcoachpremium/ui/statistics/presenter/StatisticsPresenterImp;", "Lcom/sugarcoachpremium/ui/statistics/view/StatisticsView;", "statisticsPresenter", "Lcom/sugarcoachpremium/ui/statistics/presenter/StatisticsPresenter;", "provideStatisticsPresenter$app_debug", "provideStatisticsAdapter", "Lcom/sugarcoachpremium/ui/statistics/view/StatisticsAdapter;", "context", "Lcom/sugarcoachpremium/ui/statistics/view/StatisticsActivity;", "provideStatisticsAdapter$app_debug", "provideLinearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "provideLinearLayoutManager$app_debug", "app_debug"})
public final class StatisticsActivityModule {
    
    public StatisticsActivityModule() {
        super();
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.statistics.interactor.StatisticsInteractorImp provideStatisticsInteractor$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.statistics.interactor.StatisticsInteractor statisticsInteractor) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.statistics.presenter.StatisticsPresenterImp<com.sugarcoachpremium.ui.statistics.view.StatisticsView, com.sugarcoachpremium.ui.statistics.interactor.StatisticsInteractorImp> provideStatisticsPresenter$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.statistics.presenter.StatisticsPresenter<com.sugarcoachpremium.ui.statistics.view.StatisticsView, com.sugarcoachpremium.ui.statistics.interactor.StatisticsInteractorImp> statisticsPresenter) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.statistics.view.StatisticsAdapter provideStatisticsAdapter$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.statistics.view.StatisticsActivity context) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.LinearLayoutManager provideLinearLayoutManager$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.statistics.view.StatisticsActivity context) {
        return null;
    }
}