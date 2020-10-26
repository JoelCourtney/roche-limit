package graphics

object World {
    // in-world point of the center of the window
    var center = Vector2(0.5,0.5)

    // size of the window
    var size = Vector2(100, 100)

    // Number of pixels per in-world unit
    var zoom = 700.0

    var time = 0.0

    fun convertToPixels(v: Vector2): Vector2 {
        return v.subtract(center).multiply(2 * zoom).divide(size)
    }
}