package com.codejo.swoosh.Controller

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codejo.swoosh.R
import com.codejo.swoosh.Utilities.EXTRA_LEAGUE
import com.codejo.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        finishText.text = "Looking for a $league $skill league near you..."

        println(league)
        println(skill)
    }
}
