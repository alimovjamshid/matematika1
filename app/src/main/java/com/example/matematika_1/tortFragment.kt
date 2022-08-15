package com.example.matematika_1

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

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
        fun newInstance()=tortFragment
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val image1: ImageView =view.findViewById(R.id.tort1)
        val image2: ImageView =view.findViewById(R.id.tort2)
        val image3:ImageView=view.findViewById(R.id.tort3)
        val image4:ImageView=view.findViewById(R.id.tort4)
    }
}