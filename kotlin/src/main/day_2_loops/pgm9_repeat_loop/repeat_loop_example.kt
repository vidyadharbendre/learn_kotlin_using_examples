package pgm9_repeat_loop

/*
 * Program   : RepeatLoopExample.kt
 * Author    : Vidyadhar Bendre
 * Date      : 3nd September, 2024
 *
 * Program Significance:
 * This program demonstrates the use of the `repeat` function in Kotlin, which allows
 * repeating a block of code a specified number of times. The program prints the message
 * "Hello!" five times to showcase the repeat structure, making it simpler and more readable
 * than traditional loops for repetitive tasks.
 *
 * Note:
 * For those without access to a laptop or computer, you can run this code online using the
 * Kotlin Playground at https://play.kotlinlang.org/. Simply copy and paste the code into
 * the editor and click 'Run' to see the output.
 */

// Main function - the entry point of the Kotlin program where execution begins.
fun main() {
    // The `repeat` function repeats the specified block of code a given number of times.
    repeat(5) {
        print("Hello!\n") // Prints "Hello!" in each iteration
    }
}

/*
 * Output of the program:
Hello!
Hello!
Hello!
Hello!
Hello!
 */
