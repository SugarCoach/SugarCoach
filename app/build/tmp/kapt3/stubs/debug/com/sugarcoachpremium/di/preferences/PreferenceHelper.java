package com.sugarcoachpremium.di.preferences;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H&\u00a2\u0006\u0002\u0010\bJ\n\u0010\t\u001a\u0004\u0018\u00010\nH&J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\nH&J\n\u0010\r\u001a\u0004\u0018\u00010\nH&J\u0012\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\nH&\u00a8\u0006\u0010\u00c0\u0006\u0003"}, d2 = {"Lcom/sugarcoachpremium/di/preferences/PreferenceHelper;", "", "isUserLoged", "", "()Ljava/lang/Boolean;", "setUserLoged", "", "loged", "(Ljava/lang/Boolean;)V", "getCurrentUserId", "", "setCurrentUserId", "userId", "getAccessToken", "setAccessToken", "accessToken", "app_debug"})
public abstract interface PreferenceHelper {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Boolean isUserLoged();
    
    public abstract void setUserLoged(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean loged);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getCurrentUserId();
    
    public abstract void setCurrentUserId(@org.jetbrains.annotations.Nullable()
    java.lang.String userId);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getAccessToken();
    
    public abstract void setAccessToken(@org.jetbrains.annotations.Nullable()
    java.lang.String accessToken);
}