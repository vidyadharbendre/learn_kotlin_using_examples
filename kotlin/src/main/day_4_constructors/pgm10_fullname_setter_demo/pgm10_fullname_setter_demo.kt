package pgm10_fullname_setter_demo // Package declaration for organizing the code

/*
 * Program     : pgm10_fullname_setter_demo.kt
 * Author      : Vidyadhar Bendre
 * Date        : 8-September-2024
 *
 * Significance:
 * This program demonstrates how to use custom getters and setters for a property in Kotlin.
 * The `fullName` property is derived from `firstName` and `lastName`, allowing both reading and modifying the names through the `fullName`.
 *
 * When to Use:
 * - Use custom setters when you need to add additional logic while setting property values.
 * - This approach is useful for validation, transformation, or updating other properties based on the set value.
 *
 * Note:
 * This code can be run in the Kotlin Playground at https://play.kotlinlang.org/.
 */

// Class Person with custom getter and setter for the fullName property
class Person(var firstName: String, var lastName: String) {
    // `fullName` is a property with custom getter and setter
    var fullName: String = ""
        // Custom getter returns the full name by concatenating `firstName` and `lastName`
        get() = "$firstName $lastName"
        // Custom setter updates `firstName` and `lastName` based on the input value
        set(value) {
            // Splitting the input value into components based on space
            val components = value.split(" ")
            // Assigning the first component to `firstName`
            firstName = components[0]
            // Assigning the second component to `lastName`
            lastName = components[1]
            // `field` refers to the backing field of `fullName`, allowing it to be updated
            field = value
        }
}

// Main function: Entry point of the Kotlin program
fun main() {
    // Creating an instance of the Person class with initial names
    val person = Person("Vidyadhar", "Bendre")

    // Accessing and printing the fullName property using the custom getter
    println(person.fullName) // Output: Vidyadhar Bendre

    // Modifying the fullName property using the custom setter
    person.fullName = "Poornima Oak"

    // Accessing and printing the modified fullName
    println(person.fullName) // Output: Poornima Oak

    // Printing individual first and last names to demonstrate the effect of the custom setter
    println("First Name: ${person.firstName}") // Output: Joey
    println("Last Name: ${person.lastName}")   // Output: Tribbiani
}

/*
 * Output of the program:
 *
 * Vidyadhar Bendre
 * Poornima Oak
 * First Name: Poornima
 * Last Name: Oak
 *
 * Explanation:
 * 1. **Class Declaration**:
 *    - The `Person` class has two mutable properties: `firstName` and `lastName`.
 *    - A third property, `fullName`, is defined with a custom getter and setter.
 *
 * 2. **Custom Getter**:
 *    - The custom getter for `fullName` concatenates `firstName` and `lastName` into a single string.
 *    - This allows `fullName` to be used as a derived property that combines the two names.
 *
 * 3. **Custom Setter**:
 *    - The custom setter splits the input value of `fullName` into components and updates `firstName` and `lastName`.
 *    - `field` is used to update the backing field of `fullName` after modifying the individual names.
 *
 * 4. **Object Creation**:
 *    - `val person = Person("Vidyadhar", "Bendre")` creates a new instance of the `Person` class with the initial names "Alex" and "Johnson".
 *
 * 5. **Accessing and Modifying fullName**:
 *    - `println(person.fullName)` uses the custom getter to print the concatenated full name.
 *    - `person.fullName = "Poornima Oak"` uses the custom setter to update both `firstName` and `lastName`.
 *    - Printing `firstName` and `lastName` confirms that the names have been updated correctly through the setter.
 *
 * 6. **Usage of Custom Getters and Setters**:
 *    - Custom getters and setters are useful for encapsulating complex logic around how properties are accessed and modified.
 *    - This approach provides a clear and intuitive interface for working with derived or computed properties.
 */
