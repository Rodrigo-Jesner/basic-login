package com.gertec.easylayer.simpleapp


import android.R.attr.value
import android.content.Intent
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aBar = supportActionBar
        val cd = ColorDrawable(Color.parseColor("#ffff0000"))
        aBar?.setBackgroundDrawable(cd)

        val edit1 = findViewById<EditText>(R.id.editText1);
        edit1.background.setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);

        val edit2 = findViewById<EditText>(R.id.editText2);
        edit2.background.setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);

        val button = findViewById<Button>(R.id.btnButton);
        button.setOnClickListener {
            val myIntent = Intent(this, MainActivity2::class.java)
            startActivity(myIntent)
        }
    }
}