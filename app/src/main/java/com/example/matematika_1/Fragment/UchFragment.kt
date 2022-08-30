package com.example.matematika_1.Fragment

import android.media.MediaPlayer
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.matematika_1.R
import com.example.matematika_1.dialog.RightDialog
import com.example.matematika_1.dialog.Wrongdialog

class UchFragment : Fragment() {
    private var BgMusic: MediaPlayer? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_uch, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() = UchFragment
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rightDialog = RightDialog()
        val wrongdialog= Wrongdialog()

        var i=0;
        val bundle = this.arguments
        val message:ArrayList<String> = bundle?.getStringArrayList("mText") as ArrayList<String>
        val img:ArrayList<Int> = bundle?.getIntegerArrayList("image") as ArrayList<Int> /* = java.util.ArrayList<kotlin.Int> */

        val mFragment = tortFragment()
        val mBundle = Bundle()
        mBundle.putStringArrayList("mText", message)
        mBundle.putIntegerArrayList("image", img)
        mFragment.arguments = mBundle

        val  textView:TextView=view.findViewById(R.id.answer)
        val image1: ImageView =view.findViewById(R.id.uch1)
        val image2: ImageView =view.findViewById(R.id.uch2)
        val image3:ImageView=view.findViewById(R.id.uch3)

        textView.setText(message[2])
        image1.setImageResource(img[4])
        image2.setImageResource(img[5])
        image3.setImageResource(img[6])

        image1.setOnClickListener(View.OnClickListener {
            i++
            if(i<=1) {
                BgMusic = MediaPlayer.create(context, R.raw.right)
                BgMusic?.start()
                rightDialog.show(fragmentManager,"dsjakh")

                textView.setText(message[3])
                image1.setImageResource(img[7])
                image2.setImageResource(img[8])
                image3.setImageResource(img[9])
            }
            else{
                wrongdialog.show(fragmentManager,"dsjakh")
                BgMusic = MediaPlayer.create(context, R.raw.wrong)
                BgMusic?.start()
            }
        })

        image2.setOnClickListener(View.OnClickListener {
            wrongdialog.show(fragmentManager,"dsjakh")
            BgMusic = MediaPlayer.create(context, R.raw.wrong)
            BgMusic?.start()
        })
        image3.setOnClickListener(View.OnClickListener {
            if(i>=1) {
                BgMusic = MediaPlayer.create(context, R.raw.right)
                BgMusic?.start()
                rightDialog.show(fragmentManager,"dsjakh")
                fragmentManager!!.beginTransaction().replace(R.id.fragment,mFragment).commit()
            }
            else {
                wrongdialog.show(fragmentManager,"dsjakh")
                BgMusic = MediaPlayer.create(context, R.raw.wrong)
                BgMusic?.start()
            }
        })
    }
}