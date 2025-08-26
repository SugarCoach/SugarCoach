package com.sugarcoachpremium.data.ui.base.interactor;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bB\u0005\u00a2\u0006\u0002\u0010\tJ\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0017H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001e"}, d2 = {"Lcom/sugarcoachpremium/data/ui/base/interactor/BaseInteractor;", "Lcom/sugarcoachpremium/data/ui/base/interactor/Interactor;", "userHelper", "Lcom/sugarcoachpremium/data/database/repository/user/UserRepo;", "preferenceHelper", "Lcom/sugarcoachpremium/di/preferences/PreferenceHelper;", "apiHelper", "Lcom/sugarcoachpremium/data/network/ApiHelper;", "(Lcom/sugarcoachpremium/data/database/repository/user/UserRepo;Lcom/sugarcoachpremium/di/preferences/PreferenceHelper;Lcom/sugarcoachpremium/data/network/ApiHelper;)V", "()V", "getApiHelper", "()Lcom/sugarcoachpremium/data/network/ApiHelper;", "setApiHelper", "(Lcom/sugarcoachpremium/data/network/ApiHelper;)V", "getPreferenceHelper", "()Lcom/sugarcoachpremium/di/preferences/PreferenceHelper;", "setPreferenceHelper", "(Lcom/sugarcoachpremium/di/preferences/PreferenceHelper;)V", "getUserHelper", "()Lcom/sugarcoachpremium/data/database/repository/user/UserRepo;", "setUserHelper", "(Lcom/sugarcoachpremium/data/database/repository/user/UserRepo;)V", "getCurrentId", "", "isUserLogged", "", "perfomLogout", "", "setUserId", "id", "app_debug"})
public class BaseInteractor implements com.sugarcoachpremium.data.ui.base.interactor.Interactor {
    protected com.sugarcoachpremium.data.network.ApiHelper apiHelper;
    protected com.sugarcoachpremium.di.preferences.PreferenceHelper preferenceHelper;
    protected com.sugarcoachpremium.data.database.repository.user.UserRepo userHelper;
    
    public BaseInteractor() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    protected final com.sugarcoachpremium.data.network.ApiHelper getApiHelper() {
        return null;
    }
    
    protected final void setApiHelper(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.network.ApiHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final com.sugarcoachpremium.di.preferences.PreferenceHelper getPreferenceHelper() {
        return null;
    }
    
    protected final void setPreferenceHelper(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.di.preferences.PreferenceHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final com.sugarcoachpremium.data.database.repository.user.UserRepo getUserHelper() {
        return null;
    }
    
    protected final void setUserHelper(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.user.UserRepo p0) {
    }
    
    public BaseInteractor(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.user.UserRepo userHelper, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.di.preferences.PreferenceHelper preferenceHelper, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.network.ApiHelper apiHelper) {
        super();
    }
    
    @java.lang.Override
    public boolean isUserLogged() {
        return false;
    }
    
    @java.lang.Override
    public void perfomLogout() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.String getCurrentId() {
        return null;
    }
    
    @java.lang.Override
    public void setUserId(@org.jetbrains.annotations.NotNull
    java.lang.String id) {
    }
}