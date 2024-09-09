package pgm5_init_block_demo // Package declaration for organizing the code

/*
 * Program     : pgm5_init_block_demo.kt
 * Author      : Vidyadhar Bendre
 * Date        : 9-September-2024
 *
 * Significance:
 * This program demonstrates the use of the `init` keyword in Kotlin to initialize properties and
 * perform actions when an instance of a class is created.
 * The `init` block is executed immediately after the primary constructor is called.
 *
 * When to Use:
 * - Use the `init` block when you need to perform some initialization logic or validations on
 *   class properties as soon as an instance is created.
 * - Useful for setting up initial states or performing actions that depend on the properties
 *   of the class.
 *
 * Note:
 * This code can be run in the Kotlin Playground at https://play.kotlinlang.org/.
 */

// Class Square with a primary constructor
class Square(val side: Int) {
    // Init block is used for initialization logic
    init {
        // Print the perimeter of the square (side * 4)
        println("Perimeter of the square: ${side * 4}")
    }
}

// Main function: Entry point of the Kotlin program
fun main() {
    // Creating an instance of Square with side length 10
    val s = Square(10)

    // The perimeter will be printed automatically due to the init block
}

/*
 * Output of the program:
 *
 * Perimeter of the square: 40
 *
 * Explanation:
 * 1. **Class Declaration**:
 *    - The `Square` class has a primary constructor with a single parameter `side`.
 *    - The `init` block is used to perform initialization tasks or computations right after
 *      the primary constructor is invoked.
 *
 * 2. **Init Block**:
 *    - In the `init` block, the perimeter of the square is calculated using the formula `side * 4`
 *      and printed to the console.
 *
 * 3. **Object Creation**:
 *    - When an instance of `Square` is created with `val s = Square(10)`, the `init` block
 *      is executed, and the perimeter is printed as `40`.
 */
