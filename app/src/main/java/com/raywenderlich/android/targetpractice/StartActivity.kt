package com.raywenderlich.android.targetpractice

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        val btn = findViewById<Button>(R.id.start_btn)
        btn.setOnClickListener {
            startActivity(Intent(this@StartActivity, MainActivity::class.java))
        }
    }


}