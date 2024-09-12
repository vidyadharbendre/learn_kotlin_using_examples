package pgm2_using_function_area_perimeter

/*
 * Program     : pgm2_using_function.kt
 * Author      : Vidyadhar Bendre
 * Date        : 10-September-2024
 *
 * Significance:
 * This program uses functions to calculate the area and perimeter of a circle.
 * Functions allow code reusability and modularity, making it easier to maintain and understand.
 */

// Function to calculate the area of a circle
fun calculateCircleArea(radius: Double): Double {
    val pi = 3.14159
    return pi * radius * radius
}

// Function to calculate the perimeter of a circle
fun calculateCirclePerimeter(radius: Double): Double {
    val pi = 3.14159
    return 2 * pi * radius
}

fun main() {
    val radius = 7.5
    println("Area of the circle is........: ${calculateCircleArea(radius)}")          // Output will be 176.7144375
    println("Perimeter of the circle is...: ${calculateCirclePerimeter(radius)}") // Output will be 47.12385
}
