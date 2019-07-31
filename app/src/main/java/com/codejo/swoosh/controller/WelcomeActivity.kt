package com.codejo.swoosh.controller

import android.content.Intent
import android.os.Bundle
import com.codejo.swoosh.R
import kotlinx.android.synthetic.main.activity_welcome.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        getStartedBtn.setOnClickListener {
/* explicit intent to go to the league layout activity */
            val leagueIntent = Intent(this, LeagueActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}
