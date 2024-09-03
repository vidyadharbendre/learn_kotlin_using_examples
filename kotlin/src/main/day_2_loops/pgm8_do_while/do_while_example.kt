package pgm8_do_while

/*
 * Program   : DoWhileLoopExample.kt
 * Author    : Vidyadhar Bendre
 * Date      : 3nd September, 2024
 *
 * Program Significance:
 * This program demonstrates the use of a `do-while` loop in Kotlin. It decrements the number
 * of bicycles until the count is 50 or less, showcasing the execution of loop statements
 * at least once, regardless of the initial condition. The program illustrates the basic
 * structure and use case of a `do-while` loop in Kotlin programming.
 *
 * Note:
 * For those without access to a laptop or computer, you can run this code online using the
 * Kotlin Playground at https://play.kotlinlang.org/. Simply copy and paste the code into
 * the editor and click 'Run' to see the output.
 */

// Main function - the entry point of the Kotlin program where execution begins.
fun main() {
    // Initialize the number of bicycles
    var bicycles = 60

    // The `do-while` loop executes the block of code at least once
    // and continues to execute as long as the condition (bicycles > 50) is true.
    do {
        bicycles-- // Decrement the number of bicycles by 1
    } while (bicycles > 50) // Loop condition to check if bicycles count is greater than 50

    // Print the final count of bicycles in the rack
    println("$bicycles bicycles in the bicycle rack\n")
}

/*
 * Output of the program:
 * 50 bicycles in the bicycle rack
 */
