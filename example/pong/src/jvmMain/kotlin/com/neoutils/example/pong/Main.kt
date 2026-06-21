package com.neoutils.example.pong

import com.neoutils.core.scene.BoundsOverlay
import com.neoutils.core.scene.FpsOverlay
import com.neoutils.dsl.add
import com.neoutils.example.pong.game.Ball
import com.neoutils.example.pong.game.Net
import com.neoutils.example.pong.game.Paddle
import com.neoutils.example.pong.game.Pong
import com.neoutils.example.pong.game.ReturnToMenu
import com.neoutils.example.pong.game.ScoreBoard
import com.neoutils.example.pong.game.Side
import com.neoutils.example.pong.game.VelocityOverlay
import com.neoutils.example.pong.menu.Menu
import com.neoutils.example.pong.menu.MenuHint
import com.neoutils.example.pong.menu.MenuTitle
import com.neoutils.skiko.runSkikoWindow

fun main() = runSkikoWindow(
    title = "pong",
) {
    scene("menu") {
        add<Background>()
        add<MenuTitle>()
        add<Menu>()
        add<MenuHint>()

        // debug
        add<BoundsOverlay>()
    }

    scene("pong") {
        add<Background>()
        add<Net>()
        add<Paddle> {
            side = Side.LEFT
        }
        add<Paddle> {
            side = Side.RIGHT
        }
        add<Ball>()
        add<ScoreBoard> {
            side = Side.LEFT
        }
        add<ScoreBoard> {
            side = Side.RIGHT
        }
        add<Pong>()
        add<ReturnToMenu>()

        // debug
        add<BoundsOverlay>()
        add<VelocityOverlay>()
        add<FpsOverlay>()
    }
}
