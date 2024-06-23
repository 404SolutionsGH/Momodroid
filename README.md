# Momodroid

## Overview

This project is a Kotlin library designed to interact with the MTN Mobile Money (MTN-MOMO) API. The library provides an easy-to-use interface for developers to integrate MTN-MOMO payment solutions into their Kotlin applications.

## Features

- ✨ **Seamless Integration**: Simplify the process of integrating MTN-MOMO payments into your Kotlin applications.
- 💸 **Payment Handling**: Support for various MTN-MOMO payment functionalities such as sending, receiving, and checking the status of payments.
- 🔐 **Escrow Integration**: Includes the Escrow feature, which ensures that payments are held in escrow until the recipient confirms the receipt of goods or services.

## Project Structure

The project is organized into the following directories and files:

- **src/main/kotlin**: Contains the main Kotlin source code for the library.
  - **src/main/kotlin/components**: Contains files which will be used across different packages.
  - **src/main/kotlin/data**: Contains folders (sub-folders are created using the various products provided by the MTN-MOMO API) which serve as a container for data classes representing the Kotlin objects of JSON data which has been parsed.
  - **src/main/kotlin/libs**: Contains configuration files of libraries being used.
  - **src/main/kotlin/momoProductSet**: Contains classes which represent each of the MOMO products provided by the API.
  - **src/main/kotlin/requestMethods**: Contains classes responsible for making network requests to the API endpoints.
  - **Momodroid.kt**: Main class for interfacing with the MTN-MOMO API.

## Progress

- ✅ Added necessary folders and components.
- 🛠️ Created a `HelperMethod.kt` file in the `components` folder containing a try-catch wrapper for methods performing long asynchronous tasks.
- 🛠️ Added a file responsible for configuring the Retrofit library.
- 🛠️ Implemented a base interface which all network request classes will inherit from.

## Future Work

- 🚀 **Complete Functionalities for the Collection Product**: Finalize the implementation of all functionalities related to the collection product.
- 🔐 **Add Escrow Feature**: Extend the escrow feature to support additional use cases.
- 📈 **Enhance Payment Handling**: Improve the robustness and reliability of payment processing.
- 🔧 **Additional Configuration Options**: Add more customization options for library users.
- 📚 **Documentation**: Provide comprehensive documentation and usage examples.

## Getting Started

### Prerequisites

- Kotlin 1.5 or later
- An MTN-MOMO account with API access
- Internet access for API requests

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request for any enhancements or bug fixes.

## Contact

For any questions or support, please contact developerkoose@gmail.com/herbertharthur80@gmail.com..
