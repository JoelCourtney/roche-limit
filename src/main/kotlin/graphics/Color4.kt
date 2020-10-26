package graphics

import org.lwjgl.opengl.GL11.glClearColor
import org.lwjgl.opengl.GL11.glColor4d

data class Color4(val r: Double, val g: Double, val b: Double, val a: Double): Color {
    override fun apply() {
        glColor4d(r, b, g, a)
    }

    fun applyClear() {
        glClearColor(r.toFloat(), b.toFloat(), g.toFloat(), a.toFloat())
    }
}