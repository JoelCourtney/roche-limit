package graphics

import org.lwjgl.opengl.GL11

data class Background(
        val color: Color4
): Drawable {
    override fun draw() {
        color.applyClear()
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT or GL11.GL_DEPTH_BUFFER_BIT) // clear the framebuffer
    }
}