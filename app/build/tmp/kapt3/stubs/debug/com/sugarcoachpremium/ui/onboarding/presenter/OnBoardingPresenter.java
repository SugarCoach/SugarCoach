package com.sugarcoachpremium.ui.onboarding.presenter;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00052\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0006B!\b\u0001\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u000fH\u0002\u00a8\u0006\u0013"}, d2 = {"Lcom/sugarcoachpremium/ui/onboarding/presenter/OnBoardingPresenter;", "V", "Lcom/sugarcoachpremium/ui/onboarding/view/OnBoardingView;", "I", "Lcom/sugarcoachpremium/ui/onboarding/interactor/OnBoardingInteractorImp;", "Lcom/sugarcoachpremium/ui/base/presenter/BasePresenter;", "Lcom/sugarcoachpremium/ui/onboarding/presenter/OnBoardingPresenterImp;", "interactor", "schedulerProvider", "Lcom/sugarcoachpremium/util/SchedulerProvider;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "<init>", "(Lcom/sugarcoachpremium/ui/onboarding/interactor/OnBoardingInteractorImp;Lcom/sugarcoachpremium/util/SchedulerProvider;Lio/reactivex/disposables/CompositeDisposable;)V", "onAttach", "", "view", "(Lcom/sugarcoachpremium/ui/onboarding/view/OnBoardingView;)V", "getData", "app_debug"})
public final class OnBoardingPresenter<V extends com.sugarcoachpremium.ui.onboarding.view.OnBoardingView, I extends com.sugarcoachpremium.ui.onboarding.interactor.OnBoardingInteractorImp> extends com.sugarcoachpremium.ui.base.presenter.BasePresenter<V, I> implements com.sugarcoachpremium.ui.onboarding.presenter.OnBoardingPresenterImp<V, I> {
    
    @javax.inject.Inject()
    public OnBoardingPresenter(@org.jetbrains.annotations.NotNull()
    I interactor, @org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.util.SchedulerProvider schedulerProvider, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable) {
        super(null, null, null);
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.Nullable()
    V view) {
    }
    
    private final void getData() {
    }
}