package com.codejo.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.codejo.swoosh.Model.Player
import com.codejo.swoosh.Utilities.EXTRA_LEAGUE
import com.codejo.swoosh.R
import com.codejo.swoosh.Utilities.EXTRA_PLAYER
import com.codejo.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    private var player = Player("", "")

//    Save player as parcelable to instance state when screen is rotated
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putParcelable(EXTRA_PLAYER, player)
        super.onSaveInstanceState(outState)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)!!
    }

//    retrieve player from saved instance state and continue activity
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
    }

    fun beginnerBtnClicked(view: View) {
        beginnerBtn.isChecked = true
        ballerBtn.isChecked = false

        player.skill = beginnerBtn.text.toString()
    }

    fun ballerBtnClicked(view: View) {
        ballerBtn.isChecked = true
        beginnerBtn.isChecked = false

        player.skill = ballerBtn.text.toString()
    }

    fun finishBtnClicked(view: View) {
        if (player.skill != "") {
            Intent(this, FinishActivity::class.java).also {
                it.putExtra(EXTRA_PLAYER, player)
                startActivity(it)
            }
        } else {
            Toast.makeText(this, "Please select a skill", Toast.LENGTH_SHORT).show()
        }
    }
}
