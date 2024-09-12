package pgm1_using_without_function_area_perimeter

/*
 * Program     : pgm1_without_function.kt
 * Author      : Vidyadhar Bendre
 * Date        : 10-September-2024
 *
 * Significance:
 * This program calculates the area and perimeter of a circle directly in the main function without using functions or classes.
 * It is a basic approach suitable for straightforward calculations.
 */

fun main() {
    val radius = 7.5
    val pi = 3.14159

    // Calculating the area of the circle
    val area = pi * radius * radius
    // Calculating the perimeter of the circle
    val perimeter = 2 * pi * radius

    println("Area of the circle is........: $area")         // Output will be 176.7144375
    println("Perimeter of the circle is...: $perimeter") // Output will be 47.12385
}
