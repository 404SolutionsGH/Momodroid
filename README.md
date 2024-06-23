# Momodroid
***Overview***

This project is a Kotlin library designed to interact 
with the MTN Mobile Money (MTN-MOMO) API. The library provides 
an easy-to-use interface for developers to integrate MTN-MOMO payment 
solutions into their Kotlin applications.

***Features***

*Seamless Integration*: Simplify the process of integrating MTN-MOMO payments into your Kotlin applications.

*Payment Handling*: Support for various MTN-MOMO payment functionalities such as sending, receiving, and checking the status of payments.

*Escrow Integration*:Includes the Escrow feature, which ensures that payments are held in escrow until the recipient confirms the receipt of goods or services. 


***Project Structure***
The project is organized into the following directories and files:

+ src/main/kotlin: Contains the main Kotlin source code for the library
    + src/main/kotlin/components: Contains files which will be used across different packages
  
    + src/main/kotlin/data: Contains folders(sub folders are created using the various products provided by the mtn momo api.) which serve as a container for data classes representing the kotlin objects of json data which has been parsed.
  
    + src/main/kotlin/libs: Contains configurations files of libraries been used.
  
    + src/main/kotlin/momoProductSet: Contains classes which represent each of the Momo products been provided the api.
  
    + src/main/kotlin/requestMethods: Contains classes responsible for making network request to the api end points.
  
    + Momodroid.kt: Main class for interfacing with the MTN-MOMO API.
  




***Getting Started***

*Prerequisites*

* Kotlin 1.5 or later
* An MTN-MOMO account with API access
* Internet access for API requests


***Contributing***

Contributions are welcome! Please fork the repository and submit a pull request for any enhancements or bug fixes.


***Contact***
For any questions or support, please contact [your-email@example.com].

