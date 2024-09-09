package com.sugarcoachpremium.ui.base.presenter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005J\u000f\u0010\u0006\u001a\u0004\u0018\u00018\u0000H&\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00018\u0000H&\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\tH&J\u0012\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&\u00a8\u0006\u0010"}, d2 = {"Lcom/sugarcoachpremium/ui/base/presenter/Presenter;", "V", "Lcom/sugarcoachpremium/ui/base/view/BaseView;", "I", "Lcom/sugarcoachpremium/data/ui/base/interactor/Interactor;", "", "getView", "()Lcom/sugarcoachpremium/ui/base/view/BaseView;", "onAttach", "", "view", "(Lcom/sugarcoachpremium/ui/base/view/BaseView;)V", "onDetach", "showException", "throwable", "", "app_debug"})
public abstract interface Presenter<V extends com.sugarcoachpremium.ui.base.view.BaseView, I extends com.sugarcoachpremium.data.ui.base.interactor.Interactor> {
    
    public abstract void onAttach(@org.jetbrains.annotations.Nullable
    V view);
    
    public abstract void onDetach();
    
    @org.jetbrains.annotations.Nullable
    public abstract V getView();
    
    public abstract void showException(@org.jetbrains.annotations.Nullable
    java.lang.Throwable throwable);
}