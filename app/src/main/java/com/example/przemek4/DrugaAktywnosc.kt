package com.example.przemek4

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.blue
import androidx.core.graphics.green
import androidx.core.graphics.red
import kotlinx.android.synthetic.main.activity_druga_aktywnosc.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlin.text.Charsets.US_ASCII

class DrugaAktywnosc : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_druga_aktywnosc)
        setTitle("Dla Ciebie mój Skarbie")

        val tekst = packageName
        val dlugoscTekstu = tekst.length
        val tekst2 = tekst + " " + dlugoscTekstu.toString()

        with(textView2) {
            //setText(tekst[0].toString() + tekst[1].toString() + tekst[2].toString())
            setText(tekst2)
            setTextSize(30F)
            setTextColor(Color.parseColor("red"))
        }

        textView2.setOnClickListener { startActivity(Intent(this, TrzeciaAktywnosc::class.java)) }
    }
}
