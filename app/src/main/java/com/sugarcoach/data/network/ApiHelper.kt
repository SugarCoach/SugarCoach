package com.sugarcoach.data.network

import com.sugarcoach.data.network.ApiEndPoint.ENDPOINT_SERVER_LOGIN
import com.sugarcoach.data.network.ApiEndPoint.ENDPOINT_SERVER_REGISTER
import com.sugarcoach.data.network.ApiEndPoint.ENDPOINT_SERVER_REGISTERS
import com.sugarcoach.data.network.ApiEndPoint.ENDPOINT_SERVER_REGISTERS_PHOTO
import com.sugarcoach.data.network.ApiEndPoint.ENDPOINT_SERVER_SIGN
import io.reactivex.Observable
import retrofit2.http.*


interface ApiHelper {
    @POST(ENDPOINT_SERVER_LOGIN)
    suspend fun performServerLogin(@Body request: LoginRequest.ServerLoginRequest): Observable<LoginResponse>

    @POST(ENDPOINT_SERVER_LOGIN)
    fun performServerForgot(@Body request: ForgotRequest.ServerForgotRequest): Observable<LoginResponse>

    @POST(ENDPOINT_SERVER_SIGN)
    fun performServerSign(@Body request: SignRequest.ServerSignRequest): Observable<SignResponse>

    fun performFBLogin(request: LoginRequest.FacebookLoginRequest): Observable<LoginResponse>

    fun performGoogleLogin(request: LoginRequest.GoogleLoginRequest): Observable<LoginResponse>

    @GET(ENDPOINT_SERVER_REGISTERS)
    fun performGetRegisters(@Header("Authorization") token: String): Observable<List<RegistersResponse>>

    @POST(ENDPOINT_SERVER_REGISTERS_PHOTO)
    fun performSaveRegistersPhoto(@Header("Authorization") token: String, @Body request: RegisterSavePhotoRequest.RegisterSavePhotoRequest): Observable<RegisterSavePhotoResponse>

    @POST(ENDPOINT_SERVER_REGISTERS)
    fun performSaveRegisters(@Header("Authorization") token: String, @Body request: RegisterSaveRequest.RegisterSaveRequest): Observable<RegisterSaveResponse>

    @DELETE(ENDPOINT_SERVER_REGISTER)
    fun performDeleteRegister(@Header("Authorization") token: String, @Path("id") id: String): Observable<RegisterSaveResponse>

    @PUT(ENDPOINT_SERVER_REGISTER)
    fun performUpdateRegister(@Header("Authorization") token: String, @Path("id") id: String,@Body request: RegisterSaveRequest.RegisterSaveRequest): Observable<RegisterSaveResponse>

}