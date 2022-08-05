package com.example.matematika_1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast

class PlayActivity : AppCompatActivity() {
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
        courseList = courseList + Item("Og'ir-yengil", R.drawable.img_1)
        courseList = courseList + Item("Ertalab-kechqurun", R.drawable.img)
        courseList = courseList + Item("Qo'shish-ayirish", R.drawable.qoshish)
        courseList = courseList + Item("Kvadrat", R.drawable.img_2)
        courseList = courseList + Item("1 soni va raqami", R.drawable.bir)
        courseList = courseList + Item("Nuqta va chiziq", R.drawable.img_3)
        courseList = courseList + Item("2 soni va raqami", R.drawable.ikki)
        courseList = courseList + Item("3 soni va raqami", R.drawable.uch)
        courseList = courseList + Item("4 soni va raqami", R.drawable.tort)
        courseList = courseList + Item("5 soni va raqami", R.drawable.besh)
        courseList = courseList + Item("0 soni va raqami", R.drawable.nol)
        courseList = courseList + Item("6 soni va raqami", R.drawable.olti)
        courseList = courseList + Item("7 soni va raqami", R.drawable.img_4)
        courseList = courseList + Item("8 soni va raqami", R.drawable.img_5)
        courseList = courseList + Item("To'g'ri chiziq yasash", R.drawable.img_6)
        courseList = courseList + Item("Shar va kub", R.drawable.img_7)
        courseList = courseList + Item("9 soni va raqami", R.drawable.img_8)
        courseList = courseList + Item("10 soni va raqami", R.drawable.img_9)

        // on below line we are initializing our course adapter
        // and passing course list and context.
        val courseAdapter = CustomAdapter(courseList = courseList, this@PlayActivity)

        // on below line we are setting adapter to our grid view.
        courseGRV.adapter = courseAdapter

        // on below line we are adding on item
        // click listener for our grid view.
        courseGRV.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            // inside on click method we are simply displaying
            // a toast message with course name.
            Toast.makeText(
                applicationContext, courseList[position].name + " selected",
                Toast.LENGTH_SHORT
            ).show()
        }

    }
}