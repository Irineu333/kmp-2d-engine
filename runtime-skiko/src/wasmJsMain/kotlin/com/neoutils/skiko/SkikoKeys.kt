package com.neoutils.skiko

import com.neoutils.core.input.Key

internal fun keyOf(code: String): Key = when (code) {
    "ArrowLeft" -> Key.LEFT
    "ArrowRight" -> Key.RIGHT
    "ArrowUp" -> Key.UP
    "ArrowDown" -> Key.DOWN
    "Space" -> Key.SPACE
    "Enter" -> Key.ENTER
    "Escape" -> Key.ESCAPE
    "KeyA" -> Key.A
    "KeyB" -> Key.B
    "KeyC" -> Key.C
    "KeyD" -> Key.D
    "KeyE" -> Key.E
    "KeyF" -> Key.F
    "KeyG" -> Key.G
    "KeyH" -> Key.H
    "KeyI" -> Key.I
    "KeyJ" -> Key.J
    "KeyK" -> Key.K
    "KeyL" -> Key.L
    "KeyM" -> Key.M
    "KeyN" -> Key.N
    "KeyO" -> Key.O
    "KeyP" -> Key.P
    "KeyQ" -> Key.Q
    "KeyR" -> Key.R
    "KeyS" -> Key.S
    "KeyT" -> Key.T
    "KeyU" -> Key.U
    "KeyV" -> Key.V
    "KeyW" -> Key.W
    "KeyX" -> Key.X
    "KeyY" -> Key.Y
    "KeyZ" -> Key.Z
    "Digit0" -> Key.DIGIT_0
    "Digit1" -> Key.DIGIT_1
    "Digit2" -> Key.DIGIT_2
    "Digit3" -> Key.DIGIT_3
    "Digit4" -> Key.DIGIT_4
    "Digit5" -> Key.DIGIT_5
    "Digit6" -> Key.DIGIT_6
    "Digit7" -> Key.DIGIT_7
    "Digit8" -> Key.DIGIT_8
    "Digit9" -> Key.DIGIT_9
    "F1" -> Key.F1
    "F2" -> Key.F2
    "F3" -> Key.F3
    "F4" -> Key.F4
    "F5" -> Key.F5
    "F6" -> Key.F6
    "F7" -> Key.F7
    "F8" -> Key.F8
    "F9" -> Key.F9
    "F10" -> Key.F10
    "F11" -> Key.F11
    "F12" -> Key.F12
    else -> Key.UNKNOWN
}
