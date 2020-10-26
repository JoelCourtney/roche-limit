package graphics

object World {
    // in-world point of the center of the window
    var center = Vector2(0,0)

    // size of the window
    var size = Vector2(100, 100)

    // Number of pixels per in-world unit
    var zoom = 50.0

    fun convertToPixels(v: Vector2): Vector2 {
        return v.subtract(center).multiply(2 * zoom).divide(size)
    }
}