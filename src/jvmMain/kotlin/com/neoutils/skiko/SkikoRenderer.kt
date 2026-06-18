package com.neoutils.skiko

import com.neoutils.core.Color
import com.neoutils.core.Renderer
import com.neoutils.core.Vec2
import org.jetbrains.skia.Canvas
import org.jetbrains.skia.Paint

class SkikoRenderer : Renderer {

    var canvas: Canvas? = null

    override fun drawText(
        text: String,
        position: Vec2,
        size: Float,
        color: Color
    ) {
        val canvas = canvas ?: return

        val paint = paintFor(color)

        val font = fontFor(size)

        val baseline = position.y - font.metrics.ascent

        canvas.drawString(text, position.x, baseline, font, paint)
    }

    private fun paintFor(color: Color): Paint {
        return Paint().apply {
            this.color = color.toSkiaArgb()
            isAntiAlias = true
        }
    }

    private fun Color.toSkiaArgb(): Int {
        val a = (a.coerceIn(0f, 1f) * 255f + 0.5f).toInt() and 0xFF
        val r = (r.coerceIn(0f, 1f) * 255f + 0.5f).toInt() and 0xFF
        val g = (g.coerceIn(0f, 1f) * 255f + 0.5f).toInt() and 0xFF
        val b = (b.coerceIn(0f, 1f) * 255f + 0.5f).toInt() and 0xFF
        return (a shl 24) or (r shl 16) or (g shl 8) or b
    }
}