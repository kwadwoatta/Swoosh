package com.codejo.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
