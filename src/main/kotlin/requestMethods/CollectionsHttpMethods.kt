package requestMethods

import data.collections.RequestToPayBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface CollectionsHttpMethods {

//this is the default requestToPay
@POST("/requesttopay")
fun requestToPay(@Header("Authorization")accessToken:String
,@Header("X-Reference-Id")referenceId:String,@Header("X-Target-Environment")targetEnv:String,
 @Body requestBody:RequestToPayBody): Call<Void>

//requestToPay without a body
@POST("/requesttopay")
fun requestToPay(@Header("Authorization")accessToken:String
,@Header("X-Reference-Id")referenceId:String,@Header("X-Target-Environment")targetEnv:String): Call<Void>


//requestToPay with callbackUrl
@POST("/requesttopay")
fun requestToPay(@Header("Authorization")accessToken:String
,@Header("X-Reference-Id")referenceId:String,@Header("X-Target-Environment")targetEnv:String
,@Header("X-Callback-Url")callBackUrl:String): Call<Void>


//requestToPay with callbackUrl with body
@POST("/requesttopay")
fun requestToPay(@Header("Authorization")accessToken:String
,@Header("X-Reference-Id")referenceId:String,@Header("X-Target-Environment")targetEnv:String
,@Header("X-Callback-Url")callBackUrl:String,@Body requestBody:RequestToPayBody): Call<Void>











}