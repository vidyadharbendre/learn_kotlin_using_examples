package pgm2_using_function_area_perimeter

/*
 * Program     : pgm2_using_function.kt
 * Author      : Vidyadhar Bendre
 * Date        : 13-September-2024
 *
 * Significance:
 * This program demonstrates the use of functions to calculate the area and perimeter of a circle.
 * The calculations are encapsulated within functions for better modularity and reuse.
 *
 * When to Use:
 * - Use this approach when you want to encapsulate logic in functions for better organization and potential reuse.
 *
 * Note:
 * This code can be run in the Kotlin Playground at https://play.kotlinlang.org/.
 */

// Function to calculate the area of the circle
fun calculateCircleArea(radius: Double): Double {
    val pi = 3.14159
    return pi * radius * radius
}

// Function to calculate the perimeter of the circle
fun calculateCirclePerimeter(radius: Double): Double {
    val pi = 3.14159
    return 2 * pi * radius
}

// Main function: Entry point of the Kotlin program
fun main() {
    // Define the radius of the circle
    val radius = 7.5

    // Call functions to calculate area and perimeter
    val area = calculateCircleArea(radius)
    val perimeter = calculateCirclePerimeter(radius)

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
 * The program defines functions to calculate the area and perimeter of a circle.
 * These functions are called with the given radius, and the results are printed.
 */
