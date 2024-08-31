package pgm4_circle_oops

// Circle class to represent a circle with properties and methods
class Circle(private var radius: Int) {

    private val pi = 3.14

    // Method to calculate the area of the circle
    fun calculateArea(): Double {
        return pi * radius * radius
    }

    // Method to calculate the perimeter (circumference) of the circle
    fun calculatePerimeter(): Double {
        return 2 * pi * radius
    }

    // Method to print the circle's parameters
    fun printCircleParameters() {
        val area = calculateArea()
        val perimeter = calculatePerimeter()
        println("Radius of the circle is    : $radius")
        println("Area of the circle         : $area")
        println("Perimeter of the circle is : $perimeter")
    }

    // Method to update the radius of the circle
    fun updateRadius(newRadius: Int) {
        radius = newRadius
    }
}

fun main() {
    // Create a Circle object with an initial radius of 1
    val circle = Circle(1)

    // Print initial circle parameters
    circle.printCircleParameters()

    // Update the radius to 10 and print the updated parameters
    circle.updateRadius(10)
    circle.printCircleParameters()
}
