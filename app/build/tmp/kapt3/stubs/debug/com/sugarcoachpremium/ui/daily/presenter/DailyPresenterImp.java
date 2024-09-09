package com.sugarcoachpremium.ui.daily.presenter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0007H&J\b\u0010\f\u001a\u00020\u0007H&J\b\u0010\r\u001a\u00020\u0007H&J\b\u0010\u000e\u001a\u00020\u0007H&J\b\u0010\u000f\u001a\u00020\u0007H&\u00a8\u0006\u0010"}, d2 = {"Lcom/sugarcoachpremium/ui/daily/presenter/DailyPresenterImp;", "V", "Lcom/sugarcoachpremium/ui/daily/view/DailyView;", "I", "Lcom/sugarcoachpremium/ui/daily/interactor/DailyInteractorImp;", "Lcom/sugarcoachpremium/ui/base/presenter/Presenter;", "getRegisters", "", "goToActivityDailyDetail", "id", "", "goToActivityMain", "goToActivityRegister", "goToActivityStatistic", "goToActivityTreament", "onResume", "app_debug"})
public abstract interface DailyPresenterImp<V extends com.sugarcoachpremium.ui.daily.view.DailyView, I extends com.sugarcoachpremium.ui.daily.interactor.DailyInteractorImp> extends com.sugarcoachpremium.ui.base.presenter.Presenter<V, I> {
    
    public abstract void getRegisters();
    
    public abstract void goToActivityDailyDetail(int id);
    
    public abstract void onResume();
    
    public abstract void goToActivityTreament();
    
    public abstract void goToActivityMain();
    
    public abstract void goToActivityStatistic();
    
    public abstract void goToActivityRegister();
}