package pgm6_display_even_odd

/*
 * Program: Display Even and Odd Numbers from a List
 * Author: Vidyadhar Bendre
 * Date: 3-Sep-2024
 *
 * Significance:
 * This program demonstrates the use of `for` loops and conditional statements (`if-else`) in Kotlin
 * to filter and display even and odd numbers from a list of integers. It helps to understand the
 * basic syntax of loops, list handling, and condition checks in Kotlin, showing how to traverse
 * collections and apply conditions to filter elements.
 *
 * Note:
 * For those without access to a laptop or computer, you can run this code online using the
 * Kotlin Playground at https://play.kotlinlang.org/.
 *
 * Simply copy and paste the code into the editor and click 'Run' to see the output.
 *
 */

fun main() {
    // Initialize a list of numbers from 1 to 10
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Print the heading for even numbers
    println("Even numbers:")

    // Use a `for` loop to iterate through each number in the list
    for (num in numbers) {
        // Check if the current number is even using the modulus operator (`%`)
        if (num % 2 == 0) {
            // If the condition is true, print the even number
            println(num)
        }
    }

    // Print the heading for odd numbers
    println("Odd numbers:")

    // Use another `for` loop to iterate through each number in the list
    for (num in numbers) {
        // Check if the current number is odd using the modulus operator (`%`)
        if (num % 2 != 0) {
            // If the condition is true, print the odd number
            println(num)
        }
    }
}


/*
The output of the above program is shown as below:
Even numbers:
2
4
6
8
10
Odd numbers:
1
3
5
7
9
 */