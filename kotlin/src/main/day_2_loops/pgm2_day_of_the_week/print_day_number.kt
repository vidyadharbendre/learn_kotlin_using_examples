package pgm2_day_of_the_week

/*
 * Program: Determine the Day of the Week from a Number
 * Author: Vidyadhar Bendre
 * Date: 2-Sep-2024
 *
 * Significance:
 * This program demonstrates the use of the `when` expression in Kotlin.
 * It maps a given number to the corresponding day of the week and prints the result.
 * This example helps to understand the basic syntax and flow control of the `when` expression
 * in Kotlin, showing how to match values and handle multiple conditions.
 *
 * Note:
 * For those without access to a laptop or computer, you can run this code online using the
 * Kotlin Playground at https://play.kotlinlang.org/.
 *
 * Simply copy and paste the code into the editor and click 'Run' to see the output.
 *
 */

fun main() {
    // Initialize the variable `day` with a value of 3
    val day = 3

    // Use a `when` expression to determine the name of the day based on the value of `day`
    val dayName = when (day) {
        1 -> "Monday"     // If `day` is 1, set `dayName` to "Monday"
        2 -> "Tuesday"    // If `day` is 2, set `dayName` to "Tuesday"
        3 -> "Wednesday"  // If `day` is 3, set `dayName` to "Wednesday"
        4 -> "Thursday"   // If `day` is 4, set `dayName` to "Thursday"
        5 -> "Friday"     // If `day` is 5, set `dayName` to "Friday"
        6 -> "Saturday"   // If `day` is 6, set `dayName` to "Saturday"
        7 -> "Sunday"     // If `day` is 7, set `dayName` to "Sunday"
        else -> "Invalid day" // If `day` is any other value, set `dayName` to "Invalid day"
    }

    // Print the day number and its corresponding name
    println("Day $day: $dayName")
}
