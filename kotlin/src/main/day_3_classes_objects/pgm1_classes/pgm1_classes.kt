package pgm1_classes

/*
 * Program     : pgm1_classes.kt
 * Author      : Vidyadhar Bendre
 * Date        : 8-September-2024
 *
 * Significance:
 * This program demonstrates a simple class in Kotlin.
 * The `Person` class contains properties and a method to print details.
 * It serves as an introductory example of creating and using classes in Kotlin.
 *
 * Note:
 * This code can be run in the Kotlin Playground at https://play.kotlinlang.org/.
 */

// Simple class with properties and a method
class Person(val name: String, var age: Int) {
    fun printDetails() {
        println("Name: $name, Age: $age")
    }
}

// Main function: Entry point of the Kotlin program
fun main() {
    val personRefObj = Person("Vidyadhar", 54)
    personRefObj.printDetails()
}

/*
 * Output of the program:
 *
 * Name: Vidyadhar, Age: 54
 *
 */
