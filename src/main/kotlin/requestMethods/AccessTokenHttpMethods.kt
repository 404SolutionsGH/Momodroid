package requestMethods

import components.RequestMethod
import data.AccessTokenResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

abstract class AccessTokenHttpMethods():RequestMethod {
    @GET("/token")
    abstract fun  getToken(@Header("Authorization") apiKey:String):Call<AccessTokenResponse>

}