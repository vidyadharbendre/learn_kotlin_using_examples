package pgm2_using_function

/*
 * Program     : pgm2_using_function.kt
 * Author      : Vidyadhar Bendre
 * Date        : 13-September-2024
 *
 * Significance:
 * This program demonstrates age calculation using a function.
 * The calculation logic is encapsulated within a function for better modularity and reuse.
 *
 * When to Use:
 * - Use this approach when you want to encapsulate logic in functions for better organization and potential reuse.
 *
 * Note:
 * This code can be run in the Kotlin Playground at https://play.kotlinlang.org/.
 */

// Function to calculate age based on birth year
fun calculateAge(birthYear: Int, currentYear: Int): Int {
    return currentYear - birthYear
}

// Main function: Entry point of the Kotlin program
fun main() {
    // Define the birth year and the current year
    val birthYear = 1971
    val currentYear = 2024

    // Call the function to calculate the age
    val age = calculateAge(birthYear, currentYear)

    // Print the age
    println("Your age is: $age") // Output will be 53
}

/*
 * Output of the program:
 *
 * Your age is: 53
 *
 * Explanation:
 * The program defines a function `calculateAge` to encapsulate the age calculation logic.
 * The function is called with the birth year and current year, and the result is printed.
 */
