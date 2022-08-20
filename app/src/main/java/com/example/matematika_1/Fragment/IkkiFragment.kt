package com.example.matematika_1.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.matematika_1.R

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
        fun newInstance()= IkkiFragment
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var i=0

        val image1:ImageView=view.findViewById(R.id.ikki1)
        val image2:ImageView=view.findViewById(R.id.ikki2)
        val textView:TextView=view.findViewById(R.id.answer)

        val bundle = this.arguments
        val message:ArrayList<String> = bundle?.getStringArrayList("mText") as ArrayList<String>
        textView.text=message[0]

        val img:ArrayList<Int> = bundle?.getIntegerArrayList("image") as ArrayList<Int> /* = java.util.ArrayList<kotlin.Int> */
        image1.setImageResource(img[0])
        image2.setImageResource(img[1])

        image1.setOnClickListener(View.OnClickListener {
            i++
            if(i<=1) {
                textView.setText(message[1])
                image1.setImageResource(img[3])
                image2.setImageResource(img[2])
                Toast.makeText(context,"True",Toast.LENGTH_SHORT).show()
            }
            else{

            }
        })
        image2.setOnClickListener(View.OnClickListener {
            Toast.makeText(context,"False",Toast.LENGTH_SHORT).show()
        })

    }
}