package pgm3_using_oops_area_perimeter

/*
 * Program     : pgm3_using_oops_area_perimeter.kt
 * Author      : Vidyadhar Bendre
 * Date        : 13-September-2024
 *
 * Significance:
 * This program demonstrates the use of object-oriented programming (OOP) principles to calculate the area and perimeter of a circle.
 * It organizes the calculation logic within a class, following OOP principles for better structure and maintainability.
 *
 * When to Use:
 * - Use this approach when you want to encapsulate the calculation logic within a class for better organization and potential reuse.
 *
 * Note:
 * This code can be run in the Kotlin Playground at https://play.kotlinlang.org/.
 */

// Class to handle circle calculations
class CircleCalculator(private val radius: Double) {
    private val pi = 3.14159

    // Method to calculate the area of the circle
    fun calculateArea(): Double {
        return pi * radius * radius
    }

    // Method to calculate the perimeter of the circle
    fun calculatePerimeter(): Double {
        return 2 * pi * radius
    }
}

// Main function: Entry point of the Kotlin program
fun main() {
    // Create an instance of CircleCalculator with radius 7.5
    val circle = CircleCalculator(7.5)

    // Call methods to calculate area and perimeter
    val area = circle.calculateArea()
    val perimeter = circle.calculatePerimeter()

    // Print the area and perimeter
    println("Area of the circle is........: $area")          // Output will be 176.7144375
    println("Perimeter of the circle is...: $perimeter") // Output will be 47.12385
}

/*
 * Output of the program:
 *
 * Area of the circle is........: 176.7144375
 * Perimeter of the circle is...: 47.12385
 *
 * Explanation:
 * The program defines a class `CircleCalculator` with methods to calculate the area and perimeter of a circle.
 * An instance of `CircleCalculator` is created with the radius `7.5`, and the methods are called to get the area and perimeter.
 * The results are printed.
 */
