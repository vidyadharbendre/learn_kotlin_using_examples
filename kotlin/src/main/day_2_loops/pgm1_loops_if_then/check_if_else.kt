package pgm1_loops_if_then

/*
 * Program: Check if a Number is Positive, Negative, or Zero
 * Author: Vidyadhar Bendre
 * Date: 2-Sep-2024
 *
 * Significance:
 * This program demonstrates the use of conditional statements (`if-else`) in Kotlin.
 * It checks whether a given number is positive, negative, or zero and prints the appropriate
 * message. This example helps to understand the basic syntax and flow control of conditional
 * statements in Kotlin and introduces nested conditional logic.
 *
 * Note:
 * For those without access to a laptop or computer, you can run this code online using the
 * Kotlin Playground at https://play.kotlinlang.org/.
 *
 * Simply copy and paste the code into the editor and click 'Run' to see the output.
 *
 */

fun main() {
    // Initialize the variable `number` with a value of -10
    val number = 20

    // Check if the number is zero using an `if` statement
    if (number == 0) {
        // If the number is zero, print that it is zero
        println("$number is zero")
    } else {
        // If the number is not zero, check if it is positive using another `if` statement
        if (number > 0) {
            // If the condition is true, print that the number is positive
            println("$number is positive.")
        } else {
            // If the condition is false, print that the number is negative
            println("$number is negative")
        }
    }
}
