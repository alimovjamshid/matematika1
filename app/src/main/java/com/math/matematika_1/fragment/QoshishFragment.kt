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
import com.math.matematika_1.dialog.MondatDialog
import com.math.matematika_1.dialog.RightDialog
import com.math.matematika_1.dialog.Wrongdialog

class QoshishFragment : Fragment() {
    private var BgMusic: MediaPlayer? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_qoshish, container, false)
    }

    companion object;
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var t=0
        var f=0

        var i=0
        val rightDialog = RightDialog()
        val wrongdialog= Wrongdialog()


        val img1:ImageView=view.findViewById(R.id.img1)
        val img2:ImageView=view.findViewById(R.id.img2)
        val img3:ImageView=view.findViewById(R.id.img3)
        val btn:Button=view.findViewById(R.id.btn)
        val txt:TextView=view.findViewById(R.id.txt)

        val bundle = this.arguments
        val message:ArrayList<String> = bundle?.getStringArrayList("mText") as ArrayList<String>
        txt.text=message[0]

        val img:ArrayList<Int> = bundle.getIntegerArrayList("image") as ArrayList<Int> /* = java.util.ArrayList<kotlin.Int> */

        img1.setImageResource(img[0])
        img2.setImageResource(img[1])
        img3.setImageResource(img[2])

        bundle.getIntegerArrayList("sound") as ArrayList<Int>

        val mFragment = MondatDialog()
        val mBundle = Bundle()
        mBundle.putStringArrayList("mText", message)
        mBundle.putIntegerArrayList("image", img)
        mBundle.putIntegerArrayList("sound", PlayActivity.sound)
        mFragment.arguments = mBundle

        img2.setOnClickListener {
            i++
            when(t){
                0->{
                    t++
                    BgMusic = MediaPlayer.create(context, R.raw.right)
                    BgMusic?.start()

                    rightDialog.show(fragmentManager,"fghjk")
                    txt.text = PlayActivity.datatext[1]
                    img2.setImageResource(PlayActivity.img[3])
                    img3.setImageResource(PlayActivity.img[4])
                }
                2->{
                    t++
                    BgMusic = MediaPlayer.create(context, R.raw.right)
                    BgMusic?.start()
                    rightDialog.show(fragmentManager,"fghjk")

                    txt.text = PlayActivity.datatext[3]
                    img2.setImageResource(PlayActivity.img[7])
                    img3.setImageResource(PlayActivity.img[8])
                }
                else-> {
                    f++
                    wrongdialog.show(fragmentManager,"fghjk")
                    BgMusic = MediaPlayer.create(context, R.raw.wrong)
                    BgMusic?.start()
                }
            }
        }
        img3.setOnClickListener {
            i++
            when(t){
                1->{
                    t++
                    BgMusic = MediaPlayer.create(context, R.raw.right)
                    BgMusic?.start()
                    rightDialog.show(fragmentManager,"fghjk")

                    txt.text = PlayActivity.datatext[2]
                    img2.setImageResource(PlayActivity.img[5])
                    img3.setImageResource(PlayActivity.img[6])
                }
                3->{
                    t++
                    BgMusic = MediaPlayer.create(context, R.raw.right)
                    BgMusic?.start()
                    rightDialog.show(fragmentManager,"fghjk")

                    mBundle.putInt("t",t)
                    mBundle.putInt("f",f)
                    mFragment.arguments = mBundle
                    fragmentManager!!.beginTransaction().add(R.id.fragment,mFragment).commit()
                }
                else->{
                    f++
                    wrongdialog.show(fragmentManager,"dfghjkl")
                    BgMusic = MediaPlayer.create(context, R.raw.wrong)
                    BgMusic?.start()
                }
            }
        }
        btn.setOnClickListener {
            if (t == 0) {
                BgMusic = MediaPlayer.create(context, PlayActivity.sound[0])
                BgMusic?.start()
            }
            if (t == 1) {
                BgMusic = MediaPlayer.create(context, PlayActivity.sound[1])
                BgMusic?.start()
            }
            if (t == 2) {
                BgMusic = MediaPlayer.create(context, PlayActivity.sound[2])
                BgMusic?.start()
            }
            if (t == 3) {
                BgMusic = MediaPlayer.create(context, PlayActivity.sound[3])
                BgMusic?.start()
            }
        }

    }
}