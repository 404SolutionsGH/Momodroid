import components.AccessToken
import components.HelperMethods
import momoProductSet.Collections

class Momodroid(private val apiKey:String, private val baseUrl:String) {

//    all products provided by the mtn momo APIs

fun collections():Collections{
   return HelperMethods.tryCatchWrapper {
        //    getting api key from Manager API(Not implemented)
        val apiKey:String= AccessToken("$baseUrl/collection", apiKey).get()
        Collections(apiKey,baseUrl)
    }
}

}