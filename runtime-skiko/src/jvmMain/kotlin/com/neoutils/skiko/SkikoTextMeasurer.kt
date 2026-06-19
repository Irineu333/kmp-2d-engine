package com.neoutils.skiko

import com.neoutils.core.Size
import com.neoutils.core.TextMeasurer

class SkikoTextMeasurer : TextMeasurer {

    override fun measure(
        text: String,
        size: Float
    ): Size {
        val font = fontFor(size)
        val metrics = font.metrics
        return Size(
            width = font.measureTextWidth(text),
            height = metrics.descent - metrics.ascent,
        )
    }
}
