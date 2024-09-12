package pgm3_with_oops_condition

/*
 * Program     : pgm3_with_oops_condition.kt
 * Author      : Vidyadhar Bendre
 * Date        : 10-September-2024
 *
 * Significance:
 * This program demonstrates the use of object-oriented programming (OOP) concepts in Kotlin.
 * It defines a class `DiscountEligibility` that encapsulates the logic for checking discount eligibility.
 *
 * When to Use:
 * - Use OOP when you need to encapsulate logic within classes for better structure and potential reuse.
 *
 * Note:
 * This code can be run in the Kotlin Playground at https://play.kotlinlang.org/.
 */

// Class to handle discount eligibility logic
class DiscountEligibility(private val age: Int) {
    // Method to check if the user is eligible for a discount
    fun isEligibleForDiscount(): Boolean {
        return age >= 60 // Seniors are eligible for a discount
    }
}

// Main function: Entry point of the Kotlin program
fun main() {
    // Define the user's age
    val userAge = 65

    // Create an instance of DiscountEligibility
    val eligibilityChecker = DiscountEligibility(userAge)

    // Call the method to check eligibility
    val eligible = eligibilityChecker.isEligibleForDiscount()

    // Print the result
    println("Eligible for discount: $eligible")
}

/*
 * Output of the program:
 *
 * Eligible for discount: true
 *
 * Explanation:
 * The program defines a class `DiscountEligibility` with a method `isEligibleForDiscount`.
 * An instance of `DiscountEligibility` is created with the `userAge`, and the method is called to check eligibility.
 * The result is printed.
 */
