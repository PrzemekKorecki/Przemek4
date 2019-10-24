package com.example.przemek4

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
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
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var selectedOption=""
        when(item?.itemId){
            R.id.menuItem2 -> startActivity(Intent(this, DrugaAktywnosc::class.java))
            R.id.menuItem3 -> startActivity(Intent(this, TrzeciaAktywnosc::class.java))
            R.id.menuItem4 -> startActivity(Intent(this, CzwartaAktywosc::class.java))
            R.id.menuItem5 -> startActivity(Intent(this, PiataAktywnosc::class.java))
            R.id.menuItem6 -> startActivity(Intent(this, SzostaAktywnosc::class.java))
            R.id.menuItem7 -> selectedOption = "7 jeszcze nie oprogramowana"
            R.id.menuItem8 -> selectedOption = "8 jeszcze nie oprogramowana"
            R.id.menuItem9 -> selectedOption = "9 jeszcze nie oprogramowana"
            R.id.menuItem10 -> selectedOption = "10 jeszcze nie oprogramowana"
            R.id.menuItem11 -> selectedOption = "11 jeszcze nie oprogramowana"

        }
        Toast.makeText(this, "Opcja "+ selectedOption, Toast.LENGTH_LONG ).show()
        return super.onOptionsItemSelected(item)
    }
}
