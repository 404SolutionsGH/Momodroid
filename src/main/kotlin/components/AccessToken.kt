package components

import libs.Retrofit
import requestMethods.AccessTokenHttpMethods

class AccessToken (private val url:String, private val apiKey:String){


   fun get():String{
    //      getting access token
    val response=  Retrofit(url).config(AccessTokenHttpMethods::class.java).getToken(apiKey).execute()
       if(response.isSuccessful){
           return response.body()!!.accessToken
     }
       else{
           throw Exception("Couldn't Get Access Token: ${response.message()}")
     }
    }

}