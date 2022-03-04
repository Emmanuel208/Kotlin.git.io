package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val actionBar = supportActionBar
        actionBar!!.title = "Third Activity"

        actionBar.setDisplayHomeAsUpEnabled(true)

        Skill_button.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)

            startActivity(intent)
        }
    }
}