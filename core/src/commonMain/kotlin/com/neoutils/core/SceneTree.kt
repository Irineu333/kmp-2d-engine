package com.neoutils.core

class SceneTree(
    val root: Node,
) {

    var size: Size = Size.ZERO

    var textMeasurer: TextMeasurer? = null

    fun process() {
        process(root)
    }

    private fun process(node: Node) {
        node.tree = this
        node.onProcess()
        node.children.forEach {
            process(it)
        }
    }

    fun render(renderer: Renderer) {
        render(root, renderer)
    }

    private fun render(node: Node, renderer: Renderer) {
        node.onDraw(renderer)
        node.children.forEach {
            render(it, renderer)
        }
    }
}
