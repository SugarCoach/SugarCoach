package com.sugarcoachpremium.data.preferences;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\n\u001a\u00020\u000bH\u0016\u00a2\u0006\u0002\u0010\fJ\n\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0016J\u0017\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/sugarcoachpremium/data/preferences/AppPreferenceHelper;", "Lcom/sugarcoachpremium/di/preferences/PreferenceHelper;", "context", "Landroid/content/Context;", "prefFileName", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "mPrefs", "Landroid/content/SharedPreferences;", "isUserLoged", "", "()Ljava/lang/Boolean;", "getAccessToken", "setAccessToken", "", "accessToken", "getCurrentUserId", "setCurrentUserId", "userId", "setUserLoged", "loged", "(Ljava/lang/Boolean;)V", "Companion", "app_debug"})
public final class AppPreferenceHelper implements com.sugarcoachpremium.di.preferences.PreferenceHelper {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String prefFileName = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PREF_KEY_USER_LOGGED = "PREF_KEY_USER_LOGGED";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PREF_KEY_CURRENT_USER_ID = "PREF_KEY_CURRENT_USER_ID";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PREF_KEY_ACCESS_TOKEN = "PREF_KEY_ACCESS_TOKEN";
    @org.jetbrains.annotations.NotNull()
    private final android.content.SharedPreferences mPrefs = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.sugarcoachpremium.data.preferences.AppPreferenceHelper.Companion Companion = null;
    
    @javax.inject.Inject()
    public AppPreferenceHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @com.sugarcoachpremium.di.PreferenceInfo()
    @org.jetbrains.annotations.NotNull()
    java.lang.String prefFileName) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.Boolean isUserLoged() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getAccessToken() {
        return null;
    }
    
    @java.lang.Override()
    public void setAccessToken(@org.jetbrains.annotations.Nullable()
    java.lang.String accessToken) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getCurrentUserId() {
        return null;
    }
    
    @java.lang.Override()
    public void setCurrentUserId(@org.jetbrains.annotations.Nullable()
    java.lang.String userId) {
    }
    
    @java.lang.Override()
    public void setUserLoged(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean loged) {
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/sugarcoachpremium/data/preferences/AppPreferenceHelper$Companion;", "", "<init>", "()V", "PREF_KEY_USER_LOGGED", "", "PREF_KEY_CURRENT_USER_ID", "PREF_KEY_ACCESS_TOKEN", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}