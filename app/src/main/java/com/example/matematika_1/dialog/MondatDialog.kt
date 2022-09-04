package com.example.matematika_1.dialog

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.matematika_1.Activity.PlayActivity
import com.example.matematika_1.Activity.TestActivity
import com.example.matematika_1.R

class MondatDialog : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.mondat, container, false)
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

        val btn1:Button=view.findViewById(R.id.button)
        val btn2:Button=view.findViewById(R.id.button2)
        val txt1:TextView=view.findViewById(R.id.textView3)
        val txt2:TextView=view.findViewById(R.id.textView4)

        /*val bundle = this.arguments
        val t:Int=bundle?.getInt("t") as Int
        val f:Int=bundle?.getInt("f") as Int

        txt1.setText(txt1.text.toString()+t.toString())
        txt2.setText(txt2.text.toString()+f.toString())*/

        btn1.setOnClickListener{
            val intent= Intent(context, PlayActivity::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener{
            val intent= Intent(context, TestActivity::class.java)
            startActivity(intent)
        }

        return view
    }
}