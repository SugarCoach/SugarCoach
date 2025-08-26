package com.sugarcoachpremium.data.network;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/sugarcoachpremium/data/network/ApiEndPoint;", "", "()V", "ENDPOINT_BLOG", "", "getENDPOINT_BLOG", "()Ljava/lang/String;", "ENDPOINT_FACEBOOK_LOGIN", "ENDPOINT_GOOGLE_LOGIN", "ENDPOINT_LOGOUT", "getENDPOINT_LOGOUT", "ENDPOINT_OPEN_SOURCE", "getENDPOINT_OPEN_SOURCE", "ENDPOINT_SERVER_LOGIN", "ENDPOINT_SERVER_REGISTER", "ENDPOINT_SERVER_REGISTERS", "ENDPOINT_SERVER_REGISTERS_PHOTO", "ENDPOINT_SERVER_SIGN", "app_debug"})
public final class ApiEndPoint {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ENDPOINT_GOOGLE_LOGIN = "http://ec2-13-59-253-95.us-east-2.compute.amazonaws.com:1337/588d14f4100000a9072d2943";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ENDPOINT_FACEBOOK_LOGIN = "http://ec2-13-59-253-95.us-east-2.compute.amazonaws.com:1337/588d15d3100000ae072d2944";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ENDPOINT_SERVER_LOGIN = "http://ec2-13-59-253-95.us-east-2.compute.amazonaws.com:1337/auth/local";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ENDPOINT_SERVER_SIGN = "http://ec2-13-59-253-95.us-east-2.compute.amazonaws.com:1337/auth/local/register";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ENDPOINT_SERVER_REGISTERS = "/dailyregisters";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ENDPOINT_SERVER_REGISTER = "http://ec2-13-59-253-95.us-east-2.compute.amazonaws.com:1337/dailyregisters/{id}";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ENDPOINT_SERVER_REGISTERS_PHOTO = "http://ec2-13-59-253-95.us-east-2.compute.amazonaws.com:1337/upload";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ENDPOINT_LOGOUT = "http://ec2-13-59-253-95.us-east-2.compute.amazonaws.com:1337/588d161c100000a9072d2946";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ENDPOINT_BLOG = "http://ec2-13-59-253-95.us-east-2.compute.amazonaws.com:1337/5926ce9d11000096006ccb30";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ENDPOINT_OPEN_SOURCE = "http://ec2-13-59-253-95.us-east-2.compute.amazonaws.com:1337/5926c34212000035026871cd";
    @org.jetbrains.annotations.NotNull
    public static final com.sugarcoachpremium.data.network.ApiEndPoint INSTANCE = null;
    
    private ApiEndPoint() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getENDPOINT_LOGOUT() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getENDPOINT_BLOG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getENDPOINT_OPEN_SOURCE() {
        return null;
    }
}