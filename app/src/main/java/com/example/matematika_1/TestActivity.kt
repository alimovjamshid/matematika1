package com.example.matematika_1


import android.os.Bundle


class TestActivity : PlayActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val mFragment = IkkiFragment()
        val mBundle = Bundle()
        mBundle.putStringArrayList("mText", datatext)
        mBundle.putIntegerArrayList("image", img)
        mFragment.arguments = mBundle
        supportFragmentManager.beginTransaction().add(R.id.fragment,mFragment).commit()
    }
}