package libs


import retrofit2.converter.gson.GsonConverterFactory

class Retrofit(private val baseUrl:String) {

    fun<T> config(requestMethods:Class<T>):T{
    val retrofit= retrofit2.Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create()).build()
        return retrofit.create(requestMethods)
    }


}