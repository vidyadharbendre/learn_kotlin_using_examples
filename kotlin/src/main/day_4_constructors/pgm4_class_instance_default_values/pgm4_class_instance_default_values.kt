package pgm4_class_instance_default_values // Package declaration for organizing the code

/*
 * Program     : BoxDefaultValuesDemo.kt
 * Author      : Vidyadhar Bendre
 * Date        : 8-September-2024
 *
 * Significance:
 * This program demonstrates the use of default values in class constructors in Kotlin.
 * By providing default values, we can simplify object creation without needing multiple constructors.
 *
 * When to Use:
 * - Use default values when certain parameters have a common value or when providing flexibility in object creation.
 *
 * Note:
 * This code can be run in the Kotlin Playground at https://play.kotlinlang.org/.
 */

// Class Box with default values for width and height
class Box(val length: Int, val width: Int = 20, val height: Int = 40) {
    // Method to display the dimensions of the box
    fun displayDimensions() {
        println("Box Dimensions -> Length: $length, Width: $width, Height: $height")
    }
}

// Main function: Entry point of the Kotlin program
fun main() {
    // Creating instances of Box with different combinations of parameters

//    // Example 1: Creating a Box with all parameters specified
//    var box1: Box
//    box1 = Box(100, 20, 40)
//    box1.displayDimensions() // Output: Length: 100, Width: 20, Height: 40

    // Example 1: Creating a Box with all parameters specified
    val box1 = Box(100, 20, 40)
    box1.displayDimensions() // Output: Length: 100, Width: 20, Height: 40


    // Example 2: Creating a Box with only the length specified (default values are used for width and height)
    val box2 = Box(length = 100)
    box2.displayDimensions() // Output: Length: 100, Width: 20, Height: 40

    // Example 3: Creating a Box with specific values for all parameters using named arguments
    val box3 = Box(length = 100, width = 25, height = 50)
    box3.displayDimensions() // Output: Length: 100, Width: 25, Height: 50
}

/*
 * Output of the program:
 *
 * Box Dimensions -> Length: 100, Width: 20, Height: 40
 * Box Dimensions -> Length: 100, Width: 20, Height: 40
 * Box Dimensions -> Length: 100, Width: 25, Height: 50
 *
 * Explanation:
 * 1. **Class with Default Values**:
 *    - The class `Box` has a constructor with default values for `width` and `height`.
 *    - If these parameters are not provided, the default values (20 for width and 40 for height) are used.
 *
 * 2. **Usage**:
 *    - In `box1`, all values are specified explicitly.
 *    - In `box2`, only `length` is specified, and the defaults are used for `width` and `height`.
 *    - In `box3`, named arguments are used to specify custom values for all parameters.
 */
