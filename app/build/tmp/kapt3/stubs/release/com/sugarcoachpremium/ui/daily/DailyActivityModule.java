package com.sugarcoachpremium.ui.daily;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J-\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\fH\u0001\u00a2\u0006\u0002\b\rJ\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001\u00a2\u0006\u0002\b\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/sugarcoachpremium/ui/daily/DailyActivityModule;", "", "()V", "provideDailyInteractor", "Lcom/sugarcoachpremium/ui/daily/interactor/DailyInteractorImp;", "dailyInteractor", "Lcom/sugarcoachpremium/ui/daily/interactor/DailyInteractor;", "provideDailyInteractor$app_release", "provideDailyPresenter", "Lcom/sugarcoachpremium/ui/daily/presenter/DailyPresenterImp;", "Lcom/sugarcoachpremium/ui/daily/view/DailyView;", "dailyPresenter", "Lcom/sugarcoachpremium/ui/daily/presenter/DailyPresenter;", "provideDailyPresenter$app_release", "provideLinearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Lcom/sugarcoachpremium/ui/daily/view/DailyActivity;", "provideLinearLayoutManager$app_release", "app_release"})
public final class DailyActivityModule {
    
    public DailyActivityModule() {
        super();
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.daily.interactor.DailyInteractorImp provideDailyInteractor$app_release(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.daily.interactor.DailyInteractor dailyInteractor) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.daily.presenter.DailyPresenterImp<com.sugarcoachpremium.ui.daily.view.DailyView, com.sugarcoachpremium.ui.daily.interactor.DailyInteractorImp> provideDailyPresenter$app_release(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.daily.presenter.DailyPresenter<com.sugarcoachpremium.ui.daily.view.DailyView, com.sugarcoachpremium.ui.daily.interactor.DailyInteractorImp> dailyPresenter) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final androidx.recyclerview.widget.LinearLayoutManager provideLinearLayoutManager$app_release(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.daily.view.DailyActivity context) {
        return null;
    }
}