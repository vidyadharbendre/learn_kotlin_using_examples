package pgm2_single_parameter // Package declaration for organizing the code

/*
 * Program     : pgm1_single_parameter.kt
 * Author      : Vidyadhar Bendre
 * Date        : 9-September-2024
 *
 * Significance:
 * This program demonstrates the use of a class with a single parameter in Kotlin.
 * The class includes a constructor parameter and a property initialized with that parameter.
 *
 * When to Use:
 * - Use a class with parameters when you need to initialize objects with specific values.
 * - This approach is useful for setting up initial states or configurations for an object.
 *
 * Note:
 * This code can be run in the Kotlin Playground at https://play.kotlinlang.org/.
 */

// Class with a single parameter
class B(val x: Int) {
    // Property x is initialized via the constructor parameter
    // The primary constructor takes a parameter `x` and assigns it to the property `x`.
}

// Main function: Entry point of the Kotlin program
fun main() {
    // Declare the reference variable for Class B
    // The variable `bb` of type `B` is declared but not yet initialized.
    var bb: B
    // Initialize the reference variable `bb`
    // An instance of `B` is created with the parameter value `12` and assigned to `bb`.
    bb = B(12)


    // Creating an instance of Class B with parameter value 21 directly in a single line
    // Here, `cc` is created and initialized with `x` set to 21.
    val cc = B(21)



    // Printing the properties `x` of both instances `bb` and `cc`
    // Since `x` was initialized through the constructor, it will print the respective values.
    println(bb.x) // Output will be 12
    println(cc.x) // Output will be 21
}

/*
 * Output of the program:
 *
 * 12
 * 21
 *
 * Explanation:
 * The program defines a class `B` with a single property `x` initialized via a constructor parameter.
 * An instance of `B` is created using `var`, first declaring `bb` and then initializing it with the value `12` for `x`.
 * Another instance, `cc`, is created in a single line with the value `21` for `x`.
 * The values of the property `x` for both instances are printed.
 *
 * Detailed Explanation:
 * 1. **Class Declaration**:
 *    - The class `B` has a primary constructor with a single parameter `x` of type `Int`.
 *    - The parameter `x` is automatically assigned to a property `x` because it is prefixed with `val`.
 *
 * 2. **Object Creation**:
 *    - `var bb: B` declares a reference variable of type `B`.
 *    - `bb = B(12)` creates a new instance of `B` with the value `12` for the property `x` and assigns it to `bb`.
 *    - `val cc = B(21)` creates and initializes another instance of `B` with the value `21` for `x` in a single line.
 *
 * 3. **Usage**:
 *    - `println(bb.x)` accesses the property `x` of the object `bb` and prints its value, which is `12`.
 *    - `println(cc.x)` accesses the property `x` of the object `cc` and prints its value, which is `21`.
 */
