package pgm1_without_function
/*
 * Program     : pgm_1_without_function.kt
 * Author      : Vidyadhar Bendre
 * Date        : 13-September-2024
 *
 * Significance:
 * This program demonstrates age calculation directly in the `main` function without using functions or classes.
 * It is the most straightforward approach, suitable for simple calculations without the need for reusability.
 *
 * When to Use:
 * - Use this approach for simple, one-off calculations where encapsulation and reuse are not required.
 *
 * Note:
 * This code can be run in the Kotlin Playground at https://play.kotlinlang.org/.
 */

fun main() {
    // Define the birth year and the current year
    val birthYear = 1971
    val currentYear = 2024

    // Calculate the age
    val age = currentYear - birthYear

    // Print the age
    println("Your age is: $age") // Output will be 53
}

/*
 * Output of the program:
 *
 * Your age is: 53
 *
 * Explanation:
 * The program calculates the age by subtracting the birth year from the current year directly in the `main` function.
 * It prints the calculated age.
 */
