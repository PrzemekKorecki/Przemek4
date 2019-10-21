package com.example.przemek4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_piata_aktywnosc.*

class PiataAktywnosc : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_piata_aktywnosc)

        setTitle("piata aktywnosc")

        var tablica = "to jest nowy string"

        var tablica2: String = ""

        for (x in tablica.length-1 downTo 0) {
            tablica2 += tablica[x]
        }
        textView3.setText(tablica)
        textView4.setText(tablica2)
    }
}
