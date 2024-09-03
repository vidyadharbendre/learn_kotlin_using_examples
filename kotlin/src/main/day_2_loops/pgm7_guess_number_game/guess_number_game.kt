package pgm7_guess_number_game

/*
 * Program: Guess the Secret Number Game
 * Author: Vidyadhar Bendre
 * Date: 3-Sep-2024
 *
 * Significance:
 * This program demonstrates the use of `while` loops, `when` expressions, and conditional logic in Kotlin.
 * It engages the user in a simple guessing game where they need to guess a predefined secret number.
 * The program provides feedback on each guess and continues until the correct number is guessed.
 * This example helps to understand how to use infinite loops (`while (true)`), input handling, and
 * condition checking with the `when` expression in Kotlin.
 *
 * Note:
 * For those without access to a laptop or computer, you can run this code online using the
 * Kotlin Playground at https://play.kotlinlang.org/.
 *
 * Simply copy and paste the code into the editor and click 'Run' to see the output.
 *
 */

fun main() {
    // Set the secret number to be guessed
    val secretNumber = 7

    // Declare a variable `guess` to store the user's input
    var guess: Int

    // Prompt the user to start guessing the number between 1 and 10
    println("Guess the secret number between 1 and 10:")

    // Start an infinite loop to keep asking the user for guesses until the correct number is guessed
    while (true) {
        // Read the user's guess from the keyboard and convert it to an integer
        guess = readLine()!!.toInt()

        // Use a `when` expression to compare the user's guess with the secret number
        when {
            // If the guess is less than the secret number, print a hint and prompt to guess again
            guess < secretNumber -> println("Too low, try again.")

            // If the guess is greater than the secret number, print a hint and prompt to guess again
            guess > secretNumber -> println("Too high, try again.")

            // If the guess matches the secret number, congratulate the user and break the loop
            else -> {
                println("Congratulations! You guessed it right.")
                break // Exit the loop as the correct number has been guessed
            }
        }
    }
}


/*
The output of the above program is shown as below:
Guess the secret number between 1 and 10:
3
Too low, try again.
4
Too low, try again.
5
Too low, try again.
6
Too low, try again.
9
Too high, try again.
8
Too high, try again.
7
Congratulations! You guessed it right.
 */