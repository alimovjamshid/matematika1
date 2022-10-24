package com.example.matematika_1.fragment

import android.media.MediaPlayer
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.matematika_1.R
import com.example.matematika_1.dialog.MondatDialog
import com.example.matematika_1.dialog.RightDialog
import com.example.matematika_1.dialog.Wrongdialog

class TortFragment : Fragment() {
    private var BgMusic: MediaPlayer? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tort, container, false)
    }

    companion object;

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rightDialog = RightDialog()
        val wrongdialog= Wrongdialog()
        MondatDialog()

        val mBundle = Bundle()
        var i=false
        var j=false

        val bundle = this.arguments

        val message:ArrayList<String> = bundle?.getStringArrayList("mText") as ArrayList<String>
        val img:ArrayList<Int> = bundle.getIntegerArrayList("image") as ArrayList<Int> /* = java.util.ArrayList<kotlin.Int> */
        val sound:ArrayList<Int> = bundle.getIntegerArrayList("sound") as ArrayList<Int>
        var t:Int= bundle.getInt("t")
        var f:Int= bundle.getInt("f")

        val textView:TextView=view.findViewById(R.id.answer)
        val image1: ImageView =view.findViewById(R.id.tort1)
        val image2: ImageView =view.findViewById(R.id.tort2)
        val image3:ImageView=view.findViewById(R.id.tort3)
        val image4:ImageView=view.findViewById(R.id.tort4)
        val btn: Button =view.findViewById(R.id.sound)

        val mFragment = MondatDialog()
        mFragment.arguments = mBundle

        textView.text = message[4]
        image1.setImageResource(img[10])
        image2.setImageResource(img[11])
        image3.setImageResource(img[12])
        image4.setImageResource(img[13])

        image1.setOnClickListener {
            i=true
            BgMusic = MediaPlayer.create(context, R.raw.right)
            BgMusic?.start()
            if(i and j){
                mBundle.putInt("t",t)
                mBundle.putInt("f",f)
                fragmentManager!!.beginTransaction().add(R.id.fragment,mFragment).commit()
            }
            else{
                t++
                rightDialog.show(fragmentManager,"dsjakh")
            }
        }
        image2.setOnClickListener{
            j=true
            BgMusic = MediaPlayer.create(context, R.raw.right)
            BgMusic?.start()
            if(i and j){
                mBundle.putInt("t",t)
                mBundle.putInt("f",f)
                mFragment.arguments = mBundle
                fragmentManager!!.beginTransaction().add(R.id.fragment,mFragment).commit()
            }
            else{
                t++
                rightDialog.show(fragmentManager,"dsjakh")
            }
        }
        image3.setOnClickListener{
            wrongdialog.show(fragmentManager,"dsjakh")
            BgMusic = MediaPlayer.create(context, R.raw.wrong)
            BgMusic?.start()
            f++
        }
        image4.setOnClickListener{
            wrongdialog.show(fragmentManager,"dsjakh")
            BgMusic = MediaPlayer.create(context, R.raw.wrong)
            BgMusic?.start()
            f++
        }
        btn.setOnClickListener {
            BgMusic = MediaPlayer.create(context, sound[4])
            BgMusic?.start()
        }
    }
}