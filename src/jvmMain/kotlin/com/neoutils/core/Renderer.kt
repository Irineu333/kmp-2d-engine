package com.neoutils.core

interface Renderer {
    fun drawText(
        text: String,
        position: Vec2,
        size: Float,
        color: Color
    )
}
