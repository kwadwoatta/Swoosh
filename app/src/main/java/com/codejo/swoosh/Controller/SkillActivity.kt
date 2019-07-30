package com.codejo.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.codejo.swoosh.Utilities.EXTRA_LEAGUE
import com.codejo.swoosh.R
import com.codejo.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league  = ""
    var selectedSkill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)!!
        println(league)
    }

    fun beginnerBtnClicked(view: View) {
        beginnerBtn.isChecked = true
        ballerBtn.isChecked = false

        selectedSkill = beginnerBtn.text.toString()
    }

    fun ballerBtnClicked(view: View) {
        ballerBtn.isChecked = true
        beginnerBtn.isChecked = false

        selectedSkill = ballerBtn.text.toString()
    }

    fun finishBtnClicked(view: View) {
        if (selectedSkill != "") {
            Intent(this, FinishActivity::class.java).putExtra(EXTRA_LEAGUE, league).also {
                it.putExtra(EXTRA_SKILL, selectedSkill)
                startActivity(it)
            }
        } else {
            Toast.makeText(this, "Please select a skill", Toast.LENGTH_SHORT).show()
        }
    }
}
