// Declaring the package name for this file, which helps organize the code into different namespaces.
package pgm2_variable_types

/*
 * Program   : VariableTypes.kt
 * Author    : Vidyadhar Bendre
 * Date      : 31st August, 2024
 *
 * Program Significance:
 * This Kotlin program demonstrates the use of variables, variable reassignment, and basic
 * data types like Int and String. It shows how variables can be declared, initialized,
 * and modified, showcasing Kotlin's type inference capabilities. The program initially
 * assigns values to variables and then reassigns new values, highlighting Kotlin's
 * mutability with the 'var' keyword.
 *
 * Note:
 * For those without access to a laptop or computer, you can run this code online using the
 * Kotlin Playground at https://play.kotlinlang.org/. Simply copy and paste the code into
 * the editor and click 'Run' to see the output.
 */

// Main function - the entry point of the Kotlin program where execution begins.
fun main() {
    // Declaring a variable 'age' of type Int and initializing it with the value 5.
    var age = 5

    // Declaring a variable 'name' of type String and initializing it with the value "Kotlin".
    var name = "Kotlin"

    // Printing the initial values of 'name' and 'age' to the console.
    println("Before assigning values - Name......:  $name, Age: $age")

    // Modifying the value of 'age' variable to 6.
    age = 6

    // Modifying the value of 'name' variable to "Android".
    name = "Android"

    // Printing the modified values of 'name' and 'age' to the console.
    println("After assigning new values - Name...: $name, Age: $age")
}

/*
 * Output of the program:
 * Before assigning values - Name......:  Kotlin, Age: 5
 * After assigning new values - Name...: Android, Age: 6
 */
