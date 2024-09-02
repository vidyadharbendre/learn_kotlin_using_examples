package pgm4_sum_of_natural_numbers

/*
 * Program: Sum of the First N Natural Numbers (User Input)
 * Author: Vidyadhar Bendre
 * Date: 2-Sep-2024
 *
 * Significance:
 * This program demonstrates the use of loops (`for` loop) in Kotlin and accepts user input.
 * It calculates the sum of the first N natural numbers, where N is provided by the user.
 * This example helps to understand the basic syntax of loops, handling user input, and
 * performing iterative calculations using the `for` loop in Kotlin.
 *
 * Note:
 * For those without access to a laptop or computer, you can run this code online using the
 * Kotlin Playground at https://play.kotlinlang.org/.
 *
 * Simply copy and paste the code into the editor and click 'Run' to see the output.
 *
 */

fun main() {
    // Prompt the user to enter a number
    print("Enter a number: ")

    // Read the input from the user, convert it to an integer, and assign it to `n`
    val n = readLine()?.toIntOrNull() ?: 0

    // Initialize `sum` to 0, which will hold the sum of the first `n` natural numbers
    var sum = 0

    // Use a `for` loop to iterate from 1 to `n` (inclusive)
    for (i in 1..n) {
        // Add the current value of `i` to `sum` in each iteration
        sum += i
    }

    // Print the result showing the sum of the first `n` natural numbers
    println("Sum of the first $n natural numbers: $sum")
}
