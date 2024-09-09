package pgm9_person_property_getter // Package declaration for organizing the code

/*
 * Program     : PersonFullNameDemo.kt
 * Author      : Vidyadhar Bendre
 * Date        : 8-September-2024
 *
 * Significance:
 * This program demonstrates the use of a class `Person` in Kotlin with two properties: `firstName` and `lastName`.
 * The class includes a custom getter for the `fullName` property that concatenates `firstName` and `lastName`.
 * This approach shows how to define derived properties using custom getters.
 *
 * When to Use:
 * - Use classes with custom getters when you need to compute or format property values based on other properties.
 * - This approach is useful for encapsulating logic related to property value computation.
 *
 * Note:
 * This code can be run in the Kotlin Playground at https://play.kotlinlang.org/.
 */

// Class Person with two properties and a custom getter for the full name
class Person(val firstName: String, val lastName: String) {
    // The `fullName` property is derived from `firstName` and `lastName`
    val fullName: String
        get() {
            // Custom getter that returns the concatenated full name
            return "$firstName $lastName"
        }
}

// Main function: Entry point of the Kotlin program
fun main() {
    // Creating an instance of the Person class with first and last names
    val person = Person("Vidyadhar", "Bendre")

    // Accessing and printing the fullName property using the custom getter
    println(person.fullName) // Output: Alex Johnson
}

/*
 * Output of the program:
 *
 * Vidyadhar Bendre
 *
 * Explanation:
 * 1. **Class Declaration**:
 *    - The `Person` class has a primary constructor with two properties: `firstName` and `lastName`.
 *    - Both properties are read-only (`val`) and are initialized through the constructor parameters.
 *
 * 2. **Custom Getter**:
 *    - The `fullName` property has a custom getter defined using the `get()` function.
 *    - The custom getter concatenates `firstName` and `lastName` to form the `fullName`.
 *
 * 3. **Object Creation**:
 *    - `val person = Person("Alex", "Johnson")` creates an instance of the `Person` class with the specified first and last names.
 *
 * 4. **Accessing the fullName Property**:
 *    - `println(person.fullName)` accesses the `fullName` property using the custom getter and prints the concatenated name.
 *
 * 5. **Usage of Custom Getters**:
 *    - Custom getters are useful when you need to compute or derive a property value based on other properties of the class.
 *    - This approach helps in keeping related logic encapsulated within the class, providing a clean and intuitive interface.
 */
