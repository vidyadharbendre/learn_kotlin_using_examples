package pgm4_data_class// Package declaration for organizing the code

/*
 * Program     : DataClassDemo.kt
 * Author      : Vidyadhar Bendre
 * Date        : 8-September-2024
 *
 * Significance:
 * This program demonstrates the use of data classes in Kotlin.
 * Data classes automatically provide useful methods such as `toString()`, `equals()`, `hashCode()`, and `copy()`,
 * making it easy to handle data objects without writing repetitive boilerplate code.
 *
 * Detailed Explanation:
 *
 * 1. Package Declaration:
 *    package pgm2d_specialclasses: This line declares the package name and is used for organizing classes and functions.
 *    Packages help in grouping related classes and functions, providing a structured way to manage code, and avoiding
 *    naming conflicts within a project.
 *
 * 2. Program Overview and Significance:
 *    The comment block at the top describes the purpose of the program. This code demonstrates the use of data classes
 *    in Kotlin, which are specialized classes primarily used for holding data. Data classes automatically generate
 *    essential methods, reducing the need for manual code to handle common tasks like string representation, equality
 *    checks, and copying.
 *
 * 3. Data Class: User
 *    data class User(val name: String, val age: Int)
 *
 *    - Data Class: A data class is designed to hold data with minimal boilerplate code. It automatically provides several
 *      methods, making it easier to work with instances of the class.
 *    - Properties: The `User` class has two properties, `name` and `age`, both defined in the primary constructor. These
 *      properties are automatically included in the class's methods like `toString()` and `equals()`.
 *    - Automatically Generated Methods:
 *      - `toString()`: Provides a string representation of the object, including property names and values.
 *      - `equals()`: Compares objects based on property values, simplifying equality checks.
 *      - `hashCode()`: Generates a hash code based on property values, useful for sets, maps, and other collections.
 *      - `copy()`: Creates a copy of the object, optionally modifying some properties, allowing for easy cloning and
 *        modification without altering the original.
 *
 * 4. Main Function: Entry Point
 *    fun main() { ... }
 *
 *    - This is the starting point of the Kotlin program. Inside the main function, an instance of the `User` class
 *      is created with the name "Alice" and age 25. The `println(user)` statement uses the automatically generated
 *      `toString()` method to print the user object, showing its properties in a readable format.
 *
 * 5. Output Explanation:
 *    When you run this program, it will output:
 *
 *    User(name=Alice, age=25)
 *
 *    This output shows the default string representation of the `User` data class, which includes the class name
 *    and its properties, demonstrating the simplicity and effectiveness of data classes in managing data.
 *
 * Key Remarks on Data Classes in Kotlin:
 *
 * - Purpose: Data classes are mainly used to hold data in a concise and readable manner, providing useful methods
 *   out-of-the-box without needing extra code.
 * - Primary Constructor: At least one parameter is required in the primary constructor of a data class.
 * - Method Generation: Data classes automatically provide key methods (`toString()`, `equals()`, `hashCode()`, `copy()`)
 *   that make handling data easier and less error-prone.
 * - Immutability: Properties defined with `val` in data classes are immutable, ensuring that once set, they cannot be changed,
 *   promoting safer and more predictable code.
 *
 * Note:
 * This code can be tested and run in the Kotlin Playground at https://play.kotlinlang.org/.
 * Copy the code into the Playground to see the output and explore the behavior of data classes.
 */

// Data class with properties
data class User(val name: String, val age: Int)

// Main function: Entry point of the Kotlin program
fun main() {
    val user = User("Vidyadhar", 52)
    println(user)
}

/*
 * Output of the program:
 *
 * User(name=Vidyadhar, age=52)
 *
 */
