package pgm6_init_inheritance_demo // Package declaration for organizing the code

/*
 * Program     : pgm6_init_inheritance_demo.kt
 * Author      : Vidyadhar Bendre
 * Date        : 8-September-2024
 *
 * Significance:
 * This program demonstrates the use of the `init` keyword for initializing properties and
 * performing actions when an instance of a class is created. It also shows how to use inheritance
 * to extend functionality.
 * The `init` block is used to initialize the perimeter of a square, and an extended class calculates
 * the area of a circle based on the square's side length.
 *
 * When to Use:
 * - Use the `init` block to perform initialization logic right after the primary constructor is called.
 * - Use inheritance to extend existing functionality or add new features to a class.
 *
 * Note:
 * This code can be run in the Kotlin Playground at https://play.kotlinlang.org/.
 */

// Base class Square with a primary constructor
open class Square(val side: Int) {
    // Init block is used for initialization logic
    init {
        // Print the perimeter of the square (side * 4)
        println("Perimeter of the square: ${side * 4}")
    }
}

// Derived class Circle that extends Square and adds circle functionality
class Circle(side: Int) : Square(side) {
    // Calculate the area of the circle using the radius (which is half of the side length of the square)
    fun calculateArea(): Double {
        val radius = side / 2.0
        return Math.PI * radius * radius
    }
}

// Main function: Entry point of the Kotlin program
fun main() {
    // Creating an instance of Circle with side length 10 (which is also used for square)
    val c = Circle(10)

    // Print the area of the circle
    println("Area of the circle: ${c.calculateArea()}")
}

/*
 * Output of the program:
 *
 * Perimeter of the square: 40
 * Area of the circle: 78.53981633974483
 *
 * Explanation:
 * 1. **Class Declaration**:
 *    - The `Square` class has a primary constructor with a single parameter `side`.
 *    - The `init` block calculates and prints the perimeter of the square.
 *
 * 2. **Inheritance**:
 *    - The `Circle` class extends the `Square` class. It inherits the `side` property and `init` block
 *      functionality from `Square`.
 *    - The `Circle` class adds a method `calculateArea()` to compute the area of the circle using the
 *      radius, which is half of the side length.
 *
 * 3. **Object Creation**:
 *    - When an instance of `Circle` is created with `val c = Circle(10)`, the `init` block from `Square`
 *      is executed, printing the perimeter of the square.
 *    - The `calculateArea()` method is then called to print the area of the circle.
 */
