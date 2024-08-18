package chapter2.geometry.shapes

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}

fun createUtilSquare(): Rectangle {
    return Rectangle(1, 1)
}
