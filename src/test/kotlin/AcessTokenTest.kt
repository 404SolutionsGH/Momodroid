import components.AccessToken

//class AcessTokenTest {
//}



fun main (){

    val accessTokenObj=AccessToken("https://sandbox.momodeveloper.mtn.com/collection/","a22f643e44a443ad8d3bc4dde7171be9","d743aeb159644666a1d881bc5caab039")

   val accessToken= accessTokenObj.get()

    println("The access token is : $accessToken")

}