package components

object HelperMethods {

    fun <T> tryCatchWrapper(function: () -> T): T? {
        return try {
            function()
        } catch (e: Exception) {
            println("Exception caught: ${e.message}")
            null
        }
    }



}