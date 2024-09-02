package pgm3_simple_calculator_using_when

/*
 * Program: Simple Calculator using `when` Expression
 * Author: Vidyadhar Bendre
 * Date: 2-Sep-2024
 *
 * Significance:
 * This program demonstrates the use of the `when` expression in Kotlin to perform basic
 * arithmetic operations. It allows the user to enter two numbers and select an operation
 * (addition, subtraction, multiplication, or division) to perform on those numbers.
 * This example illustrates the handling of user input, conditional logic, and basic error handling.
 *
 * Note:
 * For those without access to a laptop or computer, you can run this code online using the
 * Kotlin Playground at https://play.kotlinlang.org/.
 *
 * Simply copy and paste the code into the editor and click 'Run' to see the output.
 *
 */

fun main() {
    // Prompt the user to enter the first number
    println("Enter first number:")

    // Read the first number from the user and convert it to a double
    val num1 = readLine()!!.toDouble()

    // Prompt the user to enter the second number
    println("Enter second number:")

    // Read the second number from the user and convert it to a double
    val num2 = readLine()!!.toDouble()

    // Prompt the user to choose an arithmetic operation
    println("Choose an operation (+, -, *, /):")

    // Read the chosen operation from the user as a string
    val operation = readLine()

    // Use a `when` expression to perform the selected operation
    val result = when (operation) {
        "+" -> num1 + num2               // If `operation` is "+", add `num1` and `num2`
        "-" -> num1 - num2               // If `operation` is "-", subtract `num2` from `num1`
        "*" -> num1 * num2               // If `operation` is "*", multiply `num1` by `num2`
        "/" -> if (num2 != 0.0) num1 / num2 else "Cannot divide by zero" // If `operation` is "/", check if `num2` is not zero and perform division; otherwise, display error
        else -> "Invalid operation"      // If the operation is not recognized, display an error message
    }

    // Print the result of the operation
    println("Result: $result")
}
