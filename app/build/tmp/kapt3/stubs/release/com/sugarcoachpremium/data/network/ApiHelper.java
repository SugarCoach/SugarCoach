package com.sugarcoachpremium.data.network;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u001e\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u0010H&J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u0012H\'J\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u0015H\'J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u0017H\'J!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u0019H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\b\b\u0001\u0010\n\u001a\u00020\u001dH\'J,\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u0012H\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/sugarcoachpremium/data/network/ApiHelper;", "", "performDeleteRegister", "Lio/reactivex/Observable;", "Lcom/sugarcoachpremium/data/network/RegisterSaveResponse;", "token", "", "id", "performFBLogin", "Lcom/sugarcoachpremium/data/network/LoginResponse;", "request", "Lcom/sugarcoachpremium/data/network/LoginRequest$FacebookLoginRequest;", "performGetRegisters", "", "Lcom/sugarcoachpremium/data/network/RegistersResponse;", "performGoogleLogin", "Lcom/sugarcoachpremium/data/network/LoginRequest$GoogleLoginRequest;", "performSaveRegisters", "Lcom/sugarcoachpremium/data/network/RegisterSaveRequest$RegisterSaveRequest;", "performSaveRegistersPhoto", "Lcom/sugarcoachpremium/data/network/RegisterSavePhotoResponse;", "Lcom/sugarcoachpremium/data/network/RegisterSavePhotoRequest$RegisterSavePhotoRequest;", "performServerForgot", "Lcom/sugarcoachpremium/data/network/ForgotRequest$ServerForgotRequest;", "performServerLogin", "Lcom/sugarcoachpremium/data/network/LoginRequest$ServerLoginRequest;", "(Lcom/sugarcoachpremium/data/network/LoginRequest$ServerLoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performServerSign", "Lcom/sugarcoachpremium/data/network/SignResponse;", "Lcom/sugarcoachpremium/data/network/SignRequest$ServerSignRequest;", "performUpdateRegister", "app_release"})
public abstract interface ApiHelper {
    
    @retrofit2.http.POST(value = "http://ec2-13-59-253-95.us-east-2.compute.amazonaws.com:1337/auth/local")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object performServerLogin(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.network.LoginRequest.ServerLoginRequest request, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super io.reactivex.Observable<com.sugarcoachpremium.data.network.LoginResponse>> $completion);
    
    @retrofit2.http.POST(value = "http://ec2-13-59-253-95.us-east-2.compute.amazonaws.com:1337/auth/local")
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<com.sugarcoachpremium.data.network.LoginResponse> performServerForgot(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.network.ForgotRequest.ServerForgotRequest request);
    
    @retrofit2.http.POST(value = "http://ec2-13-59-253-95.us-east-2.compute.amazonaws.com:1337/auth/local/register")
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<com.sugarcoachpremium.data.network.SignResponse> performServerSign(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.network.SignRequest.ServerSignRequest request);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<com.sugarcoachpremium.data.network.LoginResponse> performFBLogin(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.network.LoginRequest.FacebookLoginRequest request);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<com.sugarcoachpremium.data.network.LoginResponse> performGoogleLogin(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.network.LoginRequest.GoogleLoginRequest request);
    
    @retrofit2.http.GET(value = "/dailyregisters")
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.util.List<com.sugarcoachpremium.data.network.RegistersResponse>> performGetRegisters(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String token);
    
    @retrofit2.http.DELETE(value = "http://ec2-13-59-253-95.us-east-2.compute.amazonaws.com:1337/dailyregisters/{id}")
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<com.sugarcoachpremium.data.network.RegisterSaveResponse> performDeleteRegister(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String token, @retrofit2.http.Path(value = "id")
    @org.jetbrains.annotations.NotNull
    java.lang.String id);
}