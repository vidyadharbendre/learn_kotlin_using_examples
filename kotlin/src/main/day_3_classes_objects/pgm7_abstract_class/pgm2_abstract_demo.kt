package pgm7_abstract_class // Package declaration for organizing the code

/*
 * Program     : AbstractClassDemo.kt
 * Author      : Vidyadhar Bendre
 * Date        : 8-September-2024
 *
 * Significance:
 * This program demonstrates the use of abstract classes in Kotlin.
 * Abstract classes allow you to define methods and properties that must be implemented
 * by subclasses, providing a way to enforce a contract for derived classes.
 * They can also provide default implementations of methods.
 *
 * When to Use:
 * - Use abstract classes when you have a common base class that should not be instantiated
 *   on its own but provides a common interface and some shared functionality for its subclasses.
 * - Abstract classes are useful for defining a common template that must be extended by concrete
 *   classes, allowing you to define abstract methods that must be implemented by each subclass.
 *
 * Note:
 * This code can be run in the Kotlin Playground at https://play.kotlinlang.org/.
 */

// Abstract class defining a template for food items
abstract class Food {
    // Abstract property for calorie count
    abstract val kcal: Int

    // Abstract property for food name
    abstract val name: String

    // Method to print a message about consuming the food
    fun consume() = println("I'm eating ${name}")
}

// Concrete class representing a specific type of food: Pizza
class Pizza : Food() {
    // Implementing the abstract property for calorie count
    override val kcal = 600

    // Implementing the abstract property for food name
    override val name = "Pizza"
}

// Main function: Entry point of the Kotlin program
fun main() {
    // Creating an instance of Pizza and calling the consume method
    Pizza().consume() // Output: I'm eating Pizza
}

/*
 * Output of the program:
 *
 * I'm eating Pizza
 *
 * Explanation:
 * The program defines an abstract class `Food` with abstract properties `kcal` and `name`,
 * and a concrete method `consume` that prints a message indicating that the food is being eaten.
 *
 * A concrete class `Pizza` extends the abstract class `Food` and provides implementations
 * for the abstract properties `kcal` and `name`.
 *
 * In the `main()` function:
 * - An instance of `Pizza` is created and the `consume()` method is called,
 *   which prints "I'm eating Pizza" to the console.
 */
