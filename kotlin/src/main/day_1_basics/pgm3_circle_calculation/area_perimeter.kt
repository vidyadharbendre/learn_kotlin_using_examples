package pgm3_circle_calculation


fun PrintCircleParameters(radius: Int, area: Double, perimeter:Double){
    println("Radius of the circle is    : $radius")
    println("Area of the circle         : $area")
    println("Perimeter of the circle is : $perimeter")
}


fun CalculateArea(radius: Int): Double{
    val pi = 3.14
    return pi*radius*radius
}
fun main(){
    val pi=3.14
    var radius = 1

    var area = CalculateArea(radius)
    var perimeter = 2*pi*radius

    PrintCircleParameters(radius, area, perimeter)

    radius = 10
    area = CalculateArea(radius)
    perimeter = 2*pi*radius

    PrintCircleParameters(radius, area, perimeter)

}