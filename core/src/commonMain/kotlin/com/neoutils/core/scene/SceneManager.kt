package com.neoutils.core.scene

class SceneManager(
    private val factories: Map<String, SceneFactory>,
) {
    var current: SceneTree = build(factories.keys.firstOrNull() ?: error("No scenes registered"))
        private set

    fun change(name: String, args: Any? = null) {
        current = build(name, args)
    }

    private fun build(name: String, args: Any? = null): SceneTree {
        val factory = factories[name] ?: error("Scene not found: $name")
        return factory.create().also {
            it.manager = this
            it.args = args
        }
    }

    companion object {
        fun ofMain(tree: SceneTree): SceneManager {
            return SceneManager(mapOf("main" to SceneFactory { tree }))
        }
    }
}
