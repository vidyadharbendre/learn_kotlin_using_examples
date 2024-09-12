package pgm1_without_function

/*
 * Program     : pgm1_without_function.kt
 * Author      : Vidyadhar Bendre
 * Date        : 9-September-2024
 *
 * Significance:
 * This program demonstrates age calculation directly in the main function without using functions or classes.
 * It is the most straightforward approach, suitable for simple calculations without the need for reusability.
 */

fun main() {
    val birthYear = 1971
    val currentYear = 2024
    val age = currentYear - birthYear
    println("Your age is: $age") // Output will be 53
}
