package com.raywenderlich.android.targetpractice.common

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Button
import com.raywenderlich.android.targetpractice.MainActivity
import com.raywenderlich.android.targetpractice.R

class CustomDialogClass(context: Context) : Dialog(context) {

    init {
        setCancelable(true)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.custom_layout)

        val noBtn = findViewById<View>(R.id.btn_no) as Button
        val yesBtn = findViewById<View>(R.id.btn_yes) as Button

        noBtn.setOnClickListener {
            MainActivity.isDetach = true
            MainActivity.isDismiss = true
        }

        yesBtn.setOnClickListener {
            MainActivity.isRestart = true
            MainActivity.isDismiss = true
        }

    }
}