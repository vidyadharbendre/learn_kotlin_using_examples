// Package declaration for organizing the code
package pgm3a_circle_oops

/*
 * Program   : CircleOOPs.kt
 * Author    : Vidyadhar Bendre
 * Date      : 31st August, 2024
 *
 * Program Significance:
 * This program demonstrates the use of Object-Oriented Programming (OOP) in Kotlin to model a circle
 * with properties and methods. It includes a `Circle` class with methods to calculate the area and 
 * perimeter, update the radius, and print the circle's parameters. This program highlights the 
 * encapsulation of data and functionality within a class, showcasing the OOP principles in action.
 * 
 * Note:
 * For those without access to a laptop or computer, you can run this code online using the
 * Kotlin Playground at https://play.kotlinlang.org/. Simply copy and paste the code into
 * the editor and click 'Run' to see the output.
 */

// Circle class to represent a circle with properties and methods
class Circle(private var radius: Int) {

    private val pi = 3.14 // Constant value of pi

    // Method to calculate the area of the circle
    fun calculateArea(): Double {
        // Formula to calculate the area of the circle
        return pi * radius * radius
    }

    // Method to calculate the perimeter (circumference) of the circle
    fun calculatePerimeter(): Double {
        // Formula to calculate the perimeter of the circle
        return 2 * pi * radius
    }

    // Method to print the circle's parameters
    fun printCircleParameters() {
        val area = calculateArea()         // Calculates the area using calculateArea() method
        val perimeter = calculatePerimeter() // Calculates the perimeter using calculatePerimeter() method
        println("Radius of the circle is    : $radius") // Prints the radius of the circle
        println("Area of the circle         : $area")   // Prints the calculated area of the circle
        println("Perimeter of the circle is : $perimeter") // Prints the calculated perimeter of the circle
    }

    // Method to update the radius of the circle
    fun updateRadius(newRadius: Int) {
        radius = newRadius // Updates the circle's radius with the new value
    }
}

// Main function: Entry point of the program
fun main() {
    // Create a Circle object with an initial radius of 1
    val circle = Circle(1)

    // Print initial circle parameters
    circle.printCircleParameters()

    // Update the radius to 10 and print the updated parameters
    circle.updateRadius(10)
    circle.printCircleParameters()
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
