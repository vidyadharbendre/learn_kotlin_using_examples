package pgm1_classes // Package declaration for organizing the code

/*
 * Program     : HouseClassDemo.kt
 * Author      : Vidyadhar Bendre
 * Date        : 9-September-2024
 *
 * Significance:
 * This program demonstrates the use of a simple class in Kotlin to represent a `House`.
 * The class includes properties and methods that describe the state and behavior of a house.
 * It showcases how to define a class with properties and methods in Kotlin.
 *
 * When to Use:
 * - Use a class when you need to represent a real-world entity with specific properties and behaviors.
 * - Classes are ideal for creating objects with attributes (properties) and functionality (methods) that
 *   operate on those attributes.
 *
 * Note:
 * This code can be run in the Kotlin Playground at https://play.kotlinlang.org/.
 */

// Class representing a house with various properties and methods
class House {
    // Property for the color of the house
    val color: String = "white"

    // Property for the number of windows in the house
    val numberOfWindows: Int = 2

    // Property indicating if the house is for sale
    val isForSale: Boolean = false

    // Method to update the color of the house
    fun updateColor(newColor: String) {
        // Implementation to update the house color
        // e.g., this.color = newColor (Note: In Kotlin, `val` properties cannot be reassigned)
    }

    // Additional methods and properties can be added here
}

// Main function: Entry point of the Kotlin program
fun main() {
    // Creating an instance of House
    val myHouse = House()

    // Printing properties of the house
    println("Color: ${myHouse.color}")
    println("Number of Windows: ${myHouse.numberOfWindows}")
    println("Is For Sale: ${myHouse.isForSale}")

    // Update color (This will need the implementation of updateColor method)
    // myHouse.updateColor("blue")
}

/*
 * Output of the program:
 *
 * Color: white
 * Number of Windows: 2
 * Is For Sale: false
 *
 * Explanation:
 * The program defines a class `House` with three properties: `color`, `numberOfWindows`, and `isForSale`,
 * along with a method `updateColor` to update the color of the house.
 *
 * In the `main()` function:
 * - An instance of `House` is created.
 * - The properties of the house are printed to the console.
 * - The `updateColor` method is intended to update the color, but since the color property is defined as `val`,
 *   which is immutable, the method implementation would need to handle this scenario or use `var` instead.
 */
