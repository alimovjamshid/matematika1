package com.example.matematika_1.Activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import com.example.matematika_1.Adapter.CustomAdapter
import com.example.matematika_1.Item
import com.example.matematika_1.R

open class PlayActivity : AppCompatActivity() {

    companion object {
        var datatext= ArrayList<String>()
        var img= ArrayList<Int>()
    }
    lateinit var courseGRV: GridView
    lateinit var courseList: List<Item>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)

        courseGRV = findViewById(R.id.gridview)
        courseList = ArrayList<Item>()

        // on below line we are adding data to
        // our course list with image and course name.
        courseList = courseList + Item("Katta-kichik", R.drawable.katta_kichik)
        courseList = courseList + Item("Baland-past", R.drawable.baland)
        courseList = courseList + Item("Keng-tor", R.drawable.keng)
        courseList = courseList + Item("Qalin-yupqa", R.drawable.qalin)
        courseList = courseList + Item("Uzun-qisqa", R.drawable.uzun)
        courseList = courseList + Item("Doira", R.drawable.doira)
        courseList = courseList + Item("Ko'p-kam", R.drawable.kop)
        courseList = courseList + Item("Barovar", R.drawable.barovar)
        courseList = courseList + Item("Yaqin-uzoq", R.drawable.yaqin)
        courseList = courseList + Item("Yuqorida-pastda", R.drawable.yuqori)
        courseList = courseList + Item("O'ngda-chapda", R.drawable.ong)
        courseList = courseList + Item("Uchburchak", R.drawable.uchberchak)
        courseList = courseList + Item("Yonida", R.drawable.yonida)
        courseList = courseList + Item("To'g'ri to'rtburchak", R.drawable.tortburchak)
        courseList = courseList + Item("Birinchi-oxirgi", R.drawable.birinchi)
        courseList = courseList + Item("Og'ir-yengil", R.drawable.ogir)
        courseList = courseList + Item("Ertalab-kechqurun", R.drawable.ertalab)
        courseList = courseList + Item("Qo'shish-ayirish", R.drawable.qoshish)
        courseList = courseList + Item("Kvadrat", R.drawable.kvadrat)
        courseList = courseList + Item("1 soni va raqami", R.drawable.bir)
        courseList = courseList + Item("Nuqta va chiziq", R.drawable.nuqta)
        courseList = courseList + Item("2 soni va raqami", R.drawable.ikki)
        courseList = courseList + Item("3 soni va raqami", R.drawable.uch)
        courseList = courseList + Item("4 soni va raqami", R.drawable.tort)
        courseList = courseList + Item("5 soni va raqami", R.drawable.besh)
        courseList = courseList + Item("0 soni va raqami", R.drawable.nol)
        courseList = courseList + Item("6 soni va raqami", R.drawable.olti)
        courseList = courseList + Item("7 soni va raqami", R.drawable.yetti)
        courseList = courseList + Item("8 soni va raqami", R.drawable.sakkiz)
        courseList = courseList + Item("To'g'ri chiziq yasash", R.drawable.togrichiziq)
        courseList = courseList + Item("Shar va kub", R.drawable.shar)
        courseList = courseList + Item("9 soni va raqami", R.drawable.toqqiz)
        courseList = courseList + Item("10 soni va raqami", R.drawable.on)

        val courseAdapter = CustomAdapter(courseList = courseList, this@PlayActivity)

        courseGRV.adapter = courseAdapter

        courseGRV.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->

            when(position) {
                0 -> {
                    datatext.clear()
                    datatext.add("Qaysi mashina katta?")
                    datatext.add("Qaysi qush kichik?")
                    datatext.add("Qaysi koptok katta?")
                    datatext.add("Qaysi chelak kichik?")
                    datatext.add("Qaysi shakllar bir xil kattalikda?")

                    img.clear()
                    //mashina
                    img.add(R.drawable.img)
                    img.add(R.drawable.img_1)
                    //qush
                    img.add(R.drawable.img_3)
                    img.add(R.drawable.img_2)
                    //koptok
                    img.add(R.drawable.img_4)
                    img.add(R.drawable.img_5)
                    img.add(R.drawable.img_6)
                    //Chelak
                    img.add(R.drawable.img_7)
                    img.add(R.drawable.img_8)
                    img.add(R.drawable.img_8)
                    //bir xil kattalik
                    img.add(R.drawable.img_9)
                    img.add(R.drawable.img_10)
                    img.add(R.drawable.img_11)
                    img.add(R.drawable.img_12)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                1->{
                    datatext.clear()
                    datatext.add("Qaysi archa baland?")
                    datatext.add("Qaysi archa past?")
                    datatext.add("Qaysi bino baland")
                    datatext.add("Qaysi bino past?")
                    datatext.add("Qaysi bino va archa baland?")

                    img.clear()
                    //archa balan
                    img.add(R.drawable.img_13)
                    img.add(R.drawable.img_14)
                    //archa past
                    img.add(R.drawable.img_13)
                    img.add(R.drawable.img_14)
                    //bino baland
                    img.add(R.drawable.img_15)
                    img.add(R.drawable.img_16)
                    img.add(R.drawable.img_17)
                    //bino past
                    img.add(R.drawable.img_15)
                    img.add(R.drawable.img_16)
                    img.add(R.drawable.img_17)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                2->{
                    datatext.clear()
                    datatext.add("Enli taxtani ko ‘rsating")
                    datatext.add("Ensiz taxtani ko ‘rsating")
                    datatext.add("Qaysi lentalar bir xil kenglikda?")
                    datatext.add("Bir xil o ‘lchamdagi narvonlarni ko ‘rsating")
                    datatext.add("enli taxta bilan ensiz lentani ko 'rsating")
                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
            }
        }

    }
}