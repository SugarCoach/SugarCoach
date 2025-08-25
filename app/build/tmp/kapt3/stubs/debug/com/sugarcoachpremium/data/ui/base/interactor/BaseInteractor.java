package com.sugarcoachpremium.data.ui.base.interactor;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003B!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0004\b\u0002\u0010\nJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001cH\u0016R\u001a\u0010\b\u001a\u00020\tX\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001f"}, d2 = {"Lcom/sugarcoachpremium/data/ui/base/interactor/BaseInteractor;", "Lcom/sugarcoachpremium/data/ui/base/interactor/Interactor;", "<init>", "()V", "userHelper", "Lcom/sugarcoachpremium/data/database/repository/user/UserRepo;", "preferenceHelper", "Lcom/sugarcoachpremium/di/preferences/PreferenceHelper;", "apiHelper", "Lcom/sugarcoachpremium/data/network/ApiHelper;", "(Lcom/sugarcoachpremium/data/database/repository/user/UserRepo;Lcom/sugarcoachpremium/di/preferences/PreferenceHelper;Lcom/sugarcoachpremium/data/network/ApiHelper;)V", "getApiHelper", "()Lcom/sugarcoachpremium/data/network/ApiHelper;", "setApiHelper", "(Lcom/sugarcoachpremium/data/network/ApiHelper;)V", "getPreferenceHelper", "()Lcom/sugarcoachpremium/di/preferences/PreferenceHelper;", "setPreferenceHelper", "(Lcom/sugarcoachpremium/di/preferences/PreferenceHelper;)V", "getUserHelper", "()Lcom/sugarcoachpremium/data/database/repository/user/UserRepo;", "setUserHelper", "(Lcom/sugarcoachpremium/data/database/repository/user/UserRepo;)V", "isUserLogged", "", "perfomLogout", "", "getCurrentId", "", "setUserId", "id", "app_debug"})
public class BaseInteractor implements com.sugarcoachpremium.data.ui.base.interactor.Interactor {
    protected com.sugarcoachpremium.data.network.ApiHelper apiHelper;
    protected com.sugarcoachpremium.di.preferences.PreferenceHelper preferenceHelper;
    protected com.sugarcoachpremium.data.database.repository.user.UserRepo userHelper;
    
    public BaseInteractor() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.sugarcoachpremium.data.network.ApiHelper getApiHelper() {
        return null;
    }
    
    protected final void setApiHelper(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.network.ApiHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.sugarcoachpremium.di.preferences.PreferenceHelper getPreferenceHelper() {
        return null;
    }
    
    protected final void setPreferenceHelper(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.di.preferences.PreferenceHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.sugarcoachpremium.data.database.repository.user.UserRepo getUserHelper() {
        return null;
    }
    
    protected final void setUserHelper(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.user.UserRepo p0) {
    }
    
    public BaseInteractor(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.user.UserRepo userHelper, @org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.di.preferences.PreferenceHelper preferenceHelper, @org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.network.ApiHelper apiHelper) {
        super();
    }
    
    @java.lang.Override()
    public boolean isUserLogged() {
        return false;
    }
    
    @java.lang.Override()
    public void perfomLogout() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getCurrentId() {
        return null;
    }
    
    @java.lang.Override()
    public void setUserId(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
}