package pgm1a_basics_hellokotlin // Package declaration for organizing the code

/*
 * Program     : HelloGreet.kt
 * Author      : Vidyadhar Bendre
 * Date        : 8-September-2024
 *
 * Significance:
 * This program demonstrates the use of a single expression function in Kotlin.
 * The function `greet` takes a name as input and returns a greeting message.
 * It serves as an introductory example for understanding how to write and use
 * single expression functions in Kotlin.
 *
 * Note:
 * For those without access to a laptop or computer, you can run this code online using the
 * Kotlin Playground at https://play.kotlinlang.org/. Simply copy and paste the code into
 * the editor and click 'Run' to see the output.
 */

// Single expression function: Returns a greeting message
fun greet(name: String): String = "Hello, $name!"

// Main function: Entry point of the Kotlin program
fun main() {
    // Call the greet function and print the result to the console
    println(greet("Kotlin"))
}

/*
 * Output of the program:
 *
 * Hello, Kotlin!
 *
 */
