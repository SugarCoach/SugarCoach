package com.sugarcoachpremium.di.preferences;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0003H&J\u0012\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u0003H&J\u0017\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H&\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/sugarcoachpremium/di/preferences/PreferenceHelper;", "", "getAccessToken", "", "getCurrentUserId", "isUserLoged", "", "()Ljava/lang/Boolean;", "setAccessToken", "", "accessToken", "setCurrentUserId", "userId", "setUserLoged", "loged", "(Ljava/lang/Boolean;)V", "app_debug"})
public abstract interface PreferenceHelper {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Boolean isUserLoged();
    
    public abstract void setUserLoged(@org.jetbrains.annotations.Nullable
    java.lang.Boolean loged);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.String getCurrentUserId();
    
    public abstract void setCurrentUserId(@org.jetbrains.annotations.Nullable
    java.lang.String userId);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.String getAccessToken();
    
    public abstract void setAccessToken(@org.jetbrains.annotations.Nullable
    java.lang.String accessToken);
}