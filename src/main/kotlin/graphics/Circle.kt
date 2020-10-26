package graphics

import org.lwjgl.opengl.GL11.*
import kotlin.math.PI

data class Circle(val pos: Vector2, val rad: Double, val color: Color?): Drawable {
    constructor(p: Vector2, r: Double): this(p, r, null)

    override fun draw() {
        color?.apply()
        glBegin(GL_TRIANGLE_FAN)
        val numTriangles = 50
        pos.draw()
        for (i in 0..numTriangles) {
            pos.add(Vector2.fromPolar(rad, i * 2 * PI / numTriangles)).draw()
        }
        glEnd()
    }
}