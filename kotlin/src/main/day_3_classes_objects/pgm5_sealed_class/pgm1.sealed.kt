package pgm5_sealed_class // Package declaration for organizing the code

/*
 * Program     : SealedClassDemo.kt
 * Author      : Vidyadhar Bendre
 * Date        : 8-September-2024
 *
 * Significance:
 * This program demonstrates the use of sealed classes in Kotlin.
 * Sealed classes provide a way to represent restricted class hierarchies, where the type can be one of a limited
 * set of types defined within the sealed class. This allows for exhaustive `when` expressions that handle all
 * possible subclasses in a type-safe manner, making them particularly useful for managing state, error handling,
 * and control flow within an application.
 *
 * In this example:
 * - `ResultClass` is a sealed class representing a hierarchy with limited subclasses.
 * - `SuccessClass` represents a successful operation with a success message.
 * - `ErrorClass` represents a failed operation with an error message.
 *
 * The `when` expression within the `handleResult` function allows the program to safely determine and handle
 * the specific subclass of `ResultClass` passed to it, printing either a success message or an error message accordingly.
 *
 * Note:
 * This code can be run in the Kotlin Playground at https://play.kotlinlang.org/.
 */

// Sealed class with different types
sealed class ResultClass

// Subclasses of the Sealed class
class SuccessClass(val message: String) : ResultClass()
class ErrorClass(val error: String) : ResultClass()

// Main function: Entry point of the Kotlin program
fun main() {
    val successResult: ResultClass = SuccessClass(message = "Network Successful")
    val errorResult: ResultClass = ErrorClass(error = "Network Failure")

    // Handle success result
    handleResult(successResult)

    // Handle error result
    handleResult(errorResult)
}

// Function to handle the result and print messages based on the type
fun handleResult(res: ResultClass) {
    when (res) {
        is SuccessClass -> println(res.message)                   // Print the success message
        is ErrorClass -> println("Error occurred: ${res.error}")  // Print the error message
    }
}

/*
 * Output of the program:
 *
 * Network Successful
 * Error occurred: Network Failure
 *
 */
