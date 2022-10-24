package com.math.matematika_1.dialog

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.matematika_1.R


class RightDialog : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.right, container, false)
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

        Handler(Looper.getMainLooper())
            .postDelayed({
                dismiss()
            },300)

        return view
    }
}