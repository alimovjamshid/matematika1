package com.example.matematika_1.Activity

import android.app.Activity
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.matematika_1.R
import com.example.matematika_1.dialog.RightDialog
import com.example.matematika_1.dialog.Wrongdialog

open class NavbatActivity : PlayActivity() {
    private var BgMusic: MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navbat)

        var t=0
        var f=0

        var i=0
        val rightDialog = RightDialog()
        val wrongdialog = Wrongdialog()

        val img1:ImageView=findViewById(R.id.img1)
        val img2:ImageView=findViewById(R.id.img2)
        val img3:ImageView=findViewById(R.id.img3)
        val btn:Button=findViewById(R.id.btn)
        val txt:TextView=findViewById(R.id.txt)

        img1.setImageResource(img[0])
        img2.setImageResource(img[1])
        img3.setImageResource(img[2])

        txt.setText(datatext[0])

        img2.setOnClickListener {
            i++
            when(t){
                0->{
                    t++
                    BgMusic = MediaPlayer.create(this, R.raw.right)
                    BgMusic?.start()
                    rightDialog.onCreate(Bundle())

                    txt.setText(datatext[1])
                    img2.setImageResource(img[3])
                    img3.setImageResource(img[4])
                }
                2->{
                    t++
                    BgMusic = MediaPlayer.create(this, R.raw.right)
                    BgMusic?.start()
                    // rightDialog.show(this,"dsjakh")

                    txt.setText(datatext[3])
                    img2.setImageResource(img[7])
                    img3.setImageResource(img[8])
                }
                else-> {
                    f++
                    //wrongdialog.show(baseContext,"dsjakh")
                    BgMusic = MediaPlayer.create(this, R.raw.wrong)
                    BgMusic?.start()
                }
            }
        }

        img3.setOnClickListener {
            i++
            when(t){
                1->{
                    t++
                    BgMusic = MediaPlayer.create(this, R.raw.right)
                    BgMusic?.start()
                    //rightDialog.show(this,"dsjakh")

                    txt.setText(datatext[2])
                    img2.setImageResource(img[5])
                    img3.setImageResource(img[6])
                }
                3->{
                    t++
                    BgMusic = MediaPlayer.create(this, R.raw.right)
                    BgMusic?.start()
                    //rightDialog.show(this,"dsjakh")

                    //txt.setText(datatext[3])
                    /*img2.setImageResource(img[9])
                    img3.setImageResource(img[10])*/
                }
                else->{
                    f++
                    //wrongdialog.show(baseContext,"dsjakh")
                    BgMusic = MediaPlayer.create(this, R.raw.wrong)
                    BgMusic?.start()
                }
            }
        }

        btn.setOnClickListener {
            if (t == 0) {
                BgMusic = MediaPlayer.create(this, sound[0])
                BgMusic?.start()
            }
            if (t == 1) {
                BgMusic = MediaPlayer.create(this, sound[1])
                BgMusic?.start()
            }
            if (t == 2) {
                BgMusic = MediaPlayer.create(this, sound[2])
                BgMusic?.start()
            }
            if (t == 3) {
                BgMusic = MediaPlayer.create(this, sound[3])
                BgMusic?.start()
            }
        }
    }
}