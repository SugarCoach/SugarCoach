package com.sugarcoachpremium.data.network;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lcom/sugarcoachpremium/data/network/LoginRequest;", "", "()V", "FacebookLoginRequest", "GoogleLoginRequest", "ServerLoginRequest", "app_release"})
public final class LoginRequest {
    
    public LoginRequest() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\bJ\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/sugarcoachpremium/data/network/LoginRequest$FacebookLoginRequest;", "", "token", "", "(Ljava/lang/String;)V", "getToken$app_release", "()Ljava/lang/String;", "component1", "component1$app_release", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"})
    public static final class FacebookLoginRequest {
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName(value = "fb_access_token")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String token = null;
        
        public FacebookLoginRequest(@org.jetbrains.annotations.NotNull
        java.lang.String token) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getToken$app_release() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1$app_release() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.sugarcoachpremium.data.network.LoginRequest.FacebookLoginRequest copy(@org.jetbrains.annotations.NotNull
        java.lang.String token) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\bJ\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/sugarcoachpremium/data/network/LoginRequest$GoogleLoginRequest;", "", "token", "", "(Ljava/lang/String;)V", "getToken$app_release", "()Ljava/lang/String;", "component1", "component1$app_release", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"})
    public static final class GoogleLoginRequest {
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName(value = "google_id_token")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String token = null;
        
        public GoogleLoginRequest(@org.jetbrains.annotations.NotNull
        java.lang.String token) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getToken$app_release() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1$app_release() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.sugarcoachpremium.data.network.LoginRequest.GoogleLoginRequest copy(@org.jetbrains.annotations.NotNull
        java.lang.String token) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\nJ\u000e\u0010\u000b\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\fJ\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0000X\u0081\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/sugarcoachpremium/data/network/LoginRequest$ServerLoginRequest;", "", "email", "", "pass", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmail$app_release", "()Ljava/lang/String;", "getPass$app_release", "component1", "component1$app_release", "component2", "component2$app_release", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"})
    public static final class ServerLoginRequest {
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName(value = "identifier")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String email = null;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName(value = "password")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String pass = null;
        
        public ServerLoginRequest(@org.jetbrains.annotations.NotNull
        java.lang.String email, @org.jetbrains.annotations.NotNull
        java.lang.String pass) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getEmail$app_release() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getPass$app_release() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1$app_release() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2$app_release() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.sugarcoachpremium.data.network.LoginRequest.ServerLoginRequest copy(@org.jetbrains.annotations.NotNull
        java.lang.String email, @org.jetbrains.annotations.NotNull
        java.lang.String pass) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
}