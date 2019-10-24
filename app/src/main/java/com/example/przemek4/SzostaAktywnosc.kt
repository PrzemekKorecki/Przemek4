package com.example.przemek4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_szosta_aktywnosc.*

class SzostaAktywnosc : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_szosta_aktywnosc)

        button5.setOnClickListener(){
            var x1 = ""
            x1 = editText2.text.toString()
            var z = ""
                for (x in 0..x1.toInt()){
                z += x.toString()+" "
                }
            textView5.text = z
        }
    }
}
