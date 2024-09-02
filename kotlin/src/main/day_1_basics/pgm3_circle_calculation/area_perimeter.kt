// Package declaration for organizing the code
package pgm3_circle_calculation

/*
 * Program   : CircleCalculation.kt
 * Author    : Vidyadhar Bendre
 * Date      : 31st August, 2024
 *
 * Program Significance:
 * This program demonstrates basic calculations involving circles. It includes functions
 * to calculate the area and perimeter of a circle and print the parameters. This serves
 * as an example of function usage in Kotlin and shows how functions can be used to
 * perform calculations and output results in a structured way.
 *
 * Note:
 * For those without access to a laptop or computer, you can run this code online using the
 * Kotlin Playground at https://play.kotlinlang.org/. Simply copy and paste the code into
 * the editor and click 'Run' to see the output.
 */

// Function to print the radius, area, and perimeter of the circle
fun printCircleParameters(radius: Int, area: Double, perimeter: Double) {
    // Prints the radius of the circle
    println("Radius of the circle is    : $radius")

    // Prints the calculated area of the circle
    println("Area of the circle         : $area")

    // Prints the calculated perimeter of the circle
    println("Perimeter of the circle is : $perimeter")
}

// Function to calculate the area of the circle based on the given radius
fun calculateArea(radius: Int): Double {
    val pi = 3.14  // Constant value of pi used for calculations
    return pi * radius * radius  // Formula to calculate the area of the circle
}

// Main function: Entry point of the program
fun main() {
    val pi = 3.14  // Constant value of pi
    var radius = 1 // Initial radius of the circle

    // Calculate area and perimeter for the initial radius
    var area = calculateArea(radius)     // Calls calculateArea function to find the area
    var perimeter = 2 * pi * radius      // Calculates the perimeter using the formula

    // Print the circle parameters for the initial radius
    printCircleParameters(radius, area, perimeter)

    // Update radius and recalculate area and perimeter
    radius = 10                          // Changes the radius to 10
    area = calculateArea(radius)         // Recalculates the area for the new radius
    perimeter = 2 * pi * radius          // Recalculates the perimeter for the new radius

    // Print the circle parameters for the updated radius
    printCircleParameters(radius, area, perimeter)
}

/*
 * Output of the program:
 * Radius of the circle is    : 1
 * Area of the circle         : 3.14
 * Perimeter of the circle is : 6.28
 * Radius of the circle is    : 10
 * Area of the circle         : 314.0
 * Perimeter of the circle is : 62.800000000000004
 */
