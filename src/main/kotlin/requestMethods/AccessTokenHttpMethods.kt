package requestMethods

import data.AccessTokenResponse
import retrofit2.Call
import retrofit2.http.Header
import retrofit2.http.POST

interface AccessTokenHttpMethods {
    @POST("token")
     fun  getToken(@Header("Authorization") apiKey:String,@Header("Ocp-Apim-Subscription-Key") subscriptionKey:String):Call<AccessTokenResponse>

}