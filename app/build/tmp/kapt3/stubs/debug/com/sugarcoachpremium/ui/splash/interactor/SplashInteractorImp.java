package com.sugarcoachpremium.ui.splash.interactor;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H&J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H&\u00a8\u0006\u000b\u00c0\u0006\u0003"}, d2 = {"Lcom/sugarcoachpremium/ui/splash/interactor/SplashInteractorImp;", "Lcom/sugarcoachpremium/data/ui/base/interactor/Interactor;", "getRegistersCall", "Lio/reactivex/Observable;", "", "Lcom/sugarcoachpremium/data/network/RegistersResponse;", "getUser", "", "saveRegisters", "registersResponse", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegister;", "app_debug"})
public abstract interface SplashInteractorImp extends com.sugarcoachpremium.data.ui.base.interactor.Interactor {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.util.List<com.sugarcoachpremium.data.network.RegistersResponse>> getRegistersCall();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> getUser();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> saveRegisters(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister> registersResponse);
}