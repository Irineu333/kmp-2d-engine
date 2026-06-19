package com.neoutils.core

data class Rect(
    val position: Vec2,
    val size: Size,
) {
    companion object {
        val ZERO = Rect(Vec2.ZERO, Size.ZERO)
    }
}
