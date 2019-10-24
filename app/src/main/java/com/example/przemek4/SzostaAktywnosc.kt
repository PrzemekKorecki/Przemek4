package com.example.przemek4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_szosta_aktywnosc.*

class SzostaAktywnosc : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_szosta_aktywnosc)

        button5.setOnClickListener(){
            var z = ""
                for (x in 0..10){
                z += x.toString()
                }
            textView5.text = z
        }
    }
}
