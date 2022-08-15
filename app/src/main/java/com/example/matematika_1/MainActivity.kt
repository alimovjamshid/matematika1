package com.example.matematika_1

import android.content.Intent
import android.graphics.Color
import android.graphics.ColorFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        val btn=findViewById<ImageView>(R.id.play)
        btn.setOnClickListener(View.OnClickListener {
            btn.setColorFilter(R.drawable.play)
            val intent=Intent(this,PlayActivity::class.java)
            startActivity(intent)
            btn.setColorFilter(R.color.main)
        })
    }
}