package pgm2_using_function

/*
 * Program     : pgm2_using_function.kt
 * Author      : Vidyadhar Bendre
 * Date        : 9-September-2024
 *
 * Significance:
 * This program demonstrates the use of a function to encapsulate the logic of age calculation.
 * Using functions allows for modular code that can be reused and maintained easily.
 */

fun calculateAge(birthYear: Int): Int {
    val currentYear = 2024
    return currentYear - birthYear
}

fun main() {
    val birthYear = 1971
    println("Your age is: ${calculateAge(birthYear)}") // Output will be 53
}
