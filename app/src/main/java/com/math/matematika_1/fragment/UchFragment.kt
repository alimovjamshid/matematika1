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

class UchFragment : Fragment() {
    private var BgMusic: MediaPlayer? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_uch, container, false)
    }

    companion object;

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rightDialog = RightDialog()
        val wrongdialog= Wrongdialog()

        var i=0
        val bundle = this.arguments
        val message:ArrayList<String> = bundle?.getStringArrayList("mText") as ArrayList<String>  //answer
        val img:ArrayList<Int> = bundle.getIntegerArrayList("image") as ArrayList<Int> //image
        val sound:ArrayList<Int> = bundle.getIntegerArrayList("sound") as ArrayList<Int>
        var t:Int= bundle.getInt("t")  //true
        var f:Int= bundle.getInt("f")  //false

        val mFragment = TortFragment()
        val mBundle = Bundle()
        mBundle.putStringArrayList("mText", message)
        mBundle.putIntegerArrayList("image", img)
        mBundle.putIntegerArrayList("sound", PlayActivity.sound)
        mFragment.arguments = mBundle

        val  textView:TextView=view.findViewById(R.id.answer)
        val image1: ImageView =view.findViewById(R.id.uch1)
        val image2: ImageView =view.findViewById(R.id.uch2)
        val image3:ImageView=view.findViewById(R.id.uch3)
        val btn:Button=view.findViewById(R.id.sound)

        textView.text = message[2]
        image1.setImageResource(img[4])
        image2.setImageResource(img[5])
        image3.setImageResource(img[6])

        image1.setOnClickListener {
            i++
            if (i <= 1) {
                t++
                BgMusic = MediaPlayer.create(context, R.raw.right)
                BgMusic?.start()
                rightDialog.show(fragmentManager, "dsjakh")
                textView.text = message[3]
                image1.setImageResource(img[7])
                image2.setImageResource(img[8])
                image3.setImageResource(img[9])
            } else {
                f++
                wrongdialog.show(fragmentManager, "dsjakh")
                BgMusic = MediaPlayer.create(context, R.raw.wrong)
                BgMusic?.start()
            }
        }

        image2.setOnClickListener {
            f++
            wrongdialog.show(fragmentManager, "dsjakh")
            BgMusic = MediaPlayer.create(context, R.raw.wrong)
            BgMusic?.start()
        }
        image3.setOnClickListener {
            if (i >= 1) {
                t++
                BgMusic = MediaPlayer.create(context, R.raw.right)
                BgMusic?.start()
                rightDialog.show(fragmentManager, "dsjakh")
                mBundle.putInt("t", t)
                mBundle.putInt("f", f)
                fragmentManager!!.beginTransaction().replace(R.id.fragment, mFragment).commit()
            } else {
                wrongdialog.show(fragmentManager, "dsjakh")
                BgMusic = MediaPlayer.create(context, R.raw.wrong)
                BgMusic?.start()
            }
        }
        btn.setOnClickListener {
            if (i < 1) {
                BgMusic = MediaPlayer.create(context, sound[2])
                BgMusic?.start()
            }
            else{
                BgMusic = MediaPlayer.create(context, sound[3])
                BgMusic?.start()
            }
        }
    }
}