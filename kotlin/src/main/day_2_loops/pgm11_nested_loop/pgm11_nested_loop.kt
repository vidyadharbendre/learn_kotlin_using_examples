package pgm11_nested_loop

// Package declaration for organizing the code

/*
 * Program     : NestedLoopDemo.kt
 * Author      : Vidyadhar Bendre
 * Date        : 8-September-2024
 *
 * Significance:
 * This program demonstrates the use of nested loops in Kotlin.
 * The main function contains two nested `for` loops to print pairs of numbers.
 * It serves as an introductory example for understanding how to work with loops
 * and nested loops in Kotlin.
 *
 * Note:
 * For those without access to a laptop or computer, you can run this code online using the
 * Kotlin Playground at https://play.kotlinlang.org/. Simply copy and paste the code into
 * the editor and click 'Run' to see the output.
 */

// Main function: Entry point of the Kotlin program
fun main() {
    // Nested loops to print pairs of numbers
    for (i in 1..3) {
        for (j in 1..3) {
            print("$i,$j ") // Print pairs of (i, j)
        }
        println() // Print a newline after each inner loop
    }
}

/*
 * Output of the program:
 *
 * 1,1 1,2 1,3
 * 2,1 2,2 2,3
 * 3,1 3,2 3,3
 *
 */
