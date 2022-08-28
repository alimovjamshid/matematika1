package com.example.matematika_1.dialog

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
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

        btn1.setOnClickListener{
            Toast.makeText(context, "salom", Toast.LENGTH_SHORT).show()
        }
        btn2.setOnClickListener{

        }

        return view
    }
}