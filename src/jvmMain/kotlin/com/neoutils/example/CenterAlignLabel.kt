package com.neoutils.example

import com.neoutils.core.Label
import com.neoutils.core.Vec2

class CenterAlignLabel : Label() {

    override fun onProcess() {
        val textSize = tree?.textMeasurer?.measure(text, fontSize) ?: return

        position = Vec2(
            x = -textSize.width / 2f,
            y = -textSize.height / 2f,
        )
    }
}
