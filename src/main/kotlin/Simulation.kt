import graphics.*
import java.io.File

val moon_a = 384399000.0
val earth_r = 6371000.0

class Simulation(file: String): Drawable {
    val data = File(file).readLines().map {
        it.split(",").map { it.toDouble() }.toDoubleArray()
    }.toTypedArray()

    var row = 0

    override fun draw() {
        Background(Color4(0.0, 0.0, 0.2, 0.0)).draw()
        val t = World.time
        while (data[row+1][0] / 10000 < t) row++
        for (i in 0..6) {
            Color3(1.0,1.0,1.0).apply()
            Circle(Vector2(data[row][2*i+1]/moon_a,data[row][2*i+2]/moon_a), earth_r / moon_a/2).draw()
        }
    }
}