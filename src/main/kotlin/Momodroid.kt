import components.HelperMethods
import momoProductSet.Collections

class Momodroid(val subscriptionKey:String) {

//    all products provided by the mtn momo APIs

fun collections():Collections?{
   return HelperMethods.tryCatchWrapper {
        //    getting api key from Manager API(Not implemented)
        var apiKey:String?=null


        Collections(apiKey!!)
    }


}

}