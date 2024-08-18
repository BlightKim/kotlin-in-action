package chapter1

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width;
        }
}

fun main() {
    val rectangle = Rectangle(43, 43)
    println(rectangle.isSquare)
}
