package momoProductSet

import data.collections.RequestToPayBody
import libs.Retrofit
import requestMethods.CollectionsHttpMethods


class Collections(private val accessToken:String,private val baseUrl:String) {

// configuring retrofit
private val collectionsHttpMethods= Retrofit("$baseUrl/collection/v1_0").config(CollectionsHttpMethods::class.java)


fun requestToPay(referenceId:String,
targetEnv:String,requestBody:RequestToPayBody):String{
val response =collectionsHttpMethods.requestToPay(accessToken,referenceId,targetEnv,requestBody).execute()

    return if(response.isSuccessful){
        response.message()
    }
    else if(response.code()==409){
        throw Exception("Conflict:duplicated reference id")
    }
    else{
        throw Exception("Request Failed:${response.message()}")
    }

}

fun requestToPay(referenceId:String,
 targetEnv:String):String{
        val response =collectionsHttpMethods.requestToPay(accessToken,referenceId,targetEnv).execute()

        return if(response.isSuccessful){
            response.message()
        }
        else if(response.code()==409){
            throw Exception("Conflict:duplicated reference id")
        }
        else{
            throw Exception("Request Failed:${response.message()}")
        }

    }


fun requestToPay(referenceId:String,
targetEnv:String,callBackUrl:String,requestBody:RequestToPayBody):String{
        val response =collectionsHttpMethods.requestToPay(accessToken,referenceId,targetEnv,callBackUrl,requestBody).execute()

        return if(response.isSuccessful){
            response.message()
        }
        else if(response.code()==409){
            throw Exception("Conflict:duplicated reference id")
        }
        else{
            throw Exception("Request Failed:${response.message()}")
        }

    }

fun requestToPay(referenceId:String,
 targetEnv:String,callBackUrl:String):String{
        val response =collectionsHttpMethods.requestToPay(accessToken,referenceId,targetEnv,callBackUrl).execute()

        return if(response.isSuccessful){
            response.message()
        }
        else if(response.code()==409){
            throw Exception("Conflict:duplicated reference id")
        }
        else{
            throw Exception("Request Failed:${response.message()}")
        }

    }








}