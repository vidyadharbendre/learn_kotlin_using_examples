package pgm10_range_check

/*
 * Program   : RangeCheckExample.kt
 * Author    : Vidyadhar Bendre
 * Date      : 3rd September, 2024
 *
 * Program Significance:
 * This program demonstrates the use of range checks in Kotlin using the `in` keyword.
 * It checks whether the number of students falls within a specified range (1 to 100).
 * The program prints the number of students if it lies within the range, highlighting
 * the simplicity of range operations in Kotlin, making condition checks more readable and concise.
 *
 * Note:
 * For those without access to a laptop or computer, you can run this code online using the
 * Kotlin Playground at https://play.kotlinlang.org/. Simply copy and paste the code into
 * the editor and click 'Run' to see the output.
 */

// Main function - the entry point of the Kotlin program where execution begins.
fun main() {
    // Variable to hold the number of students
    val numberOfStudents = 50

    // Checks if 'numberOfStudents' falls within the range of 1 to 100
    if (numberOfStudents in 1..100) {
        println(numberOfStudents) // Prints the number of students if within the range
    }
}

/*
 * Output of the program:
 * 50
 */
