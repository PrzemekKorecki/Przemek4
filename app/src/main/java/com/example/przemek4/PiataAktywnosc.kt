package com.example.przemek4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_piata_aktywnosc.*

class PiataAktywnosc : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_piata_aktywnosc)

        setTitle("Piąta Aktywność")

        button3.setOnClickListener(){
            var napis = editText.text.toString()
            var sr = StringReverser()
            textView4.setText(sr.stringReverser(napis))
        }
    }
}
