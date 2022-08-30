package com.example.matematika_1.Fragment

import android.app.AlertDialog
import android.app.Dialog
import android.app.FragmentTransaction.TRANSIT_FRAGMENT_OPEN
import android.content.Context
import android.content.DialogInterface
import android.media.AudioManager
import android.media.MediaPlayer
import android.media.SoundPool
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v4.app.FragmentTransaction.TRANSIT_FRAGMENT_OPEN
import android.support.v4.internal.view.SupportSubMenu
import android.support.v7.view.SupportMenuInflater
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.matematika_1.Activity.PlayActivity
import com.example.matematika_1.R
import com.example.matematika_1.dialog.RightDialog
import com.example.matematika_1.dialog.Wrongdialog

class IkkiFragment : Fragment() {
    private var BgMusic: MediaPlayer? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ikki, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance()= IkkiFragment
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var t=0
        var f=0

        var i=0
        val rightDialog = RightDialog()
        val wrongdialog=Wrongdialog()

        val image1:ImageView=view.findViewById(R.id.ikki1)
        val image2:ImageView=view.findViewById(R.id.ikki2)
        val textView:TextView=view.findViewById(R.id.answer)
        val btn:Button=view.findViewById(R.id.sound)

        val bundle = this.arguments
        val message:ArrayList<String> = bundle?.getStringArrayList("mText") as ArrayList<String>
        textView.text=message[0]

        val img:ArrayList<Int> = bundle?.getIntegerArrayList("image") as ArrayList<Int> /* = java.util.ArrayList<kotlin.Int> */
        image1.setImageResource(img[0])
        image2.setImageResource(img[1])

        val mFragment = UchFragment()
        val mBundle = Bundle()
        mBundle.putStringArrayList("mText", message)
        mBundle.putIntegerArrayList("image", img)
        mFragment.arguments = mBundle

        image1.setOnClickListener(View.OnClickListener {
            i++
            if(i<=1) {
                t++
                BgMusic = MediaPlayer.create(context, R.raw.right)
                BgMusic?.start()
                rightDialog.show(fragmentManager,"dsjakh")

                textView.setText(message[1])
                image1.setImageResource(img[2])
                image2.setImageResource(img[3])
            }
            else{
                f++
                wrongdialog.show(fragmentManager,"dsjakh")
                BgMusic = MediaPlayer.create(context, R.raw.wrong)
                BgMusic?.start()
            }
        })
        image2.setOnClickListener(View.OnClickListener {
            if(i>=1) {
                t++
                BgMusic = MediaPlayer.create(context, R.raw.right)
                BgMusic?.start()
                rightDialog.show(fragmentManager, "dsjakh")
                fragmentManager!!.beginTransaction().replace(R.id.fragment,mFragment).commit()
            }
            else {
                f++
                wrongdialog.show(fragmentManager,"dsjakh")
                BgMusic = MediaPlayer.create(context, R.raw.wrong)
                BgMusic?.start()
            }
        })
        btn.setOnClickListener{

        }

    }
}