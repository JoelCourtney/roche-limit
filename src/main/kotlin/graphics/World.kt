package graphics

object World {
    // in-world point of the center of the window
    var center = Vector2(1.0,1.0)

    // size of the window
    var size = Vector2(100, 100)

    // Number of pixels per in-world unit
    var zoom = 2000.0

    var time = 0.0

    fun convertToPixels(v: Vector2): Vector2 {
        return v.subtract(center).multiply(2 * zoom).divide(size)
    }

    fun dragByPixels(v: Vector2) {
        center = center.add(v.divide(zoom));
    }
}