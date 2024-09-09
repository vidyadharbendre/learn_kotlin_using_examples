package pgm2d_specialclasses // Package declaration for organizing the code

/*
 * Program     : EnumClassDemo.kt
 * Author      : Vidyadhar Bendre
 * Date        : 9-September-2024
 *
 * Significance:
 * This program demonstrates the use of enum classes in Kotlin.
 * Enum classes are useful for representing a fixed set of constants. They allow you to define a type with a set
 * of predefined values, making it easier to work with a specific set of options and ensuring type safety.
 *
 * In this example:
 * - `Direction` is an enum class that represents the four cardinal directions: NORTH, SOUTH, EAST, and WEST.
 * - The `main` function demonstrates how to iterate over all possible values of the enum class and print each one.
 *
 * Note:
 * This code can be run in the Kotlin Playground at https://play.kotlinlang.org/.
 */

// Enum class for directions
enum class Direction {
    NORTH, SOUTH, EAST, WEST
}

// Main function: Entry point of the Kotlin program
fun main() {
    // Print individual direction
    val direction = Direction.NORTH
    println("Direction: $direction")

    // Print all directions
    println("All directions:")
    for (dir in Direction.values()) {
        println(dir)
    }
}

/*
 * Output of the program:
 *
 * Direction: NORTH
 * All directions:
 * NORTH
 * SOUTH
 * EAST
 * WEST
 *
 * Explanation:
 * - The program first prints the value of the `direction` variable, which is `NORTH`.
 * - Then, it uses the `Direction.values()` method to get an array of all constants defined in the `Direction` enum class.
 * - A `for` loop iterates over this array, printing each constant one by one.
 * - As a result, all directions are printed: NORTH, SOUTH, EAST, and WEST.
 *
 */
