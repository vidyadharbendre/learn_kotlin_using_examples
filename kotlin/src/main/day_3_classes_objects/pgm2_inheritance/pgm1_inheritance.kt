package pgm1_inheritance // Package declaration for organizing the code

/*
 * Program     : pgm1_inheritance.kt
 * Author      : Vidyadhar Bendre
 * Date        : 8-September-2024
 *
 * Significance:
 * This program demonstrates inheritance in Kotlin.
 * The `Animal` class is inherited by the `Dog` class, showing basic inheritance.
 *
 * Detailed Explanation:
 *
 * 1. Package Declaration:
 *    package pgm2_inheritance: This line declares the package name and is used for organizing classes and functions.
 *    It helps in grouping related classes and avoiding naming conflicts.
 *
 * 2. Program Overview and Significance:
 *    The comment block at the top describes the purpose of the program. It shows that the code demonstrates inheritance
 *    in Kotlin using a simple example where the `Dog` class inherits from the `Animal` class.
 *
 * 3. Base Class: Animal
 *    open class Animal(val name: String) { ... }
 *
 *    - open Keyword: The `open` keyword is crucial here. In Kotlin, classes and methods are final (non-inheritable)
 *      by default. The `open` keyword allows the class `Animal` to be inherited by other classes.
 *    - Constructor: The `Animal` class has a primary constructor that takes a `name` parameter, which is set as a property
 *      of the class.
 *    - Method sound(): This method is marked with `open`, meaning it can be overridden by subclasses. It prints a generic
 *      message, "Animal sound."
 *
 * 4. Derived Class: Dog
 *    class Dog(name: String) : Animal(name) { ... }
 *
 *    - Inheritance: The `Dog` class extends the `Animal` class using the syntax `: Animal(name)`, which calls the constructor
 *      of the base class `Animal` and passes the `name` argument.
 *    - Overriding Method:
 *      override fun sound() { ... }
 *
 *      - The `override` keyword indicates that this method is providing a new implementation for the `sound()` method defined
 *        in the `Animal` class. Instead of printing "Animal sound," it prints a message that includes the dog's name,
 *        e.g., "Buddy says: Woof!"
 *
 * 5. Main Function: Entry Point
 *    fun main() { ... }
 *
 *    - This is the starting point of the Kotlin program. Here, an instance of the `Dog` class named `Buddy` is created,
 *      and the `sound()` method is called, demonstrating the use of inheritance and method overriding.
 *
 * 6. Output Explanation:
 *    When you run this program, it will output:
 *
 *    Buddy says: Woof!
 *
 *    This output confirms that the `Dog` class successfully inherits the `Animal` class and overrides its `sound()` method,
 *    displaying the specific behavior for a `Dog`.
 *
 * Key Remarks on Inheritance in Kotlin:
 *
 * - Inheritance Control: Kotlin uses the `open` keyword to explicitly mark classes and functions that are allowed to be
 *   inherited or overridden. This is different from languages like Java, where classes and methods are inheritable by default
 *   unless marked `final`.
 * - Method Overriding: The `override` keyword is used to provide new behavior for a method inherited from a base class,
 *   ensuring that the method is intentionally overridden.
 *
 * Note:
 * This code can be tested and run in the Kotlin Playground at https://play.kotlinlang.org/.
 * Just copy the code into the Playground and run it to see the output.
 */

// Base class
open class Animal(val name: String) {
    open fun sound() {
        println("Animal sound")
    }
}

// Derived class
class Dog(name: String) : Animal(name) {
    override fun sound() {
        println("$name says: Woof!")
    }
}

// Main function: Entry point of the Kotlin program
fun main() {
    val dog = Dog("Buddy")
    dog.sound()
}

/*
 * Output of the program:
 *
 * Buddy says: Woof!
 *
 */
