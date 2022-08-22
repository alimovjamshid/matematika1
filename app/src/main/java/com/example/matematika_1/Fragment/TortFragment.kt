package com.example.matematika_1.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.matematika_1.R

class tortFragment : Fragment() {

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

        var i=0;
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
    }
}