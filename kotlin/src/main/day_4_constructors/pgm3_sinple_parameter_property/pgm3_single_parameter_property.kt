package pgm3_simple_parameter_property // Package declaration for organizing the code

/*
 * Program     : pgm3_simple_parameter_property.kt
 * Author      : Vidyadhar Bendre
 * Date        : 9-September-2024
 *
 * Significance:
 * This program demonstrates the use of classes with parameters.
 * Class B shows a parameter that is not marked with `var` or `val`,
 * making it accessible only within the constructor.
 * Class C shows a parameter marked with `val`, making it a property of the class accessible outside the constructor.
 *
 * When to Use:
 * - Use the approach in Class B when the parameter is needed only for computations or initialization within the constructor.
 * - Use the approach in Class C when the parameter needs to be stored as a property for later use throughout the class.
 *
 * Note:
 * This code can be run in the Kotlin Playground at https://play.kotlinlang.org/.
 */

// Class B with a single parameter not marked with `var` or `val`
class B(x: Int) {
    init {
        // The parameter `x` is only accessible within the constructor scope
        println("x inside constructor B: $x") // `x` is accessible here within the init block
    }

    // Uncommenting the following line will cause an error because `x` is not a class property
    // fun printX() = println(x) // Error: Unresolved reference: x
}

// Class C with a parameter marked as `val`, making it a class property
class C(val x: Int) {
    init {
        // `x` can be used inside the constructor, just like in Class B
        println("x inside constructor C: $x") // `x` is accessible here within the init block
        println("writing inside constructor C")
    }

    // A method that can access the property `x` since it's a class property
    fun printX() {
        println("x outside the constructor C: $x") // `x` is accessible outside the constructor
    }
}

// Main function: Entry point of the Kotlin program
fun main() {
    // Creating an instance of Class B with the parameter value 12
    // The value of `x` is printed within the constructor, but `x` is not retained as a class property.
    val bb = B(12)  // Prints: x inside constructor: 12

    // Creating another instance of Class B with a different parameter value 21
    // Again, the parameter `x` is printed inside the constructor, and is not accessible outside of it.
    var cc: B
    cc = B(21)  // Prints: x inside constructor: 21

    // Creating an instance of Class C with the parameter value 100
    val dd = C(100)  // Prints: x inside constructor: 100 and "writing inside constructor"
    dd.printX() // Prints: x outside the constructor: 100
}

/*
 * Output of the program:
 *
 * x inside constructor: 12
 * x inside constructor: 21
 * x inside constructor: 100
 * writing inside constructor
 * x outside the constructor: 100
 *
 * Explanation:
 * The program defines two classes, `B` and `C`, demonstrating different uses of parameters in Kotlin classes.
 *
 * Detailed Explanation:
 * 1. **Class B Declaration**:
 *    - The class `B` has a primary constructor with a parameter `x` of type `Int`.
 *    - The parameter `x` is not marked with `var` or `val`, so it only exists within the constructor’s scope.
 *
 * 2. **Constructor Usage in Class B**:
 *    - Inside the `init` block, `x` is accessible and can be used for computations or printed.
 *    - `x` is not stored as a class property, so attempting to access it elsewhere in the class will result in a compiler error.
 *
 * 3. **Class C Declaration**:
 *    - The class `C` h
*/