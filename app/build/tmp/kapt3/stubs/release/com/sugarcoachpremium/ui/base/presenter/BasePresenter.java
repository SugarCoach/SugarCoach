package com.sugarcoachpremium.ui.base.presenter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B!\b\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0001\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u000f\u0010\u001c\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u0010\u001dJ\u000e\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020 J\u0017\u0010#\u001a\u00020$2\b\u0010\u001a\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u0010%J\b\u0010&\u001a\u00020$H\u0016J\u0012\u0010\'\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016R\u0014\u0010\t\u001a\u00020\nX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0006\u001a\u0004\u0018\u00018\u0001X\u0084\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\bX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001b\u00a8\u0006*"}, d2 = {"Lcom/sugarcoachpremium/ui/base/presenter/BasePresenter;", "V", "Lcom/sugarcoachpremium/ui/base/view/BaseView;", "I", "Lcom/sugarcoachpremium/data/ui/base/interactor/Interactor;", "Lcom/sugarcoachpremium/ui/base/presenter/Presenter;", "interactor", "schedulerProvider", "Lcom/sugarcoachpremium/util/SchedulerProvider;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "(Lcom/sugarcoachpremium/data/ui/base/interactor/Interactor;Lcom/sugarcoachpremium/util/SchedulerProvider;Lio/reactivex/disposables/CompositeDisposable;)V", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "getInteractor", "()Lcom/sugarcoachpremium/data/ui/base/interactor/Interactor;", "setInteractor", "(Lcom/sugarcoachpremium/data/ui/base/interactor/Interactor;)V", "Lcom/sugarcoachpremium/data/ui/base/interactor/Interactor;", "isViewAttached", "", "()Z", "getSchedulerProvider", "()Lcom/sugarcoachpremium/util/SchedulerProvider;", "setSchedulerProvider", "(Lcom/sugarcoachpremium/util/SchedulerProvider;)V", "view", "Lcom/sugarcoachpremium/ui/base/view/BaseView;", "getView", "()Lcom/sugarcoachpremium/ui/base/view/BaseView;", "isEmailValid", "email", "", "isPhonelValid", "phone", "onAttach", "", "(Lcom/sugarcoachpremium/ui/base/view/BaseView;)V", "onDetach", "showException", "throwable", "", "app_release"})
public abstract class BasePresenter<V extends com.sugarcoachpremium.ui.base.view.BaseView, I extends com.sugarcoachpremium.data.ui.base.interactor.Interactor> implements com.sugarcoachpremium.ui.base.presenter.Presenter<V, I> {
    @org.jetbrains.annotations.Nullable
    private I interactor;
    @org.jetbrains.annotations.NotNull
    private com.sugarcoachpremium.util.SchedulerProvider schedulerProvider;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    @org.jetbrains.annotations.Nullable
    private V view;
    
    public BasePresenter(@org.jetbrains.annotations.Nullable
    I interactor, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.util.SchedulerProvider schedulerProvider, @org.jetbrains.annotations.NotNull
    io.reactivex.disposables.CompositeDisposable compositeDisposable) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    protected final I getInteractor() {
        return null;
    }
    
    protected final void setInteractor(@org.jetbrains.annotations.Nullable
    I p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final com.sugarcoachpremium.util.SchedulerProvider getSchedulerProvider() {
        return null;
    }
    
    protected final void setSchedulerProvider(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.util.SchedulerProvider p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    private final boolean isViewAttached() {
        return false;
    }
    
    @java.lang.Override
    public void onAttach(@org.jetbrains.annotations.Nullable
    V view) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public V getView() {
        return null;
    }
    
    @java.lang.Override
    public void onDetach() {
    }
    
    public final boolean isEmailValid(@org.jetbrains.annotations.NotNull
    java.lang.String email) {
        return false;
    }
    
    public final boolean isPhonelValid(@org.jetbrains.annotations.NotNull
    java.lang.String phone) {
        return false;
    }
    
    @java.lang.Override
    public void showException(@org.jetbrains.annotations.Nullable
    java.lang.Throwable throwable) {
    }
}