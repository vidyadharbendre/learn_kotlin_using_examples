package pgm1_using_without_function_area_perimeter

/*
 * Program     : pgm1_using_without_function.kt
 * Author      : Vidyadhar Bendre
 * Date        : 10-September-2024
 *
 * Significance:
 * This program calculates the area and perimeter of a circle without using functions.
 * The calculations are done directly within the `main` function.
 *
 * When to Use:
 * - Use this approach for simple tasks where encapsulation into functions or classes is not required.
 *
 * Note:
 * This code can be run in the Kotlin Playground at https://play.kotlinlang.org/.
 */

fun main() {
    // Define the radius of the circle
    val radius = 7.5
    val pi = 3.14159

    // Calculate the area of the circle
    val area = pi * radius * radius

    // Calculate the perimeter of the circle
    val perimeter = 2 * pi * radius

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
 * The program calculates the area and perimeter of a circle using the given radius directly in the `main` function.
 * It prints the computed values for area and perimeter.
 */
