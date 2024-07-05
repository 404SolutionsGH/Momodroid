package components

import libs.Retrofit
import requestMethods.AccessTokenHttpMethods
import java.util.Base64

class AccessToken (private val url:String, private val apiKey:String,
private  val subscriptionKey:String,private val referenceId:String){


   fun get():String{

//       combining referenceId and api key
       println("Combining id and api key...")
       val referenceIdXApiKey="$referenceId:$apiKey"
       println("Combination Done($referenceIdXApiKey)")

//       converting the above combination into byte array
       println("Generating base64 form of the combination...")
       val referenceIdXApiKeyByteArrayForm =Base64.getEncoder().encodeToString(referenceIdXApiKey.toByteArray())
       println("Base64 Form generated($referenceIdXApiKeyByteArrayForm)")
//       Creating the value for The Authorization Header of the request
       println("Creating Auth Value for request...")
       val authHeaderValue="Basic $referenceIdXApiKeyByteArrayForm"
       println("Auth value created($authHeaderValue)")

       println("Sending request for access token...")
//      getting access token
       val response=  Retrofit(url).config(AccessTokenHttpMethods::class.java).getToken(authHeaderValue,subscriptionKey).execute()

       println("Request sent successfully")
       if(response.isSuccessful){
           println("Request Successful , access token received")
           return response.body()!!.accessToken
                        }
       else{
           println("Request Failed")
           throw Exception("Status code:${response.code()} \nCouldn't Get Access Token: ${response.message()}")
          }
    }

}