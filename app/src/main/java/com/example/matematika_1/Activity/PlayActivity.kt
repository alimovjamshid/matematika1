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
        val t=0
        val f=0
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
                    //Katta-kichik
                    datatext.clear()
                    datatext.add("Qaysi mashina katta?")
                    datatext.add("Qaysi qush kichik?")
                    datatext.add("Qaysi koptok katta?")
                    datatext.add("Qaysi chelak katta?")
                    datatext.add("Qaysi shakllar bir xil kattalikda?")

                    img.clear()
                    //mashina
                    img.add(R.drawable.im)  //true
                    img.add(R.drawable.im_1)
                    //qush
                    img.add(R.drawable.i)
                    img.add(R.drawable.i_1)  //true
                    //koptok
                    img.add(R.drawable.im_4)  //true
                    img.add(R.drawable.im_5)
                    img.add(R.drawable.im_6)
                    //Chelak
                    img.add(R.drawable.im_8)
                    img.add(R.drawable.im_8)
                    img.add(R.drawable.im_7)  //true
                    //bir xil kattalik
                    img.add(R.drawable.im_9)  //true
                    img.add(R.drawable.im_10)  //true
                    img.add(R.drawable.im_11)
                    img.add(R.drawable.img)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                1->{
                    //Baland-past
                    datatext.clear()
                    datatext.add("Qaysi archa baland?")
                    datatext.add("Qaysi archa past?")
                    datatext.add("Qaysi bino baland")
                    datatext.add("Qaysi bino past?")
                    datatext.add("Qaysi bino va archa baland?")

                    img.clear()
                    //archa balan
                    img.add(R.drawable.im_13)
                    img.add(R.drawable.im_14)
                    //archa past
                    img.add(R.drawable.im_13)
                    img.add(R.drawable.im_14)
                    //bino baland
                    img.add(R.drawable.im_17)
                    img.add(R.drawable.im_16)
                    img.add(R.drawable.aa)
                    //bino past
                    img.add(R.drawable.aa)
                    img.add(R.drawable.im_17)
                    img.add(R.drawable.im_16)
                    //archa bilan bino
                    img.add(R.drawable.im_13)
                    img.add(R.drawable.im_17)
                    img.add(R.drawable.aa)
                    img.add(R.drawable.im_16)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                2->{
                    //Keng-tor
                    datatext.clear()
                    datatext.add("Enli taxtani ko ‘rsating")
                    datatext.add("Ensiz taxtani ko ‘rsating")
                    datatext.add("Qaysi lenta enli?")
                    datatext.add("Qaysi lenta ensiz?")
                    datatext.add("Qaysi taxta va lenta enli?")

                    img.clear()
                    //enli taxta
                    img.add(R.drawable.img_1)
                    img.add(R.drawable.img_2)
                    //ensiz taxta
                    img.add(R.drawable.img_1)
                    img.add(R.drawable.img_2)
                    //Enli lenta
                    img.add(R.drawable.img_3)
                    img.add(R.drawable.img_4)
                    img.add(R.drawable.img_5)
                    //ensiz lenta
                    img.add(R.drawable.img_5)
                    img.add(R.drawable.img_3)
                    img.add(R.drawable.img_4)
                    //enli taxta ensiz lenta
                    img.add(R.drawable.img_1)
                    img.add(R.drawable.img_3)
                    img.add(R.drawable.img_4)
                    img.add(R.drawable.img_2)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                3->{
                    //Qalin-yupqa
                    datatext.clear()
                    datatext.add("Qaysi kitob qalin?")
                    datatext.add("Qaysi kitob yupqa?")
                    datatext.add("Qaysi daraxt qalin?")
                    datatext.add("Qaysi daraxt yupqa?")
                    datatext.add("Qaysi kitob va daraxt qalin?")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_6)
                    img.add(R.drawable.img_7)
                    //yupqa kitob
                    img.add(R.drawable.img_6)
                    img.add(R.drawable.img_7)
                    //qalin daraxt
                    img.add(R.drawable.img_8)
                    img.add(R.drawable.img_9)
                    img.add(R.drawable.img_9)
                    //yupqa daraxt
                    img.add(R.drawable.img_8)
                    img.add(R.drawable.im_13)
                    img.add(R.drawable.img_9)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_8)
                    img.add(R.drawable.img_6)
                    img.add(R.drawable.img_7)
                    img.add(R.drawable.img_9)
                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                4->{
                    //Uzun-qisqa
                    datatext.clear()
                    datatext.add("Uzun yo'lni belgilang")
                    datatext.add("Qisqa yo'lni belgilang")
                    datatext.add("Qaysi biri uzun tasma?")
                    datatext.add("Qaysi biri qisqa tasma?")
                    datatext.add("Uzunligi teng tasmalarni belgilang")

                    img.clear()
                    //uzun y6l
                    img.add(R.drawable.img_12)
                    img.add(R.drawable.img_10)
                    //qisqa y6l
                    img.add(R.drawable.img_12)
                    img.add(R.drawable.img_10)
                    //qalin daraxt
                    img.add(R.drawable.img_13)
                    img.add(R.drawable.img_14)
                    img.add(R.drawable.img_15)
                    //yupqa daraxt
                    img.add(R.drawable.img_15)
                    img.add(R.drawable.img_13)
                    img.add(R.drawable.img_14)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_16)
                    img.add(R.drawable.img_17)
                    img.add(R.drawable.img_14)
                    img.add(R.drawable.img_15)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                5->{
                    val intent=Intent(this,DoraActivity::class.java)
                    startActivity(intent)
                }
                6->{
                    //Ko'p-kam
                    datatext.clear()
                    datatext.add("Qaysi rasmdagi jo'jalar ko'p?")
                    datatext.add("Qaysi rasmdagi jo'jalar kam?")
                    datatext.add("Ko'p pufaklarni belgilang")
                    datatext.add("Kam pufaklarni belgilang")
                    datatext.add("ko'p jo'ja va pufakni belgilang")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_18)
                    img.add(R.drawable.img_19)
                    //yupqa kitob
                    img.add(R.drawable.img_18)
                    img.add(R.drawable.img_19)
                    //qalin daraxt
                    img.add(R.drawable.img_20)
                    img.add(R.drawable.img_21)
                    img.add(R.drawable.img_22)
                    //yupqa daraxt
                    img.add(R.drawable.img_22)
                    img.add(R.drawable.img_20)
                    img.add(R.drawable.img_21)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_18)
                    img.add(R.drawable.img_20)
                    img.add(R.drawable.img_22)
                    img.add(R.drawable.img_19)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                7->{
                    //Barovar-teng
                }
                8->{
                    //Yaqin-uzoq
                }
                9->{

                }
                10->{
                    //O'ngda-chapda
                    datatext.clear()
                    datatext.add("O'ng tomonni ko'rsating")
                    datatext.add("Chap tomonni ko'rsating")
                    datatext.add("Tepani tomonni ko'rsating")
                    datatext.add("Past yomonni ko'rsating")
                    datatext.add("Chap va tepa tomonlarini ko'rsating")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_24)
                    img.add(R.drawable.img_23)
                    //yupqa kitob
                    img.add(R.drawable.img_24)
                    img.add(R.drawable.img_23)
                    //qalin daraxt
                    img.add(R.drawable.img_25)
                    img.add(R.drawable.img_24)
                    img.add(R.drawable.img_23)
                    //yupqa daraxt
                    img.add(R.drawable.img_24)
                    img.add(R.drawable.img_25)
                    img.add(R.drawable.img_26)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_23)
                    img.add(R.drawable.img_25)
                    img.add(R.drawable.img_24)
                    img.add(R.drawable.img_26)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                11->{
                    //yonida
                }
                12->{
                    //togri tortburchak
                }
                13->{
                    //birinchi va oxirgi
                }
                14->{

                }
                15->{
                    //ogir yengil
                    datatext.clear()
                    datatext.add("Qaysi savatdagi olmalar og'ir?")
                    datatext.add("Qaysi savatdagi olmalar yengil?")
                    datatext.add("Eng og'irini ko'rsating")
                    datatext.add("Eng yengilini ko'rsating")
                    datatext.add("Eng og'iri va yengilini ko'rsating")


                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_27)
                    img.add(R.drawable.img_28)
                    //yupqa kitob
                    img.add(R.drawable.img_27)
                    img.add(R.drawable.img_28)
                    //qalin daraxt
                    img.add(R.drawable.img_29)
                    img.add(R.drawable.img_30)
                    img.add(R.drawable.img_31)
                    //yupqa daraxt
                    img.add(R.drawable.img_31)
                    img.add(R.drawable.img_29)
                    img.add(R.drawable.img_30)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_32)
                    img.add(R.drawable.img_30)
                    img.add(R.drawable.img_29)
                    img.add(R.drawable.img_31)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                16->{
                    //ertalab kunduzi
                    datatext.clear()
                    datatext.add("Badan tarbiyani vaqtini ko'rsating")
                    datatext.add("Uxlash vaqtini ko'rsating")
                    datatext.add("Maktabga borish vaqtini ko'rsating")
                    datatext.add("Dars qilish vaqtini ko'rsating")
                    datatext.add("Yuvinish va nonushta vaqti")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_33)
                    img.add(R.drawable.img_34)
                    //yupqa kitob
                    img.add(R.drawable.img_34)
                    img.add(R.drawable.img_35)
                    //qalin daraxt
                    img.add(R.drawable.img_36)
                    img.add(R.drawable.img_34)
                    img.add(R.drawable.img_33)
                    //yupqa daraxt
                    img.add(R.drawable.img_38)
                    img.add(R.drawable.img_34)
                    img.add(R.drawable.img_37)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_38)
                    img.add(R.drawable.img_34)
                    img.add(R.drawable.img_33)
                    img.add(R.drawable.img_36)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                17->{
                    //Kvadrat
                }
                18->{
                    //1 soni va raqami
                }
                19->{
                    //Nuqta va chiziq
                }
                20->{
                    //2 soni va raqami
                }
                21->{
                    //3 soni va raqami
                }
                22->{
                    //4 soni va raqami
                }
                23->{
                    //5 soni va raqami
                }
                24->{
                    //6 soni va raqami
                }
                25->{
                    //7 soni va raqami
                }
                26->{
                    //8 soni va raqami
                }
                27->{
                    //To'g'ri chiziq yasash
                }
                28->{
                    //Shar va kub
                }
                29->{
                    //9 soni va raqami
                }
                30->{
                    //10 soni va raqami
                }
            }
        }

    }
}