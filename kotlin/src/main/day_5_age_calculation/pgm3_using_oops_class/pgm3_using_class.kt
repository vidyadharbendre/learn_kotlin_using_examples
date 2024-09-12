package pgm3_using_oops_class

/*
 * Program     : pgm3_using_class.kt
 * Author      : Vidyadhar Bendre
 * Date        : 9-September-2024
 *
 * Significance:
 * This program demonstrates the use of object-oriented programming (OOP) principles to calculate age.
 * The calculation logic is organized within a class, following OOP principles for better structure and maintainability.
 *
 * When to Use:
 * - Use this approach when you want to encapsulate the calculation logic within a class for better organization and potential reuse.
 *
 * Note:
 * This code can be run in the Kotlin Playground at https://play.kotlinlang.org/.
 */

// Class to handle age calculations
class AgeCalculator(private val birthYear: Int, private val currentYear: Int) {

    // Method to calculate the age
    fun calculateAge(): Int {
        return currentYear - birthYear
    }
}

// Main function: Entry point of the Kotlin program
fun main() {
    // Create an instance of AgeCalculator with birth year 1971 and current year 2024
    val ageCalculator = AgeCalculator(1971, 2024)

    // Call the method to calculate the age
    val age = ageCalculator.calculateAge()

    // Print the age
    println("Your age is: $age") // Output will be 53
}

/*
 * Output of the program:
 *
 * Your age is: 53
 *
 * Explanation:
 * The program defines a class `AgeCalculator` with a method to calculate age based on the birth year and current year.
 * An instance of `AgeCalculator` is created with the birth year `1971` and current year `2024`.
 * The method is called to calculate the age, and the result is printed.
 */
