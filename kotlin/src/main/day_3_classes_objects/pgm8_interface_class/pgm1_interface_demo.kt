package pgm8_interface_class // Package declaration for organizing the code

/*
 * Program     : InterfaceDemo.kt
 * Author      : Vidyadhar Bendre
 * Date        : 9-September-2024
 *
 * Significance:
 * This program demonstrates the use of interfaces in Kotlin.
 * Interfaces provide a way to define methods that must be implemented by classes.
 * In this example, the interface `Vehicle` defines a method `drive()` that any implementing
 * class must provide a concrete implementation for.
 *
 * When to use an Interface:
 * - Use interfaces when you need to define a contract that can be implemented by multiple classes,
 *   regardless of their place in the class hierarchy.
 * - Interfaces are useful when you need to ensure that certain methods are implemented by classes
 *   that do not share a common base class.
 * - Interfaces can be used to achieve multiple inheritance in Kotlin, as a class can implement
 *   multiple interfaces but can only inherit from one class.
 *
 * When to use Inheritance:
 * - Use inheritance when you want to create a new class that is a type of an existing class and
 *   extends or modifies its behavior.
 * - Inheritance is appropriate when you have a class that provides a default implementation that
 *   can be shared or extended by other classes.
 * - It is used when you want to leverage polymorphism and code reuse from a common base class.
 *
 * Note:
 * This code can be run in the Kotlin Playground at https://play.kotlinlang.org/.
 */

// Interface with a method
interface Vehicle {
    // Abstract method to be implemented by classes that implement this interface
    fun drive()
}

// Class implementing the interface
class Car : Vehicle {
    // Concrete implementation of the drive method from the Vehicle interface
    override fun drive() {
        println("Car is driving")
    }
}

// Main function: Entry point of the Kotlin program
fun main() {
    // Create an instance of Car
    val car = Car()

    // Call the drive method on the Car instance
    car.drive()
}

/*
 * Output of the program:
 *
 * Car is driving
 *
 * Explanation:
 * The program defines an interface `Vehicle` with an abstract method `drive()`.
 * The `Car` class implements the `Vehicle` interface and provides a concrete
 * implementation of the `drive()` method. In the `main()` function, an instance
 * of `Car` is created, and its `drive()` method is called, resulting in the
 * output "Car is driving".
 *
 */
