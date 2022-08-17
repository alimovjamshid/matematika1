package com.example.matematika_1


import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast


class Katta_kichikActivity : PlayActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_katta_kichik)

        val fragment=IkkiFragment()
        val bundle=Bundle()
        bundle.putString("10", data[0].toString())
        fragment.arguments=bundle
        supportFragmentManager.beginTransaction().replace(R.id.fragment,IkkiFragment()).commit()

    }
}