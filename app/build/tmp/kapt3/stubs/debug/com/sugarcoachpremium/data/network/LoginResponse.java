package com.sugarcoachpremium.data.network;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J-\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Lcom/sugarcoachpremium/data/network/LoginResponse;", "", "user", "Lcom/sugarcoachpremium/data/network/UserResponse;", "accessToken", "", "message", "<init>", "(Lcom/sugarcoachpremium/data/network/UserResponse;Ljava/lang/String;Ljava/lang/String;)V", "getUser", "()Lcom/sugarcoachpremium/data/network/UserResponse;", "setUser", "(Lcom/sugarcoachpremium/data/network/UserResponse;)V", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "getMessage", "setMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class LoginResponse {
    @com.google.gson.annotations.Expose()
    @org.jetbrains.annotations.Nullable()
    private com.sugarcoachpremium.data.network.UserResponse user;
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "jwt")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String accessToken;
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "message")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String message;
    
    public LoginResponse(@org.jetbrains.annotations.Nullable()
    com.sugarcoachpremium.data.network.UserResponse user, @org.jetbrains.annotations.Nullable()
    java.lang.String accessToken, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.sugarcoachpremium.data.network.UserResponse getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.Nullable()
    com.sugarcoachpremium.data.network.UserResponse p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAccessToken() {
        return null;
    }
    
    public final void setAccessToken(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public LoginResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.sugarcoachpremium.data.network.UserResponse component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.data.network.LoginResponse copy(@org.jetbrains.annotations.Nullable()
    com.sugarcoachpremium.data.network.UserResponse user, @org.jetbrains.annotations.Nullable()
    java.lang.String accessToken, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}