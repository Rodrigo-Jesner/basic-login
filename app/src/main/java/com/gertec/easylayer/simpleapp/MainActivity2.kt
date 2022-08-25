package com.gertec.easylayer.simpleapp

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val aBar = supportActionBar
        val cd = ColorDrawable(Color.parseColor("#ffff0000"))
        aBar?.setBackgroundDrawable(cd)
    }
}