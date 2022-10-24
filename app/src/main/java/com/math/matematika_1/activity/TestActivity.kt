package com.math.matematika_1.activity


import android.os.Bundle
import com.math.matematika_1.fragment.IkkiFragment
import com.math.matematika_1.fragment.QoshishFragment
import com.example.matematika_1.R


class TestActivity : PlayActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val nFragment = QoshishFragment()
        val mFragment = IkkiFragment()
        val mBundle = Bundle()
        mBundle.putStringArrayList("mText", datatext)
        mBundle.putIntegerArrayList("image", img)
        mBundle.putIntegerArrayList("sound", sound)
        nFragment.arguments = mBundle
        mFragment.arguments = mBundle
        if (boolean[0] == 1) {
            supportFragmentManager.beginTransaction().replace(R.id.fragment, mFragment).commit()
        }
        else{
            supportFragmentManager.beginTransaction().replace(R.id.fragment, nFragment).commit()
        }
    }
}