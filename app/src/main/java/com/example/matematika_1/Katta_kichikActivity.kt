package com.example.matematika_1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle


class Katta_kichikActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_katta_kichik)

        supportFragmentManager.beginTransaction().replace(R.id.fragment,IkkiFragment()).commit()
    }
}