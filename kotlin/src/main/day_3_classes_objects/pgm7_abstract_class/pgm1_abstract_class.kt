package pgm7_abstract_class // Package declaration for organizing the code

/*
 * Program     : AbstractClassDemo.kt
 * Author      : Vidyadhar Bendre
 * Date        : 9-September-2024
 *
 * Significance:
 * This program demonstrates the use of abstract classes in Kotlin.
 * Abstract classes provide a way to define base functionality for subclasses. In this example,
 * the abstract class `Shape` defines a method `area()` that must be implemented by any subclass.
 *
 * Note:
 * This code can be run in the Kotlin Playground at https://play.kotlinlang.org/.
 */

// Abstract class with an abstract method
abstract class Shape {
    // Abstract method to be implemented by subclasses
    abstract fun area(): Double
}

// Derived class implementing the abstract method
class Circle(val radius: Double) : Shape() {
    // Implementation of the abstract method from Shape class
    override fun area(): Double = Math.PI * radius * radius
}

// Main function: Entry point of the Kotlin program
fun main() {
    // Create an instance of Circle with a radius of 5.0
    val circle = Circle(5.0)

    // Print the area of the circle using the implemented area method
    println("Area of circle: ${circle.area()}")
}

/*
 * Output of the program:
 *
 * Area of circle: 78.53981633974483
 *
 * Explanation:
 * The program defines an abstract class `Shape` with an abstract method `area()`.
 * The `Circle` class extends `Shape` and provides a concrete implementation for the `area()` method.
 * In the `main()` function, a `Circle` object is created and its area is calculated and printed.
 * The output confirms that the `Circle` class correctly implements the abstract method from `Shape`.
 *
 */
