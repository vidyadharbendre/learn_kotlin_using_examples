package pgm5_while_loop_countdown

/*
 * Program: Countdown to Liftoff Using `while` Loop
 * Author: Vidyadhar Bendre
 * Date: 3-Sep-2024
 *
 * Significance:
 * This program demonstrates the use of the `while` loop in Kotlin.
 * It counts down from a specified number (10 in this case) to 1 and prints "Liftoff!" at the end.
 * This example helps to understand the basic syntax and flow control of loops in Kotlin, particularly
 * the `while` loop, which repeats a block of code as long as a specified condition is true.
 *
 * Note:
 * For those without access to a laptop or computer, you can run this code online using the
 * Kotlin Playground at https://play.kotlinlang.org/.
 *
 * Simply copy and paste the code into the editor and click 'Run' to see the output.
 *
 */

fun main() {
    // Initialize the variable `count` with the starting value of 10
    var count = 10

    // Use a `while` loop that continues as long as `count` is greater than 0
    while (count > 0) {
        // Print the current value of `count`
        println(count)

        // Decrement `count` by 1 in each iteration
        count--
    }

    // Print "Liftoff!" once the loop has finished counting down to 0
    println("Liftoff!")
}

/*

The output of the above program is shown as below:
10
9
8
7
6
5
4
3
2
1
Liftoff!
 */