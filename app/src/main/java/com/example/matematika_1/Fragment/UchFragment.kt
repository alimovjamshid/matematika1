package com.example.matematika_1.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.matematika_1.R

class UchFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_uch, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() = UchFragment
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val image1: ImageView =view.findViewById(R.id.uch1)
        val image2: ImageView =view.findViewById(R.id.uch2)
        val image3:ImageView=view.findViewById(R.id.uch3)

        image1.setImageResource(R.drawable.on)
    }
}