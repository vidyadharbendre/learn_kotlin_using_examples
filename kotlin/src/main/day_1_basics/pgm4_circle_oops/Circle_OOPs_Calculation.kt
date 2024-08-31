package pgm4_circle_oops // Package declaration for organizing the code

/*
 * Author      : Vidyadhar Bendre
 * Date        : 31-August-2024
 * Significance: This program demonstrates the use of Object-Oriented Programming (OOP) in Kotlin
 *               to model a circle with properties and methods. It includes a `Circle` class with
 *               methods to calculate the area and perimeter, update the radius, and print the
 *               circle's parameters. This program highlights the encapsulation of data and functionality
 *               within a class, showcasing the OOP principles in action.
 */

// Circle class to represent a circle with properties and methods
class Circle(private var radius: Int) {

    private val pi = 3.14

    // Method to calculate the area of the circle
    fun calculateArea(): Double {
        return pi * radius * radius
    }

    // Method to calculate the perimeter (circumference) of the circle
    fun calculatePerimeter(): Double {
        return 2 * pi * radius
    }

    // Method to print the circle's parameters
    fun printCircleParameters() {
        val area = calculateArea()
        val perimeter = calculatePerimeter()
        println("Radius of the circle is    : $radius")
        println("Area of the circle         : $area")
        println("Perimeter of the circle is : $perimeter")
    }

    // Method to update the radius of the circle
    fun updateRadius(newRadius: Int) {
        radius = newRadius
    }
}

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

The output of the above program is shown as below:

Radius of the circle is    : 1
Area of the circle         : 3.14
Perimeter of the circle is : 6.28
Radius of the circle is    : 10
Area of the circle         : 314.0
Perimeter of the circle is : 62.800000000000004

 */