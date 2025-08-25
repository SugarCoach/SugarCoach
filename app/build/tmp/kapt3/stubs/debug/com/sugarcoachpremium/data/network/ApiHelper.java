package com.sugarcoachpremium.data.network;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\tH\'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\fH\'J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0010H&J\u001e\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\'J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0005\u001a\u00020\u0018H\'J\"\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0005\u001a\u00020\u001bH\'J\"\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u001d\u001a\u00020\u0015H\'J,\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u001d\u001a\u00020\u00152\b\b\u0001\u0010\u0005\u001a\u00020\u001bH\'\u00a8\u0006\u001f\u00c0\u0006\u0003"}, d2 = {"Lcom/sugarcoachpremium/data/network/ApiHelper;", "", "performServerLogin", "Lio/reactivex/Observable;", "Lcom/sugarcoachpremium/data/network/LoginResponse;", "request", "Lcom/sugarcoachpremium/data/network/LoginRequest$ServerLoginRequest;", "(Lcom/sugarcoachpremium/data/network/LoginRequest$ServerLoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performServerForgot", "Lcom/sugarcoachpremium/data/network/ForgotRequest$ServerForgotRequest;", "performServerSign", "Lcom/sugarcoachpremium/data/network/SignResponse;", "Lcom/sugarcoachpremium/data/network/SignRequest$ServerSignRequest;", "performFBLogin", "Lcom/sugarcoachpremium/data/network/LoginRequest$FacebookLoginRequest;", "performGoogleLogin", "Lcom/sugarcoachpremium/data/network/LoginRequest$GoogleLoginRequest;", "performGetRegisters", "", "Lcom/sugarcoachpremium/data/network/RegistersResponse;", "token", "", "performSaveRegistersPhoto", "Lcom/sugarcoachpremium/data/network/RegisterSavePhotoResponse;", "Lcom/sugarcoachpremium/data/network/RegisterSavePhotoRequest$RegisterSavePhotoRequest;", "performSaveRegisters", "Lcom/sugarcoachpremium/data/network/RegisterSaveResponse;", "Lcom/sugarcoachpremium/data/network/RegisterSaveRequest$RegisterSaveRequest;", "performDeleteRegister", "id", "performUpdateRegister", "app_debug"})
public abstract interface ApiHelper {
    
    @retrofit2.http.POST(value = "http://ec2-13-59-253-95.us-east-2.compute.amazonaws.com:1337/auth/local")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object performServerLogin(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.network.LoginRequest.ServerLoginRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super io.reactivex.Observable<com.sugarcoachpremium.data.network.LoginResponse>> $completion);
    
    @retrofit2.http.POST(value = "http://ec2-13-59-253-95.us-east-2.compute.amazonaws.com:1337/auth/local")
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<com.sugarcoachpremium.data.network.LoginResponse> performServerForgot(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.network.ForgotRequest.ServerForgotRequest request);
    
    @retrofit2.http.POST(value = "http://ec2-13-59-253-95.us-east-2.compute.amazonaws.com:1337/auth/local/register")
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<com.sugarcoachpremium.data.network.SignResponse> performServerSign(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.network.SignRequest.ServerSignRequest request);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<com.sugarcoachpremium.data.network.LoginResponse> performFBLogin(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.network.LoginRequest.FacebookLoginRequest request);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<com.sugarcoachpremium.data.network.LoginResponse> performGoogleLogin(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.network.LoginRequest.GoogleLoginRequest request);
    
    @retrofit2.http.GET(value = "/dailyregisters")
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.util.List<com.sugarcoachpremium.data.network.RegistersResponse>> performGetRegisters(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token);
    
    @retrofit2.http.DELETE(value = "http://ec2-13-59-253-95.us-east-2.compute.amazonaws.com:1337/dailyregisters/{id}")
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<com.sugarcoachpremium.data.network.RegisterSaveResponse> performDeleteRegister(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Path(value = "id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String id);
}