package com.neoutils.debug

import com.neoutils.core.node.Node
import com.neoutils.debug.feature.BoundsFeature
import com.neoutils.debug.feature.FpsFeature
import com.neoutils.dsl.add

/**
 * Adds a [DebugLayer] under this node and returns it. With [defaults] (the default),
 * pre-populates it with [FpsFeature] (F1) and [BoundsFeature] (F2); [block] adds more.
 */
fun Node.debug(
    defaults: Boolean = true,
    block: DebugLayer.() -> Unit = {},
): DebugLayer = add(::DebugLayer) {
    if (defaults) {
        add(::FpsFeature)
        add(::BoundsFeature)
    }
    block()
}
