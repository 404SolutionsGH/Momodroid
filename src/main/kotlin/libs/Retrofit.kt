package libs

import components.RequestMethod
import retrofit2.converter.gson.GsonConverterFactory

class Retrofit(private val baseUrl:String) {

    fun config(requestMethods:Class<RequestMethod>):RequestMethod{
    val retrofit= retrofit2.Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create()).build()
        return retrofit.create(requestMethods)
    }


}