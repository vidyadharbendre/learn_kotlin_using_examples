package pgm3_extension_function// Package declaration for organizing the code

/*
 * Program     : ExtensionFunctionDemo.kt
 * Author      : Vidyadhar Bendre
 * Date        : 8-September-2024
 *
 * Significance:
 * This program demonstrates extension functions in Kotlin.
 * An extension function `isEven()` is added to the `Int` class to check if a number is even.
 *
 * Detailed Explanation:
 *
 * 1. Package Declaration:
 *    package pgm2c_extensionfunctions: This line declares the package name and is used for organizing classes and functions.
 *    It helps in grouping related classes and avoiding naming conflicts.
 *
 * 2. Program Overview and Significance:
 *    The comment block at the top describes the purpose of the program. It shows that the code demonstrates how to extend
 *    existing classes in Kotlin with new functionality using extension functions. In this example, the `Int` class is
 *    extended with a new function `isEven()` that checks if an integer is even.
 *
 * 3. Extension Function to Check Even Number:
 *    fun Int.isEven(): Boolean = this % 2 == 0
 *
 *    - Extension Function: In Kotlin, an extension function allows you to add new functionality to an existing class without
 *      modifying its source code or using inheritance. The function `isEven()` is defined as an extension of the `Int` class.
 *    - Function Definition: The syntax `fun Int.isEven()` specifies that `isEven()` is an extension of the `Int` class.
 *      The function returns a `Boolean` value.
 *    - Function Logic: The function checks whether the integer (`this`) is divisible by 2, returning `true` if it is,
 *      indicating the number is even, and `false` otherwise.
 *
 * 4. Main Function: Entry Point
 *    fun main() { ... }
 *
 *    - This is the starting point of the Kotlin program. Here, a variable `number` is assigned the value `4`.
 *      The `isEven()` function is then called on this number to check if it is even, and the result is printed.
 *
 * 5. Output Explanation:
 *    When you run this program, it will output:
 *
 *    Is 4 even? true
 *
 *    This output confirms that the extension function `isEven()` correctly identifies the number as even, demonstrating
 *    how to use extension functions to add custom behavior to existing types.
 *
 * Key Remarks on Extension Functions in Kotlin:
 *
 * - Extension Functions: Extension functions allow you to extend existing classes with new functionality without
 *   altering their structure or using inheritance, offering a flexible and powerful way to enhance classes.
 * - Syntax: The syntax `fun ClassName.functionName()` is used to declare an extension function.
 * - Use Cases: Common use cases include adding utility methods to standard library classes or simplifying code by
 *   encapsulating repeated logic within an easily accessible method.
 *
 * Note:
 * This code can be tested and run in the Kotlin Playground at https://play.kotlinlang.org/.
 * Just copy the code into the Playground and run it to see the output.
 */

// Extension function to check if a number is even
fun Int.isEven(): Boolean = this % 2 == 0

// Main function: Entry point of the Kotlin program
fun main() {
    val number = 4
    println("Is $number even? ${number.isEven()}")
}

/*
 * Output of the program:
 *
 * Is 4 even? true
 *
 */
