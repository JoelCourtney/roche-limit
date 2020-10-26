package graphics

import org.lwjgl.opengl.GL11.*

data class Color3(val r: Double, val g: Double, val b: Double): Color {
    override fun apply() {
        glColor3d(r, g, b)
    }
}