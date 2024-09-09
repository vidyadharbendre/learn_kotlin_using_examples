package pgm1_class_without_parameters

/*
 * Program     : pgm0_without_parameters_var.kt
 * Author      : Vidyadhar Bendre
 * Date        : 9-September-2024
 *
 * Significance:
 * This program demonstrates the use of a simple class without parameters in Kotlin.
 * The class is designed to represent a basic entity with no properties or parameters.
 *
 * When to Use:
 * - Use a class without parameters when you need to represent an entity or concept that does not require
 *   any initial values or attributes.
 * - Ideal for encapsulating behavior or functionality that does not depend on any specific state.
 *
 * Note:
 * This code can be run in the Kotlin Playground at https://play.kotlinlang.org/.
 */

class pgm0_without_parameters_var {
    // Class body can be empty or include methods and properties
    // Class without parameters
}

// Main function: Entry point of the Kotlin program
fun main() {
    // Declare the reference variable
    // The variable 'aa' of type 'pgm1_without_parameters' is declared but not yet initialized.
    var refObj: pgm0_without_parameters_var

    // Initialize the reference variable
    // An instance of 'pgm1_without_parameters' is created and assigned to 'aa'.
    refObj = pgm0_without_parameters_var()

    // Since Class pgm1_without_parameters has no properties or methods, nothing specific to print or demonstrate here
    println("Instance of pgm0_without_parameters_var created successfully & also splitting object creation with var datatype.")
}

/*
 * Output of the program:
 *
 * Instance of pgm0_without_parameters_var created successfully.
 *
 * Explanation:
 * The program defines a class `pgm0_without_parameters_var` with no properties or methods.
 * An instance of `pgm0_without_parameters_var` is created in the `main()` function using `var`, and a message is printed to indicate successful creation.
 *
 * Detailed Explanation:
 * 1. **Declaration**:
 *    - `var aa: pgm0_without_parameters_var` declares a mutable variable `refObj` of type `pgm1_without_parameters`.
 *      At this point, `refObj` is not yet initialized and can be assigned a new value later.
 *
 * 2. **Initialization**:
 *    - `refObj = pgm1_without_parameters()` creates a new instance of `pgm0_without_parameters_var` and assigns it to `refObj`.
 *      This initializes the variable with an actual object of the class.
 *
 * 3. **Usage**:
 *    - `println("Instance of pgm0_without_parameters_var created successfully.")` prints a confirmation message.
 *      This confirms that the instance was created successfully.
 */
