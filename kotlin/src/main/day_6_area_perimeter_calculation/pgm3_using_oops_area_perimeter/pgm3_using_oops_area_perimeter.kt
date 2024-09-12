package pgm3_using_oops_area_perimeter

/*
 * Program     : pgm3_using_oops.kt
 * Author      : Vidyadhar Bendre
 * Date        : 10-September-2024
 *
 * Significance:
 * This program demonstrates the use of object-oriented programming (OOP) to calculate the area and perimeter of a circle.
 * It organizes the calculation logic within a class, following OOP principles for better structure and maintainability.
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

fun main() {
    // Creating an instance of CircleCalculator with radius 7.5
    val circle = CircleCalculator(7.5)

    // Printing the area and perimeter of the circle
    println("Area of the circle is........: ${circle.calculateArea()}")          // Output will be 176.7144375
    println("Perimeter of the circle is...: ${circle.calculatePerimeter()}") // Output will be 47.12385
}
