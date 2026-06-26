package com.neoutils.example

import com.neoutils.debug.debug
import com.neoutils.dsl.add
import com.neoutils.skiko.runSkikoWindow

fun main() = runSkikoWindow(
    title = "hello-world",
) {
    scene("main") {
        add<CenteredNode2D> {
            add<CenterAlignLabel> {
                text = "Hello, World!"
            }
        }
        debug()
    }
}
