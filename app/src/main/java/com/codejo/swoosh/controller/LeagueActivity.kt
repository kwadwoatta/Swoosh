package com.codejo.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.codejo.swoosh.Model.Player
import com.codejo.swoosh.R
import com.codejo.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    private var player = Player("", "")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState!!)
        outState.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
    }

    fun onMensClicked(view: View) {
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = mensLeagueBtn.text.toString()
    }

    fun onWomensClicked(view: View) {
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = womensLeagueBtn.text.toString()
    }

    fun onCoedClicked(view: View) {
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false

        player.league = coedLeagueBtn.text.toString()
    }

    fun leagueNextClicked(view: View) {
        if (player.league != "") {
            Intent(this, SkillActivity::class.java).also {
                it.putExtra(EXTRA_PLAYER, player)
                startActivity(it)
            }
        } else {
            Toast.makeText(this, "Select a league", Toast.LENGTH_LONG).show()
        }
    }
}
