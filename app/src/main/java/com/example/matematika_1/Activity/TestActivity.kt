package com.example.matematika_1.Activity


import android.os.Bundle
import com.example.matematika_1.Fragment.IkkiFragment
import com.example.matematika_1.R


class TestActivity : PlayActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val mFragment = IkkiFragment()
        val mBundle = Bundle()
        mBundle.putStringArrayList("mText", datatext)
        mBundle.putIntegerArrayList("image", img)
        mBundle.putIntegerArrayList("sound", sound)
        mFragment.arguments = mBundle
        supportFragmentManager.beginTransaction().replace(R.id.fragment,mFragment).commit()
    }
}