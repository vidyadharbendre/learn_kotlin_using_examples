package pgm1_no_function_condition

/*
 * Program     : pgm1_no_function_condition.kt
 * Author      : Vidyadhar Bendre
 * Date        : 13-September-2024
 *
 * Significance:
 * This program demonstrates a simple conditional check without using functions.
 * It checks if a user is eligible for a discount based on their age.
 *
 * When to Use:
 * - Use this approach for quick and simple checks where functions are not necessary.
 *
 * Note:
 * This code can be run in the Kotlin Playground at https://play.kotlinlang.org/.
 */

fun main() {
    // Define the user's age
    val userAge = 65

    // Check eligibility for discount directly in the main function
    val isEligibleForDiscount = userAge >= 60

    // Print the result
    println("Eligible for discount: $isEligibleForDiscount")
}

/*
 * Output of the program:
 *
 * Eligible for discount: true
 *
 * Explanation:
 * The program defines a variable `userAge` and checks if it is greater than or equal to 60.
 * The result is directly assigned to the variable `isEligibleForDiscount` and printed.
 */
