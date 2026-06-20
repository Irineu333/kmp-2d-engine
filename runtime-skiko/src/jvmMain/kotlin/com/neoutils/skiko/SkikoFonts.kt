package com.neoutils.skiko

import org.jetbrains.skia.Font
import org.jetbrains.skia.FontMgr
import org.jetbrains.skia.FontStyle

internal val typeface = FontMgr.default.matchFamilyStyleCharacter(
    familyName = null,
    style = FontStyle.NORMAL,
    bcp47 = null,
    character = 'A'.code,
)

// Bounded cache: a few distinct sizes at most, so it never grows unbounded.
// Assumes single-threaded access from the Skiko render thread.
private val fonts = mutableMapOf<Float, Font>()

internal fun fontFor(size: Float): Font {
    return fonts.getOrPut(size) { Font(typeface, size) }
}
