package components

object HelperMethods {

    fun <T> tryCatchWrapper(function: () -> T): T {
        return try {
            function()
        } catch (error: Exception) {
            throw error
        }
    }



}