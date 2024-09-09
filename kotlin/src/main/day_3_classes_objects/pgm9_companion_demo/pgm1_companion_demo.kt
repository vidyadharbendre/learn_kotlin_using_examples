package pgm9_companion_demo  // Package declaration for organizing the code

/*
 * Program     : pgm1_companion_demo.kt
 * Author      : Vidyadhar Bendre
 * Date        : 9-September-2024
 *
 * Significance:
 * This program demonstrates the use of companion objects in Kotlin.
 * Companion objects are used to define static methods and properties within a class.
 * They provide a way to access class-level functionality that is not tied to any specific instance.
 *
 * When to use Companion Objects:
 * - Use companion objects to define methods and properties that are related to a class but
 *   do not require an instance of that class to be accessed. This is similar to static members
 *   in other programming languages like Java.
 * - Companion objects are useful for creating factory methods, utility functions, and constants
 *   that are logically associated with a class.
 * - They allow you to keep related functionality together with the class it is associated with,
 *   promoting better organization and encapsulation.
 *
 * Note:
 * This code can be run in the Kotlin Playground at https://play.kotlinlang.org/.
 */

// Class with a companion object
class MathUtils {
    companion object {
        // Static method to add two integers
        fun add(a: Int, b: Int): Int = a + b
    }
}

// Main function: Entry point of the Kotlin program
fun main() {
    // Calling the static method 'add' from the companion object of MathUtils
    println("Sum: ${MathUtils.add(5, 10)}")
}

/*
 * Output of the program:
 *
 * Sum: 15
 *
 * Explanation:
 * The program defines a class `MathUtils` with a companion object. The companion object contains
 * a static method `add` that adds two integers. In the `main()` function, the `add` method is
 * called using the class name `MathUtils`, and the result is printed to the console. The use of
 * the companion object allows the `add` method to be accessed without creating an instance of
 * `MathUtils`.
 *
 */
