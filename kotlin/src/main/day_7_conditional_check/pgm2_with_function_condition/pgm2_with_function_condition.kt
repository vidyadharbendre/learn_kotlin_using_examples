package pgm2_with_function_condition

/*
 * Program     : pgm2_with_function_condition.kt
 * Author      : Vidyadhar Bendre
 * Date        : 13-September-2024
 *
 * Significance:
 * This program demonstrates the use of a function to encapsulate the logic of checking eligibility for a discount.
 * The function `isEligibleForDiscount` is used to determine if the user qualifies based on their age.
 *
 * When to Use:
 * - Use functions when you want to encapsulate logic for reuse or better organization.
 *
 * Note:
 * This code can be run in the Kotlin Playground at https://play.kotlinlang.org/.
 */

// Function to check if the user is eligible for a discount
fun isEligibleForDiscount(age: Int): Boolean {
    return age >= 60 // Seniors are eligible for a discount
}

// Main function: Entry point of the Kotlin program
fun main() {
    // Define the user's age
    val userAge = 65

    // Call the function to check eligibility
    val eligible = isEligibleForDiscount(userAge)

    // Print the result
    println("Eligible for discount: $eligible")
}

/*
 * Output of the program:
 *
 * Eligible for discount: true
 *
 * Explanation:
 * The program defines a function `isEligibleForDiscount` that returns a boolean based on age.
 * The function is called with the `userAge`, and the result is printed.
 */
