package com.example.matematika_1.Fragment

import android.media.MediaPlayer
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.matematika_1.R
import com.example.matematika_1.dialog.MondatDialog
import com.example.matematika_1.dialog.RightDialog
import com.example.matematika_1.dialog.Wrongdialog

class tortFragment : Fragment() {
    private var BgMusic: MediaPlayer? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tort, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance()= tortFragment
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rightDialog = RightDialog()
        val wrongdialog= Wrongdialog()
        val mondatDialog=MondatDialog()

        var i=false
        var j=false
        val bundle = this.arguments
        val message:ArrayList<String> = bundle?.getStringArrayList("mText") as ArrayList<String>
        val img:ArrayList<Int> = bundle?.getIntegerArrayList("image") as ArrayList<Int> /* = java.util.ArrayList<kotlin.Int> */

        val textView:TextView=view.findViewById(R.id.answer)
        val image1: ImageView =view.findViewById(R.id.tort1)
        val image2: ImageView =view.findViewById(R.id.tort2)
        val image3:ImageView=view.findViewById(R.id.tort3)
        val image4:ImageView=view.findViewById(R.id.tort4)

        textView.setText(message[4])
        image1.setImageResource(img[10])
        image2.setImageResource(img[11])
        image3.setImageResource(img[12])
        image4.setImageResource(img[13])

        image1.setOnClickListener {
            i=true
            BgMusic = MediaPlayer.create(context, R.raw.right)
            BgMusic?.start()
            if(i and j){
                mondatDialog.show(fragmentManager,"afghjk")
            }
            else{
                rightDialog.show(fragmentManager,"dsjakh")
            }
        }
        image2.setOnClickListener{
            j=true
            BgMusic = MediaPlayer.create(context, R.raw.right)
            BgMusic?.start()
            if(i and j){
                mondatDialog.show(fragmentManager,"afgdhs")
            }
            else{
                rightDialog.show(fragmentManager,"dsjakh")
            }
        }
        image3.setOnClickListener{
            wrongdialog.show(fragmentManager,"dsjakh")
            BgMusic = MediaPlayer.create(context, R.raw.wrong)
            BgMusic?.start()
        }
        image4.setOnClickListener{
            wrongdialog.show(fragmentManager,"dsjakh")
            BgMusic = MediaPlayer.create(context, R.raw.wrong)
            BgMusic?.start()
        }
    }
}