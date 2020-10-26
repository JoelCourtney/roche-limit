package graphics

import org.lwjgl.opengl.GL11.glVertex2d
import kotlin.math.cos
import kotlin.math.sin

data class Vector2(val x: Double, val y: Double): Drawable {
    constructor(x: Int, y: Int): this(x.toDouble(), y.toDouble())

    fun add(v: Vector2): Vector2 {
        return Vector2(x + v.x, y + v.y)
    }

    fun subtract(v: Vector2): Vector2 {
        return Vector2(x - v.x, y - v.y)
    }

    fun multiply(d: Double): Vector2 {
        return Vector2(x * d, y * d)
    }

    fun divide(d: Double): Vector2 {
        return Vector2(x / d, y / d)
    }

    fun divide(v: Vector2): Vector2 {
        return Vector2(x / v.x, y / v.y)
    }

    override fun draw() {
        World.convertToPixels(this).drawDirect()
    }

    private fun drawDirect() {
        glVertex2d(x, y)
    }

    companion object {
        fun fromPolar(r: Double, th: Double): Vector2 {
            return Vector2(r * cos(th), r * sin(th))
        }
    }
}