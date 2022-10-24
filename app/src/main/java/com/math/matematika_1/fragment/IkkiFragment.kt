package com.math.matematika_1.fragment

import android.media.MediaPlayer
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.math.matematika_1.activity.PlayActivity
import com.example.matematika_1.R
import com.math.matematika_1.dialog.RightDialog
import com.math.matematika_1.dialog.Wrongdialog


class IkkiFragment : Fragment() {
    private var BgMusic: MediaPlayer? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ikki, container, false)
    }

    companion object;

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var t=0
        var f=0

        var i=0
        val rightDialog = RightDialog()
        val wrongdialog= Wrongdialog()

        val image1: ImageView =view.findViewById(R.id.ikki1)
        val image2:ImageView=view.findViewById(R.id.ikki2)
        val textView: TextView =view.findViewById(R.id.answer)
        val btn: Button =view.findViewById(R.id.sound)

        val bundle = this.arguments
        val message:ArrayList<String> = bundle?.getStringArrayList("mText") as ArrayList<String>
        textView.text=message[0]

        val img:ArrayList<Int> = bundle.getIntegerArrayList("image") as ArrayList<Int> /* = java.util.ArrayList<kotlin.Int> */
        image1.setImageResource(img[0])
        image2.setImageResource(img[1])

        val sound:ArrayList<Int> = bundle.getIntegerArrayList("sound") as ArrayList<Int>

        val mFragment = UchFragment()
        val mBundle = Bundle()
        mBundle.putStringArrayList("mText", message)
        mBundle.putIntegerArrayList("image", img)
        mBundle.putIntegerArrayList("sound", PlayActivity.sound)
        mFragment.arguments = mBundle

        image1.setOnClickListener {
            i++
            if (i <= 1) {
                t++
                BgMusic = MediaPlayer.create(context, R.raw.right)
                BgMusic?.start()
                rightDialog.show(fragmentManager, "dsjakh")

                textView.text = message[1]
                image1.setImageResource(img[2])
                image2.setImageResource(img[3])
            } else {
                f++
                wrongdialog.show(fragmentManager, "dsjakh")
                BgMusic = MediaPlayer.create(context, R.raw.wrong)
                BgMusic?.start()
            }
        }
        image2.setOnClickListener {
            if (i >= 1) {
                t++
                BgMusic = MediaPlayer.create(context, R.raw.right)
                BgMusic?.start()
                rightDialog.show(fragmentManager, "dsjakh")
                mBundle.putInt("t", t)
                mBundle.putInt("f", f)
                fragmentManager!!.beginTransaction().replace(R.id.fragment, mFragment).commit()
            } else {
                f++
                wrongdialog.show(fragmentManager, "dsjakh")
                BgMusic = MediaPlayer.create(context, R.raw.wrong)
                BgMusic?.start()
            }
        }
        btn.setOnClickListener {
            if (i < 1) {
                BgMusic = MediaPlayer.create(context, sound[0])
                BgMusic?.start()
            }
            else{
                BgMusic = MediaPlayer.create(context, sound[1])
                BgMusic?.start()
            }
        }

    }
}