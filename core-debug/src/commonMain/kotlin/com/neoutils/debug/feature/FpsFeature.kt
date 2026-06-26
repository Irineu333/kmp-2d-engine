package com.neoutils.debug.feature

import com.neoutils.core.graphics.Color
import com.neoutils.core.graphics.Renderer
import com.neoutils.core.input.Key
import com.neoutils.core.math.Vec2
import com.neoutils.debug.DebugFeature
import kotlin.math.roundToInt

/**
 * Draws a frames-per-second counter in the top-left corner. Toggle with [F1][Key.F1].
 */
class FpsFeature : DebugFeature(shortcut = Key.F1) {

    var margin: Float = 8f
    var fontSize: Float = 18f
    var color: Color = Color.GREEN

    private var elapsed = 0f
    private var frames = 0
    private var fps = 0

    override fun process(delta: Float) {
        elapsed += delta
        frames++

        if (elapsed >= UPDATE_INTERVAL) {
            fps = (frames / elapsed).roundToInt()
            elapsed = 0f
            frames = 0
        }
    }

    override fun draw(renderer: Renderer) {
        renderer.drawText("FPS: $fps", Vec2(margin, margin), fontSize, color)
    }

    companion object {
        private const val UPDATE_INTERVAL = 0.5f
    }
}
