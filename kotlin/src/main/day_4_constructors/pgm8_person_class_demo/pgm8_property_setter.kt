package pgm8_person_class_demo // Package declaration for organizing the code

/*
 * Program     : pgm8_property_setter.kt
 * Author      : Vidyadhar Bendre
 * Date        : 9-September-2024
 *
 * Significance:
 * This program demonstrates the use of a simple class `Person` in Kotlin that contains a mutable property `name`.
 * The program shows how to create an instance of the class, access the property, and modify it using Kotlin's
 * built-in getter and setter functionality.
 *
 * When to Use:
 * - Use a class with mutable properties when you need to store data that can change over time.
 * - This approach is useful for encapsulating data with easy access and modification.
 *
 * Note:
 * This code can be run in the Kotlin Playground at https://play.kotlinlang.org/.
 */

// Class Person with a mutable property 'name'
class Person(var name: String) {
    // The primary constructor initializes the 'name' property of the Person class.
}

// Main function: Entry point of the Kotlin program
fun main() {
    // Creating an instance of the Person class with the name "Vidyadhar"
    val person = Person("Vidyadhar")

    // Accessing and printing the property 'name' using the getter
    println(person.name)  // Output: Vidyadhar

    // Modifying the property 'name' using the setter
    person.name = "Atharva"

    // Accessing and printing the updated property 'name'
    println(person.name)  // Output: Atharva
}

/*
 * Output of the program:
 *
 * Vidyadhar
 * Atharva
 *
 * Explanation:
 * 1. **Class Declaration**:
 *    - The `Person` class has a primary constructor that initializes the mutable property `name` of type `String`.
 *    - The `var` keyword indicates that `name` can be modified after the object is created.
 *
 * 2. **Object Creation**:
 *    - `val person = Person("Vidyadhar")` creates an instance of the `Person` class with the name property set to "Vidyadhar".
 *
 * 3. **Accessing and Modifying Properties**:
 *    - `println(person.name)` prints the current value of the `name` property using the default getter.
 *    - `person.name = "Atharva"` sets the `name` property to "Atharva" using the default setter.
 *    - `println(person.name)` prints the updated value of the `name` property.
 *
 * 4. **Usage of Getters and Setters**:
 *    - In Kotlin, properties have built-in getter and setter methods that are used when accessing and modifying their values.
 *    - This allows for clean and intuitive syntax when working with object properties.
 */
