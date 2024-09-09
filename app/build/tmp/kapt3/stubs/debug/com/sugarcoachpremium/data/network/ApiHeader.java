package com.sugarcoachpremium.data.network;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/sugarcoachpremium/data/network/ApiHeader;", "", "protectedApiHeader", "Lcom/sugarcoachpremium/data/network/ApiHeader$ProtectedApiHeader;", "(Lcom/sugarcoachpremium/data/network/ApiHeader$ProtectedApiHeader;)V", "getProtectedApiHeader$app_debug", "()Lcom/sugarcoachpremium/data/network/ApiHeader$ProtectedApiHeader;", "ProtectedApiHeader", "app_debug"})
public final class ApiHeader {
    @org.jetbrains.annotations.NotNull
    private final com.sugarcoachpremium.data.network.ApiHeader.ProtectedApiHeader protectedApiHeader = null;
    
    @javax.inject.Inject
    public ApiHeader(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.network.ApiHeader.ProtectedApiHeader protectedApiHeader) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.data.network.ApiHeader.ProtectedApiHeader getProtectedApiHeader$app_debug() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/sugarcoachpremium/data/network/ApiHeader$ProtectedApiHeader;", "", "accessToken", "", "(Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "app_debug"})
    public static final class ProtectedApiHeader {
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName(value = "access_token")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String accessToken = null;
        
        @javax.inject.Inject
        public ProtectedApiHeader(@org.jetbrains.annotations.Nullable
        java.lang.String accessToken) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getAccessToken() {
            return null;
        }
    }
}