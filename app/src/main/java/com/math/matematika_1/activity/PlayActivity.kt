package com.math.matematika_1.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import com.math.matematika_1.adapter.CustomAdapter
import com.math.matematika_1.Item
import com.example.matematika_1.R

open class PlayActivity : AppCompatActivity() {

    companion object {
        var datatext= ArrayList<String>()
        var img= ArrayList<Int>()
        var sound=ArrayList<Int>()
        var boolean=ArrayList<Int>()
    }
    private lateinit var courseGRV: GridView
    private lateinit var courseList: List<Item>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)

        courseGRV = findViewById(R.id.gridview)
        courseList = arrayListOf()

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

                    boolean.clear()
                    boolean.add(1)

                    //Katta-kichik
                    datatext.clear()
                    datatext.add("Qaysi moshina katta?")
                    datatext.add("Qaysi qush kichik?")
                    datatext.add("Qaysi biri katta?")
                    datatext.add("Qaysi biri kichik?")
                    datatext.add("Katta mevalarni belgilang")

                    img.clear()
                    //mashina
                    img.add(R.drawable.im)  //true
                    img.add(R.drawable.im_1)
                    //qush
                    img.add(R.drawable.i)
                    img.add(R.drawable.i_1)  //true
                    //koptok
                    img.add(R.drawable.img_1)  //true
                    img.add(R.drawable.img)
                    img.add(R.drawable.img_3)
                    //Chelak
                    img.add(R.drawable.img_6)
                    img.add(R.drawable.img_5)
                    img.add(R.drawable.img_4)  //true
                    //bir xil kattalik
                    img.add(R.drawable.img_127)  //true
                    img.add(R.drawable.img_128)  //true
                    img.add(R.drawable.img_129)
                    img.add(R.drawable.img_130)

                    sound.clear()
                    sound.add(R.raw.a1)
                    sound.add(R.raw.a2)
                    sound.add(R.raw.a3)
                    sound.add(R.raw.a4)
                    sound.add(R.raw.a5)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                1->{

                    boolean.clear()
                    boolean.add(1)

                    //Baland-past
                    datatext.clear()
                    datatext.add("Qaysi biri baland?")
                    datatext.add("Qaysi biri past?")
                    datatext.add("Qaysi bino baland")
                    datatext.add("Qaysi bino past?")
                    datatext.add("Qaysi bino va odam baland?")

                    img.clear()
                    //archa balan
                    img.add(R.drawable.img_7)
                    img.add(R.drawable.img_9)
                    //archa past
                    img.add(R.drawable.img_8)
                    img.add(R.drawable.img_126)
                    //bino baland
                    img.add(R.drawable.img_10)
                    img.add(R.drawable.img_12)
                    img.add(R.drawable.img_11)
                    //bino past
                    img.add(R.drawable.img_11)
                    img.add(R.drawable.img_10)
                    img.add(R.drawable.img_12)
                    //archa bilan bino
                    img.add(R.drawable.img_10)
                    img.add(R.drawable.img_8)
                    img.add(R.drawable.img_126)
                    img.add(R.drawable.img_12)

                    sound.clear()
                    sound.add(R.raw.b1)
                    sound.add(R.raw.b2)
                    sound.add(R.raw.b3)
                    sound.add(R.raw.b4)
                    sound.add(R.raw.b5)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                2->{

                    boolean.clear()
                    boolean.add(1)

                    //Keng-tor
                    datatext.clear()
                    datatext.add("Qaysi daryo keng?")
                    datatext.add("Qaysi gul tor?")
                    datatext.add("Qaysi daraxt enli?")
                    datatext.add("Qaysi daraxt ensiz?")
                    datatext.add("Qaysi daryo va daraxt enli?")

                    img.clear()
                    //enli taxta
                    img.add(R.drawable.img_14)
                    img.add(R.drawable.img_15)
                    //ensiz taxta
                    img.add(R.drawable.img_123)
                    img.add(R.drawable.img_124)
                    //Enli lenta
                    img.add(R.drawable.img_16)
                    img.add(R.drawable.img_17)
                    img.add(R.drawable.img_18)
                    //ensiz lenta
                    img.add(R.drawable.img_18)
                    img.add(R.drawable.img_16)
                    img.add(R.drawable.img_17)
                    //enli taxta ensiz lenta
                    img.add(R.drawable.img_16)
                    img.add(R.drawable.img_14)
                    img.add(R.drawable.img_17)
                    img.add(R.drawable.img_15)

                    sound.clear()
                    sound.add(R.raw.c1)
                    sound.add(R.raw.c2)
                    sound.add(R.raw.c3)
                    sound.add(R.raw.c4)
                    sound.add(R.raw.c5)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                3->{

                    boolean.clear()
                    boolean.add(1)

                    //Qalin-yupqa
                    datatext.clear()
                    datatext.add("Qaysi kitob qalin?")
                    datatext.add("Qaysi bo'lak yupqa?")
                    datatext.add("Qaysi daraxt qalin?")
                    datatext.add("Qaysi daraxt yupqa?")
                    datatext.add("Qaysi kitob va daraxt qalin?")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_6a)
                    img.add(R.drawable.img_7a)
                    //yupqa kitob
                    img.add(R.drawable.img_19)
                    img.add(R.drawable.img_20)
                    //qalin daraxt
                    img.add(R.drawable.img_16)
                    img.add(R.drawable.img_17)
                    img.add(R.drawable.img_18)
                    //yupqa daraxt
                    img.add(R.drawable.img_18)
                    img.add(R.drawable.img_16)
                    img.add(R.drawable.img_17)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_16)
                    img.add(R.drawable.img_6a)
                    img.add(R.drawable.img_7a)
                    img.add(R.drawable.img_17)
                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)

                    sound.clear()
                    sound.add(R.raw.d1)
                    sound.add(R.raw.d2)
                    sound.add(R.raw.d3)
                    sound.add(R.raw.d4)
                    sound.add(R.raw.d5)
                }
                4->{

                    boolean.clear()
                    boolean.add(1)

                    //Uzun-qisqa
                    datatext.clear()
                    datatext.add("Uzun qalamni belgilang")
                    datatext.add("Qisqa poyezdni belgilang")
                    datatext.add("Qaysi biri uzun qalam?")
                    datatext.add("Qaysi biri qisqa qalam?")
                    datatext.add("Uzunligi teng qalamlarni belgilang")

                    img.clear()
                    //uzun y6l
                    img.add(R.drawable.img_21)
                    img.add(R.drawable.img_22)
                    //qisqa y6l
                    img.add(R.drawable.img_131)
                    img.add(R.drawable.img_132)
                    //qalin daraxt
                    img.add(R.drawable.img_23)
                    img.add(R.drawable.img_25)
                    img.add(R.drawable.img_24)
                    //yupqa daraxt
                    img.add(R.drawable.img_24)
                    img.add(R.drawable.img_23)
                    img.add(R.drawable.img_25)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_23)
                    img.add(R.drawable.img_23)
                    img.add(R.drawable.img_24)
                    img.add(R.drawable.img_25)

                    sound.clear()
                    sound.add(R.raw.e1)
                    sound.add(R.raw.e2)
                    sound.add(R.raw.e3)
                    sound.add(R.raw.e4)
                    sound.add(R.raw.e5)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                5->{

                    boolean.clear()
                    boolean.add(1)

                    //doira
                    datatext.clear()
                    datatext.add("Doira shaklini ko'rsating")
                    datatext.add("Qaysi biri doiraga misol bo'ladi?")
                    datatext.add("Qaysi biri doiraga misol bo'ladi?")
                    datatext.add("Qaysi shakl doira bo'ladi?")
                    datatext.add("Doira shakllarni belgilang")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_103)
                    img.add(R.drawable.img_111)
                    //yupqa kitob
                    img.add(R.drawable.img_110)
                    img.add(R.drawable.img_109)
                    //qalin daraxt
                    img.add(R.drawable.img_105)
                    img.add(R.drawable.img_106)
                    img.add(R.drawable.img_107)
                    //yupqa daraxt
                    img.add(R.drawable.img_102)
                    img.add(R.drawable.img_111)
                    img.add(R.drawable.img_103)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_105)
                    img.add(R.drawable.img_109)
                    img.add(R.drawable.img_106)
                    img.add(R.drawable.img_107)

                    sound.clear()
                    sound.add(R.raw.f1)
                    sound.add(R.raw.f2)
                    sound.add(R.raw.f3)
                    sound.add(R.raw.f4)
                    sound.add(R.raw.f5)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                6->{

                    boolean.clear()
                    boolean.add(1)

                    //Ko'p-kam
                    datatext.clear()
                    datatext.add("Qaysi rasmdagi jo'jalar ko'p?")
                    datatext.add("Qaysi savatdagi olmalar kam?")
                    datatext.add("Ko'p pufaklarni belgilang")
                    datatext.add("Kam pufaklarni belgilang")
                    datatext.add("Ko'p jo'ja va pufakni belgilang")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_18a)
                    img.add(R.drawable.img_19a)
                    //yupqa kitob
                    img.add(R.drawable.img_27a)
                    img.add(R.drawable.img_28a)
                    //qalin daraxt
                    img.add(R.drawable.img_20a)
                    img.add(R.drawable.img_21a)
                    img.add(R.drawable.img_22a)
                    //yupqa daraxt
                    img.add(R.drawable.img_22a)
                    img.add(R.drawable.img_20a)
                    img.add(R.drawable.img_21a)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_18a)
                    img.add(R.drawable.img_20a)
                    img.add(R.drawable.img_22a)
                    img.add(R.drawable.img_19a)

                    sound.clear()
                    sound.add(R.raw.g1)
                    sound.add(R.raw.g2)
                    sound.add(R.raw.g3)
                    sound.add(R.raw.g4)
                    sound.add(R.raw.g5)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                7->{

                    boolean.clear()
                    boolean.add(1)

                    //Barovar-teng
                    datatext.clear()
                    datatext.add("Qaysi biri ko'p?")
                    datatext.add("Qaysi biri kam?")
                    datatext.add("Eng ko'pini belgilang")
                    datatext.add("Eng kamini belgilang")
                    datatext.add("Barovarini belgilang")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_33)
                    img.add(R.drawable.img_34)
                    //yupqa kitob
                    img.add(R.drawable.img_35)
                    img.add(R.drawable.img_33)
                    //qalin daraxt
                    img.add(R.drawable.img_35)
                    img.add(R.drawable.img_34)
                    img.add(R.drawable.img_33)
                    //yupqa daraxt
                    img.add(R.drawable.img_33)
                    img.add(R.drawable.img_35)
                    img.add(R.drawable.img_34)
                    //yupqa dra va kitob6
                    img.add(R.drawable.img_35)
                    img.add(R.drawable.img_36)
                    img.add(R.drawable.img_33)
                    img.add(R.drawable.img_34)

                    sound.clear()
                    sound.add(R.raw.aa1)
                    sound.add(R.raw.aa2)
                    sound.add(R.raw.aa3)
                    sound.add(R.raw.aa4)
                    sound.add(R.raw.aa5)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                8->{

                    boolean.clear()
                    boolean.add(1)

                    //Yaqin-uzoq
                    datatext.clear()
                    datatext.add("Yaqindagi kemani belgilang")
                    datatext.add("Uzoqdagi odamni belgilang")
                    datatext.add("Qaysi biri yaqin?")
                    datatext.add("Qaysi biri uzoq?")
                    datatext.add("Yaqindagi odam va kemani belgilang")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_117)
                    img.add(R.drawable.img_118)
                    //yupqa kitob
                    img.add(R.drawable.img_120)
                    img.add(R.drawable.img_119)
                    //qalin daraxt
                    img.add(R.drawable.img_121)
                    img.add(R.drawable.img_119)
                    img.add(R.drawable.img_122)
                    //yupqa daraxt
                    img.add(R.drawable.img_120)
                    img.add(R.drawable.img_121)
                    img.add(R.drawable.img_119)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_117)
                    img.add(R.drawable.img_120)
                    img.add(R.drawable.img_118)
                    img.add(R.drawable.img_119)

                    sound.clear()
                    sound.add(R.raw.ab1)
                    sound.add(R.raw.ab2)
                    sound.add(R.raw.ab3)
                    sound.add(R.raw.ab4)
                    sound.add(R.raw.ab5)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                9->{

                    boolean.clear()
                    boolean.add(1)

                    //yuqori-past
                    datatext.clear()
                    datatext.add("Qaysi biri olmalarni tepadan teryapti?")
                    datatext.add("Pastdagi qushni belgilang")
                    datatext.add("Qaysi biri yuqorida?")
                    datatext.add("Qaysi biri pastda?")
                    datatext.add("Tepadagi odam va qushni belgilang")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_115)
                    img.add(R.drawable.img_116)
                    //yupqa kitob
                    img.add(R.drawable.img_133)
                    img.add(R.drawable.img_134)
                    //qalin daraxt
                    img.add(R.drawable.img_85)
                    img.add(R.drawable.img_84)
                    img.add(R.drawable.img_81)
                    //yupqa daraxt
                    img.add(R.drawable.img_82)
                    img.add(R.drawable.img_83)
                    img.add(R.drawable.img_86)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_115)
                    img.add(R.drawable.img_133)
                    img.add(R.drawable.img_116)
                    img.add(R.drawable.img_134)

                    sound.clear()
                    sound.add(R.raw.ac1)
                    sound.add(R.raw.ac2)
                    sound.add(R.raw.ac3)
                    sound.add(R.raw.ac4)
                    sound.add(R.raw.ac5)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                10->{

                    boolean.clear()
                    boolean.add(1)

                    //O'ngda-chapda
                    datatext.clear()
                    datatext.add("O'ng tomonni ko'rsating")
                    datatext.add("Chap tomonni ko'rsating")
                    datatext.add("Tepa tomonni ko'rsating")
                    datatext.add("Past tomonni ko'rsating")
                    datatext.add("Chap va tepa tomonlarini ko'rsating")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_24a)
                    img.add(R.drawable.img_23a)
                    //yupqa kitob
                    img.add(R.drawable.img_24a)
                    img.add(R.drawable.img_23a)
                    //qalin daraxt
                    img.add(R.drawable.img_25a)
                    img.add(R.drawable.img_24a)
                    img.add(R.drawable.img_23a)
                    //yupqa daraxt
                    img.add(R.drawable.img_24a)
                    img.add(R.drawable.img_25a)
                    img.add(R.drawable.img_26a)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_23a)
                    img.add(R.drawable.img_25a)
                    img.add(R.drawable.img_24a)
                    img.add(R.drawable.img_26a)

                    sound.clear()
                    sound.add(R.raw.ad1)
                    sound.add(R.raw.ad2)
                    sound.add(R.raw.ad3)
                    sound.add(R.raw.ad4)
                    sound.add(R.raw.ad5)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                11->{

                    boolean.clear()
                    boolean.add(1)

                    //uchburchak
                    datatext.clear()
                    datatext.add("Uchburchak shaklini ko'rsating")
                    datatext.add("Qaysi biri uchburchakka misol?")
                    datatext.add("Qaysi biri uchburchakka misol?")
                    datatext.add("Qaysi shakl uchburchak?")
                    datatext.add("Uchburchak shakllarni belgilang")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_111)
                    img.add(R.drawable.img_103)
                    //yupqa kitob
                    img.add(R.drawable.img_108)
                    img.add(R.drawable.img_107)
                    //qalin daraxt
                    img.add(R.drawable.img_110)
                    img.add(R.drawable.img_113)
                    img.add(R.drawable.img_106)
                    //yupqa daraxt
                    img.add(R.drawable.img_102)
                    img.add(R.drawable.img_103)
                    img.add(R.drawable.img_111)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_110)
                    img.add(R.drawable.img_107)
                    img.add(R.drawable.img_109)
                    img.add(R.drawable.img_113)

                    sound.clear()
                    sound.add(R.raw.ae1)
                    sound.add(R.raw.ae2)
                    sound.add(R.raw.ae3)
                    sound.add(R.raw.ae4)
                    sound.add(R.raw.ae5)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                12->{

                    boolean.clear()
                    boolean.add(1)

                    //yonida
                    datatext.clear()
                    datatext.add("Atrofidagi sharni belgilang")
                    datatext.add("Oldidagi sharni belgilang")
                    datatext.add("O'rtadagi sharni belgilang")
                    datatext.add("Orqasidagi sharni belgilang")
                    datatext.add("Tepa va pastdagi sharni belgilang")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_81)
                    img.add(R.drawable.img_85)
                    //yupqa kitob
                    img.add(R.drawable.img_83)
                    img.add(R.drawable.img_82)
                    //qalin daraxt
                    img.add(R.drawable.img_83)
                    img.add(R.drawable.img_84)
                    img.add(R.drawable.img_81)
                    //yupqa daraxt
                    img.add(R.drawable.img_83)
                    img.add(R.drawable.img_86)
                    img.add(R.drawable.img_84)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_85)
                    img.add(R.drawable.img_86)
                    img.add(R.drawable.img_82)
                    img.add(R.drawable.img_84)

                    sound.clear()
                    sound.add(R.raw.af1)
                    sound.add(R.raw.af2)
                    sound.add(R.raw.af3)
                    sound.add(R.raw.af4)
                    sound.add(R.raw.af5)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                13->{

                    boolean.clear()
                    boolean.add(1)

                    //togri tortburchak
                    datatext.clear()
                    datatext.add("To'rtburchak shaklini ko'rsating")
                    datatext.add("Qaysi biri to'rtburchakka misol?")
                    datatext.add("Qaysi biri to'rtburchakka misol?")
                    datatext.add("Qaysi shakl to'rtburchak?")
                    datatext.add("To'rtburchak shakllarni belgilang")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_112)
                    img.add(R.drawable.img_103)
                    //yupqa kitob
                    img.add(R.drawable.img_110)
                    img.add(R.drawable.img_113)
                    //qalin daraxt
                    img.add(R.drawable.img_114)
                    img.add(R.drawable.img_108)
                    img.add(R.drawable.img_107)
                    //yupqa daraxt
                    img.add(R.drawable.img_111)
                    img.add(R.drawable.img_103)
                    img.add(R.drawable.img_112)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_112)
                    img.add(R.drawable.img_114)
                    img.add(R.drawable.img_105)
                    img.add(R.drawable.img_111)

                    sound.clear()
                    sound.add(R.raw.ag1)
                    sound.add(R.raw.ag2)
                    sound.add(R.raw.ag3)
                    sound.add(R.raw.ag4)
                    sound.add(R.raw.ag5)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                14->{

                    boolean.clear()
                    boolean.add(0)

                    //birinchi va oxirgi
                    datatext.clear()
                    datatext.add("Tepadagi rasmdan qaysi biri birinchi?")
                    datatext.add("Tepadagi rasmdan qaysi biri ikkinchi?")
                    datatext.add("Tepadagi rasmdan qaysi biri uchinchi?")
                    datatext.add("Tepadagi rasmdan qaysi biri oxirgi?")

                    img.clear()
                    //qalin kitob

                    img.add(R.drawable.birrrr)

                    img.add(R.drawable.birrrr1)
                    img.add(R.drawable.birrrr3)
                    //yupqa kitob
                    img.add(R.drawable.birrrr4)
                    img.add(R.drawable.birrrr2)
                    //qalin daraxt
                    img.add(R.drawable.birrrr3)
                    img.add(R.drawable.birrrr1)
                    //yupqa daraxt
                    img.add(R.drawable.birrrr2)
                    img.add(R.drawable.birrrr4)

                    sound.clear()
                    sound.add(R.raw.ba1)
                    sound.add(R.raw.ba2)
                    sound.add(R.raw.ba3)
                    sound.add(R.raw.ba4)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                15->{

                    boolean.clear()
                    boolean.add(1)

                    //ogir yengil
                    datatext.clear()
                    datatext.add("Qaysi biri og'ir?")
                    datatext.add("Qaysi yuk yengil?")
                    datatext.add("Eng og'irini ko'rsating")
                    datatext.add("Eng yengilini ko'rsating")
                    datatext.add("Og'ir yuk bilan koptokni ko'rsating")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_26)
                    img.add(R.drawable.img_27)
                    //yupqa kitob
                    img.add(R.drawable.img_28)
                    img.add(R.drawable.img_29)
                    //qalin daraxt
                    img.add(R.drawable.img_32)
                    img.add(R.drawable.img_30)
                    img.add(R.drawable.img_31)
                    //yupqa daraxt
                    img.add(R.drawable.img_31)
                    img.add(R.drawable.img_32)
                    img.add(R.drawable.img_30)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_28)
                    img.add(R.drawable.img_26)
                    img.add(R.drawable.img_27)
                    img.add(R.drawable.img_29)

                    sound.clear()
                    sound.add(R.raw.bb1)
                    sound.add(R.raw.bb2)
                    sound.add(R.raw.bb3)
                    sound.add(R.raw.bb4)
                    sound.add(R.raw.bb5)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                16->{

                    boolean.clear()
                    boolean.add(1)

                    //ertalab kunduzi
                    datatext.clear()
                    datatext.add("Badan tarbiyani vaqtini ko'rsating")
                    datatext.add("Uxlash vaqtini ko'rsating")
                    datatext.add("Maktabga borish vaqtini ko'rsating")
                    datatext.add("Dars qilish vaqtini ko'rsating")
                    datatext.add("Yuvinish va nonushta vaqtini ko'rsating")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_33a)
                    img.add(R.drawable.img_34a)
                    //yupqa kitob
                    img.add(R.drawable.img_34a)
                    img.add(R.drawable.img_35a)
                    //qalin daraxt
                    img.add(R.drawable.img_36a)
                    img.add(R.drawable.img_34a)
                    img.add(R.drawable.img_33a)
                    //yupqa daraxt
                    img.add(R.drawable.img_38a)
                    img.add(R.drawable.img_34a)
                    img.add(R.drawable.img_37a)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_38a)
                    img.add(R.drawable.img_34a)
                    img.add(R.drawable.img_33a)
                    img.add(R.drawable.img_36a)

                    sound.clear()
                    sound.add(R.raw.bc1)
                    sound.add(R.raw.bc2)
                    sound.add(R.raw.bc3)
                    sound.add(R.raw.bc4)
                    sound.add(R.raw.bc5)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                17->{

                    boolean.clear()
                    boolean.add(1)

                    //qo'shish - ayirish
                    datatext.clear()
                    datatext.add("2 ta mushukka 1 ta mushukni qo'shsak qancha bo'ladi?")
                    datatext.add("3 ta guldan 1 ta gulni olsak qancha qoladi?")
                    datatext.add("3 ta mushukka 1 ta mushukni qo'shsak qancha bo'ladi?")
                    datatext.add("4 ta mushukdan 1 ta mushukni olsak qancha qoladi?")
                    datatext.add("Qaysi rasmda jami 4 dona?")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_135)
                    img.add(R.drawable.img_136)
                    //yupqa kitob
                    img.add(R.drawable.img_138)
                    img.add(R.drawable.img_137)
                    //qalin daraxt
                    img.add(R.drawable.img_139)
                    img.add(R.drawable.img_141)
                    img.add(R.drawable.img_140)
                    //yupqa daraxt
                    img.add(R.drawable.img_140)
                    img.add(R.drawable.img_139)
                    img.add(R.drawable.img_141)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_143)
                    img.add(R.drawable.img_144)
                    img.add(R.drawable.img_142)
                    img.add(R.drawable.img_145)

                    sound.clear()
                    sound.add(R.raw.bd1)
                    sound.add(R.raw.bd2)
                    sound.add(R.raw.bd3)
                    sound.add(R.raw.bd4)
                    sound.add(R.raw.bd5)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                18->{

                    boolean.clear()
                    boolean.add(1)

                    //Kvadrat
                    datatext.clear()
                    datatext.add("Kvadrat shaklini ko'rsating")
                    datatext.add("Qaysi biri kvadratga misol?")
                    datatext.add("Qaysi biri kvadratga misol?")
                    datatext.add("Qaysi shakl kvadrat?")
                    datatext.add("Kvadrat shakllarini belgilang")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_102)
                    img.add(R.drawable.img_103)
                    //yupqa kitob
                    img.add(R.drawable.img_105)
                    img.add(R.drawable.img_104)
                    //qalin daraxt
                    img.add(R.drawable.img_106)
                    img.add(R.drawable.img_107)
                    img.add(R.drawable.img_108)
                    //yupqa daraxt
                    img.add(R.drawable.img_111)
                    img.add(R.drawable.img_103)
                    img.add(R.drawable.img_102)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_106)
                    img.add(R.drawable.img_104)
                    img.add(R.drawable.img_109)
                    img.add(R.drawable.img_110)

                    sound.clear()
                    sound.add(R.raw.be1)
                    sound.add(R.raw.be2)
                    sound.add(R.raw.be3)
                    sound.add(R.raw.be4)
                    sound.add(R.raw.be5)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                19->{

                    boolean.clear()
                    boolean.add(1)

                    //1 soni va raqami
                    datatext.clear()
                    datatext.add("Bir sonini belgilang")
                    datatext.add("Qaysi birida 1 ta katak bo'yalgan?")
                    datatext.add("1 barmoqni belgilang")
                    datatext.add("1 ni ko'rsating")
                    datatext.add("1 soni va barmoqni belgilang")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_37)
                    img.add(R.drawable.img_39)
                    //yupqa kitob
                    img.add(R.drawable.img_49)
                    img.add(R.drawable.img_48)
                    //qalin daraxt
                    img.add(R.drawable.img_59)
                    img.add(R.drawable.img_60)
                    img.add(R.drawable.img_65)
                    //yupqa daraxt
                    img.add(R.drawable.img_75)
                    img.add(R.drawable.img_72)
                    img.add(R.drawable.img_70)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_37)
                    img.add(R.drawable.img_59)
                    img.add(R.drawable.img_39)
                    img.add(R.drawable.img_60)

                    sound.clear()
                    sound.add(R.raw.bf1)
                    sound.add(R.raw.bf2)
                    sound.add(R.raw.bf3)
                    sound.add(R.raw.bf4)
                    sound.add(R.raw.bf5)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                20->{

                    boolean.clear()
                    boolean.add(1)

                    //Nuqta va chiziq
                    datatext.clear()
                    datatext.add("Nuqtani belgilang")
                    datatext.add("Egri chiziqni ko'rsating")
                    datatext.add("To'g'ri chiziqni ko'rsating")
                    datatext.add("Egri chiziqni ko'rsating")
                    datatext.add("Nuqta va to'g'ri chiziqni ko'rsating")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_96)
                    img.add(R.drawable.img_98)
                    //yupqa kitob
                    img.add(R.drawable.img_99)
                    img.add(R.drawable.img_97)
                    //qalin daraxt
                    img.add(R.drawable.img_100)
                    img.add(R.drawable.img_101)
                    img.add(R.drawable.img_96)
                    //yupqa daraxt
                    img.add(R.drawable.img_99)
                    img.add(R.drawable.img_96)
                    img.add(R.drawable.img_101)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_96)
                    img.add(R.drawable.img_100)
                    img.add(R.drawable.img_97)
                    img.add(R.drawable.img_101)

                    sound.clear()
                    sound.add(R.raw.bg1)
                    sound.add(R.raw.bg2)
                    sound.add(R.raw.bg3)
                    sound.add(R.raw.bg4)
                    sound.add(R.raw.bg5)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                21->{

                    boolean.clear()
                    boolean.add(1)

                    //2 soni va raqami
                    datatext.clear()
                    datatext.add("Ikki sonini belgilang")
                    datatext.add("Qaysi birida 2 ta katak bo'yalgan?")
                    datatext.add("2 barmoqni belgilang")
                    datatext.add("2 ni ko'rsating")
                    datatext.add("2 soni va barmoqni belgilang")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_38)
                    img.add(R.drawable.img_42)
                    //yupqa kitob
                    img.add(R.drawable.img_52)
                    img.add(R.drawable.img_49)
                    //qalin daraxt
                    img.add(R.drawable.img_60)
                    img.add(R.drawable.img_65)
                    img.add(R.drawable.img_64)
                    //yupqa daraxt
                    img.add(R.drawable.img_74)
                    img.add(R.drawable.img_76)
                    img.add(R.drawable.img_71)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_38)
                    img.add(R.drawable.img_60)
                    img.add(R.drawable.img_42)
                    img.add(R.drawable.img_65)

                    sound.clear()
                    sound.add(R.raw.ca1)
                    sound.add(R.raw.ca2)
                    sound.add(R.raw.ca3)
                    sound.add(R.raw.ca4)
                    sound.add(R.raw.ca5)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                22->{

                    boolean.clear()
                    boolean.add(1)

                    //3 soni va raqami
                    datatext.clear()
                    datatext.add("Uch sonini belgilang")
                    datatext.add("Qaysi birida 3 ta katak bo'yalgan?")
                    datatext.add("3 barmoqni belgilang")
                    datatext.add("3 ni ko'rsating")
                    datatext.add("3 soni va barmoqni belgilang")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_39)
                    img.add(R.drawable.img_41)
                    //yupqa kitob
                    img.add(R.drawable.img_52)
                    img.add(R.drawable.img_50)
                    //qalin daraxt
                    img.add(R.drawable.img_61)
                    img.add(R.drawable.img_67)
                    img.add(R.drawable.img_62)
                    //yupqa daraxt
                    img.add(R.drawable.img_70)
                    img.add(R.drawable.img_74)
                    img.add(R.drawable.img_72)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_39)
                    img.add(R.drawable.img_61)
                    img.add(R.drawable.img_41)
                    img.add(R.drawable.img_67)

                    sound.clear()
                    sound.add(R.raw.cb1)
                    sound.add(R.raw.cb2)
                    sound.add(R.raw.cb3)
                    sound.add(R.raw.cb4)
                    sound.add(R.raw.cb5)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                23->{

                    boolean.clear()
                    boolean.add(1)

                    //4 soni va raqami
                    datatext.clear()
                    datatext.add("To'rt sonini belgilang")
                    datatext.add("Qaysi birida 4 ta katak bo'yalgan?")
                    datatext.add("4 barmoqni belgilang")
                    datatext.add("4 ni ko'rsating")
                    datatext.add("4 soni va barmoqni belgilang")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_40)
                    img.add(R.drawable.img_47)
                    //yupqa kitob
                    img.add(R.drawable.img_48)
                    img.add(R.drawable.img_51)
                    //qalin daraxt
                    img.add(R.drawable.img_62)
                    img.add(R.drawable.img_60)
                    img.add(R.drawable.img_68)
                    //yupqa daraxt
                    img.add(R.drawable.img_78)
                    img.add(R.drawable.img_71)
                    img.add(R.drawable.img_73)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_40)
                    img.add(R.drawable.img_62)
                    img.add(R.drawable.img_47)
                    img.add(R.drawable.img_60)

                    sound.clear()
                    sound.add(R.raw.cc1)
                    sound.add(R.raw.cc2)
                    sound.add(R.raw.cc3)
                    sound.add(R.raw.cc4)
                    sound.add(R.raw.cc5)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                24->{

                    boolean.clear()
                    boolean.add(1)

                    //5 soni va raqami
                    datatext.clear()
                    datatext.add("Besh sonini belgilang")
                    datatext.add("Qaysi birida 5 ta katak bo'yalgan?")
                    datatext.add("5 barmoqni belgilang")
                    datatext.add("5 ni ko'rsating")
                    datatext.add("5 soni va barmoqni belgilang")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_41)
                    img.add(R.drawable.img_40)
                    //yupqa kitob
                    img.add(R.drawable.img_53)
                    img.add(R.drawable.img_52)
                    //qalin daraxt
                    img.add(R.drawable.img_63)
                    img.add(R.drawable.img_61)
                    img.add(R.drawable.img_69)
                    //yupqa daraxt
                    img.add(R.drawable.img_78)
                    img.add(R.drawable.img_79)
                    img.add(R.drawable.img_74)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_41)
                    img.add(R.drawable.img_63)
                    img.add(R.drawable.img_40)
                    img.add(R.drawable.img_61)

                    sound.clear()
                    sound.add(R.raw.cd1)
                    sound.add(R.raw.cd2)
                    sound.add(R.raw.cd3)
                    sound.add(R.raw.cd4)
                    sound.add(R.raw.cd5)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                25->{

                    boolean.clear()
                    boolean.add(1)

                    //0 soni va raqami
                    datatext.clear()
                    datatext.add("Nol sonini belgilang")
                    datatext.add("Qaysi birida 0 ta katak bo'yalgan?")
                    datatext.add("0 barmoqni belgilang")
                    datatext.add("0 ni ko'rsating")
                    datatext.add("0 soni va barmoqni belgilang")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_47)
                    img.add(R.drawable.img_39)
                    //yupqa kitob
                    img.add(R.drawable.img_57)
                    img.add(R.drawable.img_58)
                    //qalin daraxt
                    img.add(R.drawable.img_69)
                    img.add(R.drawable.img_67)
                    img.add(R.drawable.img_59)
                    //yupqa daraxt
                    img.add(R.drawable.img_75)
                    img.add(R.drawable.img_79)
                    img.add(R.drawable.img_80)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_47)
                    img.add(R.drawable.img_69)
                    img.add(R.drawable.img_39)
                    img.add(R.drawable.img_67)

                    sound.clear()
                    sound.add(R.raw.ce1)
                    sound.add(R.raw.ce2)
                    sound.add(R.raw.ce3)
                    sound.add(R.raw.ce4)
                    sound.add(R.raw.ce5)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                26->{

                    boolean.clear()
                    boolean.add(1)

                    //6 soni va raqami
                    datatext.clear()
                    datatext.add("Olti sonini belgilang")
                    datatext.add("Qaysi birida 6 ta katak bo'yalgan?")
                    datatext.add("6 barmoqni belgilang")
                    datatext.add("6 ni ko'rsating")
                    datatext.add("6 soni va barmoqni belgilang")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_42)
                    img.add(R.drawable.img_37)
                    //yupqa kitob
                    img.add(R.drawable.img_56)
                    img.add(R.drawable.img_53)
                    //qalin daraxt
                    img.add(R.drawable.img_64)
                    img.add(R.drawable.img_62)
                    img.add(R.drawable.img_68)
                    //yupqa daraxt
                    img.add(R.drawable.img_78)
                    img.add(R.drawable.img_70)
                    img.add(R.drawable.img_75)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_42)
                    img.add(R.drawable.img_64)
                    img.add(R.drawable.img_37)
                    img.add(R.drawable.img_62)

                    sound.clear()
                    sound.add(R.raw.cf1)
                    sound.add(R.raw.cf2)
                    sound.add(R.raw.cf3)
                    sound.add(R.raw.cf4)
                    sound.add(R.raw.cf5)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                27->{

                    boolean.clear()
                    boolean.add(1)

                    //7 soni va raqami
                    datatext.clear()
                    datatext.add("Yetti sonini belgilang")
                    datatext.add("Qaysi birida 7 ta katak bo'yalgan?")
                    datatext.add("7 barmoqni belgilang")
                    datatext.add("7 ni ko'rsating")
                    datatext.add("7 soni va barmoqni belgilang")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_43)
                    img.add(R.drawable.img_41)
                    //yupqa kitob
                    img.add(R.drawable.img_50)
                    img.add(R.drawable.img_54)
                    //qalin daraxt
                    img.add(R.drawable.img_65)
                    img.add(R.drawable.img_67)
                    img.add(R.drawable.img_60)
                    //yupqa daraxt
                    img.add(R.drawable.img_71)
                    img.add(R.drawable.img_73)
                    img.add(R.drawable.img_76)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_43)
                    img.add(R.drawable.img_65)
                    img.add(R.drawable.img_41)
                    img.add(R.drawable.img_67)

                    sound.clear()
                    sound.add(R.raw.cg1)
                    sound.add(R.raw.cg2)
                    sound.add(R.raw.cg3)
                    sound.add(R.raw.cg4)
                    sound.add(R.raw.cg5)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                28->{

                    boolean.clear()
                    boolean.add(1)

                    //8 soni va raqami
                    datatext.clear()
                    datatext.add("Sakkiz sonini belgilang")
                    datatext.add("Qaysi birida 8 ta katak bo'yalgan?")
                    datatext.add("8 barmoqni belgilang")
                    datatext.add("8 ni ko'rsating")
                    datatext.add("8 soni va barmoqni belgilang")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_44)
                    img.add(R.drawable.img_39)
                    //yupqa kitob
                    img.add(R.drawable.img_51)
                    img.add(R.drawable.img_55)
                    //qalin daraxt
                    img.add(R.drawable.img_66)
                    img.add(R.drawable.img_64)
                    img.add(R.drawable.img_63)
                    //yupqa daraxt
                    img.add(R.drawable.img_80)
                    img.add(R.drawable.img_72)
                    img.add(R.drawable.img_77)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_44)
                    img.add(R.drawable.img_66)
                    img.add(R.drawable.img_39)
                    img.add(R.drawable.img_64)

                    sound.clear()
                    sound.add(R.raw.da1)
                    sound.add(R.raw.da2)
                    sound.add(R.raw.da3)
                    sound.add(R.raw.da4)
                    sound.add(R.raw.da5)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                29->{

                    boolean.clear()
                    boolean.add(1)

                    //To'g'ri chiziq yasash
                    datatext.clear()
                    datatext.add("Qaysi biri to'g'ri chiziq?")
                    datatext.add("Qaysi biri to'g'ri chiziq?")
                    datatext.add("To'g'ri chiziqni ko'rsating")
                    datatext.add("To'g'ri chiziqni ko'rsating")
                    datatext.add("To'g'ri chiziqlarni ko'rsating")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_100)
                    img.add(R.drawable.img_96)
                    //yupqa kitob
                    img.add(R.drawable.img_97)
                    img.add(R.drawable.img_99)
                    //qalin daraxt
                    img.add(R.drawable.img_100)
                    img.add(R.drawable.img_101)
                    img.add(R.drawable.img_96)
                    //yupqa daraxt
                    img.add(R.drawable.img_97)
                    img.add(R.drawable.img_96)
                    img.add(R.drawable.img_99)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_99)
                    img.add(R.drawable.img_100)
                    img.add(R.drawable.img_97)
                    img.add(R.drawable.img_101)

                    sound.clear()
                    sound.add(R.raw.db1)
                    sound.add(R.raw.db2)
                    sound.add(R.raw.db3)
                    sound.add(R.raw.db4)
                    sound.add(R.raw.db5)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                30->{

                    boolean.clear()
                    boolean.add(1)

                    //Shar va kub
                    datatext.clear()
                    datatext.add("Qaysi biri kubga misol?")
                    datatext.add("Qaysi biri sharga misol?")
                    datatext.add("Kub shaklini belgilang")
                    datatext.add("Shar shaklini belgilang")
                    datatext.add("Shar va kubga misollarni belgilang")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_87)
                    img.add(R.drawable.img_88)
                    //yupqa kitob
                    img.add(R.drawable.img_90)
                    img.add(R.drawable.img_89)
                    //qalin daraxt
                    img.add(R.drawable.img_91)
                    img.add(R.drawable.img_95)
                    img.add(R.drawable.img_94)
                    //yupqa daraxt
                    img.add(R.drawable.img_94)
                    img.add(R.drawable.img_93)
                    img.add(R.drawable.img_92)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_91)
                    img.add(R.drawable.img_92)
                    img.add(R.drawable.img_94)
                    img.add(R.drawable.img_95)

                    sound.clear()
                    sound.add(R.raw.dc1)
                    sound.add(R.raw.dc2)
                    sound.add(R.raw.dc3)
                    sound.add(R.raw.dc4)
                    sound.add(R.raw.dc5)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                31->{

                    boolean.clear()
                    boolean.add(1)

                    //9 soni va raqami
                    datatext.clear()
                    datatext.add("To'qqiz sonini belgilang")
                    datatext.add("Qaysi birida 9 ta katak bo'yalgan?")
                    datatext.add("9 barmoqni belgilang")
                    datatext.add("9 ni ko'rsating")
                    datatext.add("9 soni va barmoqni belgilang")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_45)
                    img.add(R.drawable.img_38)
                    //yupqa kitob
                    img.add(R.drawable.img_52)
                    img.add(R.drawable.img_56)
                    //qalin daraxt
                    img.add(R.drawable.img_67)
                    img.add(R.drawable.img_65)
                    img.add(R.drawable.img_59)
                    //yupqa daraxt
                    img.add(R.drawable.img_74)
                    img.add(R.drawable.img_80)
                    img.add(R.drawable.img_78)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_45)
                    img.add(R.drawable.img_67)
                    img.add(R.drawable.img_38)
                    img.add(R.drawable.img_65)

                    sound.clear()
                    sound.add(R.raw.dd1)
                    sound.add(R.raw.dd2)
                    sound.add(R.raw.dd3)
                    sound.add(R.raw.dd4)
                    sound.add(R.raw.dd5)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
                32->{

                    boolean.clear()
                    boolean.add(1)

                    //10 soni va raqami
                    datatext.clear()
                    datatext.add("O'n sonini belgilang")
                    datatext.add("Qaysi birida 10 ta katak bo'yalgan?")
                    datatext.add("10 barmoqni belgilang")
                    datatext.add("10 ni ko'rsating")
                    datatext.add("10 soni va barmoqni belgilang")

                    img.clear()
                    //qalin kitob
                    img.add(R.drawable.img_46)
                    img.add(R.drawable.img_47)
                    //yupqa kitob
                    img.add(R.drawable.img_55)
                    img.add(R.drawable.img_57)
                    //qalin daraxt
                    img.add(R.drawable.img_68)
                    img.add(R.drawable.img_64)
                    img.add(R.drawable.img_62)
                    //yupqa daraxt
                    img.add(R.drawable.img_71)
                    img.add(R.drawable.img_74)
                    img.add(R.drawable.img_79)
                    //yupqa dra va kitob
                    img.add(R.drawable.img_46)
                    img.add(R.drawable.img_68)
                    img.add(R.drawable.img_47)
                    img.add(R.drawable.img_64)

                    sound.clear()
                    sound.add(R.raw.de1)
                    sound.add(R.raw.de2)
                    sound.add(R.raw.de3)
                    sound.add(R.raw.de4)
                    sound.add(R.raw.de5)

                    val intent=Intent(this, TestActivity::class.java)
                    startActivity(intent)
                }
            }
        }

    }
}