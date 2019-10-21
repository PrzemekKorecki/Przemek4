package com.example.przemek4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_piata_aktywnosc.*

class PiataAktywnosc : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_piata_aktywnosc)

        var tablica = "to jest nowy string"

        var tablica2 = {for (x in tablica){
            print(x)} }

        textView3.setText(tablica2.toString())

        fun zamianaString(array1: CharArray, array2: CharArray){
            array2[0] = array1[array1.length - 1]
            return array2
        }
    }
}
