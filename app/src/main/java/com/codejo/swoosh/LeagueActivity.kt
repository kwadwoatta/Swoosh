package com.codejo.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        selectedLeague = mensLeagueBtn.text.toString()
    }

    fun onWomensClicked(view: View) {
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        selectedLeague = womensLeagueBtn.text.toString()
    }

    fun onCoedClicked(view: View) {
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false

        selectedLeague = coedLeagueBtn.text.toString()
    }

    fun leagueNextClicked(view: View) {
        if (selectedLeague != "") {
            Intent(this, SkillActivity::class.java).putExtra(EXTRA_LEAGUE, selectedLeague).also {
                startActivity(it)
            }
        } else {
            Toast.makeText(this, "Select a league", Toast.LENGTH_LONG).show()
        }
    }
}
