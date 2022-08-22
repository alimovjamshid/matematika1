package com.example.matematika_1.Activity

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.matematika_1.R

class DoraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dora)

        val btnha=findViewById<Button>(R.id.btnha)
        val btnyoq=findViewById<Button>(R.id.btnyoq)
        val imageView=findViewById<ImageView>(R.id.imageView)
        val textView=findViewById<TextView>(R.id.textView2)

        textView.setText("Bu doira bo'la oladimi?")
        imageView.setImageResource(R.drawable.img_39)

        btnha.setOnClickListener(View.OnClickListener {
            Toast.makeText(applicationContext,"True",Toast.LENGTH_SHORT).show()
            imageView.setImageResource(R.drawable.img_40)
        })
        btnyoq.setOnClickListener(View.OnClickListener {

        })

    }
}