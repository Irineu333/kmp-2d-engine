package com.neoutils.core

interface TextMeasurer {
    fun measure(
        text: String,
        size: Float
    ): Size
}
