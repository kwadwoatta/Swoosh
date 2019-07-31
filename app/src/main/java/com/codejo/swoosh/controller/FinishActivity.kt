package com.codejo.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codejo.swoosh.Model.Player
import com.codejo.swoosh.R
import com.codejo.swoosh.Utilities.EXTRA_LEAGUE
import com.codejo.swoosh.Utilities.EXTRA_PLAYER
import com.codejo.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        finishText.text = "Looking for a ${player.league} ${player.skill} league near you..."
    }
}
