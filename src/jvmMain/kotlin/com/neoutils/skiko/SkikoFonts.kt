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

internal fun fontFor(size: Float): Font {
    return Font(typeface, size)
}
