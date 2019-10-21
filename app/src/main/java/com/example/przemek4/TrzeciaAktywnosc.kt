package com.example.przemek4

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.ScaleGestureDetector
import android.view.View
import androidx.core.graphics.red
import androidx.core.graphics.toColor
import kotlinx.android.synthetic.main.activity_trzecia_aktywnosc.*
import kotlin.system.exitProcess

class TrzeciaAktywnosc : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trzecia_aktywnosc)

        setTitle("Mój Nunuś")

       zdjecie.setOnClickListener { startActivity(Intent(this, CzwartaAktywosc::class.java))
       }

        zdjecie.setOnLongClickListener(){
            finishAffinity()
            //exitProcess(-1)
            true
        }
    }
}
