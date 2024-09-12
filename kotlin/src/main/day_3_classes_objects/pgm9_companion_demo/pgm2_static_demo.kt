package pgm9_companion_demo // Package declaration for organizing the code

/*
 * Program     : pgm2_static_demo.kt
 * Author      : Vidyadhar Bendre
 * Date        : 8-September-2024
 *
 * Significance:
 * This program demonstrates the use of companion objects in Kotlin.
 * Companion objects are used to define static methods and properties within a class.
 * They allow for the creation of constants and utility methods that can be accessed
 * without creating an instance of the class.
 *
 * When to Use:
 * - Use companion objects when you need to define constants or utility methods
 *   that are related to the class but do not require an instance of the class.
 * - They are useful for defining constants that should be shared across all instances
 *   of the class and for methods that provide utility functions related to the class.
 *
 * Note:
 * This code can be run in the Kotlin Playground at https://play.kotlinlang.org/.
 */

// Class with a companion object
class PhysicsSystem {
    // Companion object for defining static constants and methods
    companion object WorldConstants {
        // Constant for gravitational acceleration
        val gravity = 9.8

        // Constant for the unit of measurement
        val unit = "metric"

        // Static method to compute force based on mass and acceleration
        fun computeForce(mass: Double, accel: Double): Double {
            return mass * accel
        }
    }
}

// Main function: Entry point of the Kotlin program
fun main() {
    // Accessing constant 'gravity' from the companion object
    println("Gravity: ${PhysicsSystem.WorldConstants.gravity}")

    // Calling static method 'computeForce' from the companion object
    println("Force: ${PhysicsSystem.WorldConstants.computeForce(10.0, 10.0)}")
}

/*
 * Output of the program:
 *
 * Gravity: 9.8
 * Force: 100.0
 *
 * Explanation:
 * The program defines a class `PhysicsSystem` with a companion object named `WorldConstants`.
 * This companion object contains:
 * - A constant `gravity` representing the acceleration due to gravity.
 * - A constant `unit` representing the unit of measurement.
 * - A static method `computeForce` that calculates force using the formula `mass * acceleration`.
 *
 * In the `main()` function:
 * - `PhysicsSystem.WorldConstants.gravity` accesses the `gravity` constant.
 * - `PhysicsSystem.WorldConstants.computeForce(10.0, 10.0)` calls the `computeForce` method
 *   to compute the force based on the given mass and acceleration, and prints the result.
 *
 */
