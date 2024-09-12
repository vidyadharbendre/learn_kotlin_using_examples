package pgm7_multiple_constructor_demo // Package declaration for organizing the code

/*
 * Program     : CircleConstructorDemo.kt
 * Author      : Vidyadhar Bendre
 * Date        : 9-September-2024
 *
 * Significance:
 * This program demonstrates the use of multiple constructors in Kotlin to initialize a class with
 * different types of parameters. The `Circle` class includes primary and secondary constructors,
 * and uses the `init` block to calculate and display the area of the circle.
 *
 * When to Use:
 * - Use multiple constructors when you need to create instances of a class using different types
 *   or numbers of parameters.
 * - The `init` block is useful for performing actions immediately after an instance is created.
 *
 * Note:
 * This code can be run in the Kotlin Playground at https://play.kotlinlang.org/.
 */

// Class Circle with a primary constructor and secondary constructors
class Circle(val radius: Double) {
    // Secondary constructor that initializes the radius with a default value
    constructor(name: String) : this(1.0)

    // Secondary constructor that initializes the radius based on the diameter
    constructor(diameter: Int) : this(diameter / 2.0) {
        // Print message when using the diameter constructor
        println("In diameter constructor")
        println("Diameter...: $diameter")
    }

    // Init block: Executes after the primary constructor
    init {
        // Calculate and print the area of the circle

        println("radius.....: $radius")
        println("Area.......: ${Math.PI * radius * radius}")
    }
}

// Main function: Entry point of the Kotlin program
fun main() {
    // Creating an instance of Circle using the diameter constructor
    val c = Circle(3)
}

/*
 * Output of the program:
 *
 * In diameter constructor
 * Area: 7.0685834705770345
 *
 * Explanation:
 * 1. **Class Declaration**:
 *    - The `Circle` class has a primary constructor that initializes the `radius` property.
 *    - There are two secondary constructors:
 *      - One initializes the radius with a default value of `1.0` when a `String` is passed.
 *      - The other initializes the radius based on the diameter passed as an `Int` and prints a message.
 *
 * 2. **Initialization**:
 *    - The `init` block calculates and prints the area of the circle using the formula `π * radius^2`.
 *
 * 3. **Object Creation**:
 *    - `val c = Circle(3)` creates an instance of `Circle` using the diameter constructor. The radius is set to `3 / 2.0 = 1.5`.
 *    - The constructor prints "In diameter constructor", and the `init` block prints the area of the circle.
 */
