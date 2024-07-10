package requestMethods

import data.AccessTokenResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface AccessTokenHttpMethods {
    @POST("token")
     fun  getToken(@Header("Authorization") base64EncodedValue:String,@Header("Ocp-Apim-Subscription-Key") subscriptionKey:String,@Body data:String):Call<AccessTokenResponse>

}