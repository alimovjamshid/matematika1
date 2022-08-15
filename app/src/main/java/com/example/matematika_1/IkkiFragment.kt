package com.example.matematika_1

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_ikki.*
import kotlinx.android.synthetic.main.grid_item.*
import kotlinx.android.synthetic.main.grid_item.view.*

class IkkiFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ikki, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance()=IkkiFragment
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val image1:ImageView=view.findViewById(R.id.ikki1)
        val image2:ImageView=view.findViewById(R.id.ikki2)
        val textView:TextView=view.findViewById(R.id.answer)

      /*  val data=arguments
        textView.text=data!!.get("string").toString()*/

        image1.setImageResource(R.drawable.uch)

        image1.setOnClickListener(View.OnClickListener {
            image1.setImageResource(R.drawable.uch)
        })
        image2.setOnClickListener(View.OnClickListener {

        })
    }
}