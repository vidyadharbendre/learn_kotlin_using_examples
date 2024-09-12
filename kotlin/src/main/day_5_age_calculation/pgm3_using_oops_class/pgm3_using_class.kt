package pgm3_using_oops_class

/*
 * Program     : pgm3_using_oops.kt
 * Author      : Vidyadhar Bendre
 * Date        : 9-September-2024
 *
 * Significance:
 * This program demonstrates the use of classes and methods to encapsulate data and behavior.
 * The approach follows object-oriented principles, enhancing code organization, reusability, and maintainability.
 */

class AgeCalculator(private val birthYear: Int) {
    fun calculateAge(): Int {
        val currentYear = 2024
        return currentYear - birthYear
    }
}

fun main() {
    val person = AgeCalculator(1971)
    println("Your age is: ${person.calculateAge()}") // Output will be 53
}
