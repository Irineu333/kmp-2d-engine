package com.neoutils.core

open class Label : Node2D() {

    var text: String = "Label"
    var fontSize: Float = 48f
    var color: Color = Color.BLUE

    fun getSize(): Size {
        return tree?.textMeasurer?.measure(text, fontSize) ?: Size.ZERO
    }

    override fun bounds(): Rect = Rect(Vec2.ZERO, getSize())

    override fun onDraw(renderer: Renderer) {
        renderer.drawText(text, globalPosition(), fontSize, color)
    }
}