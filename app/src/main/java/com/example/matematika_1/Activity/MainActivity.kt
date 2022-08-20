package com.example.matematika_1.Activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ImageView
import com.example.matematika_1.R

class MainActivity : AppCompatActivity() {
    lateinit var btn:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn=findViewById(R.id.play)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        btn.setOnClickListener(View.OnClickListener {
            btn.setColorFilter(R.drawable.play)
            val intent=Intent(this, PlayActivity::class.java)
            startActivity(intent)
            btn.setColorFilter(R.color.main)
        })
    }

}