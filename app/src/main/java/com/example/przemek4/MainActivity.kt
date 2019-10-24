package com.example.przemek4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.setText("Kocham Cię")

        button.setOnClickListener() {
            startActivity(Intent(this, DrugaAktywnosc::class.java))
        }

        button2.setOnClickListener() {
            startActivity(Intent(this, PiataAktywnosc::class.java))
        }

        button.setOnLongClickListener(){
            startActivity(Intent(this, CzwartaAktywosc::class.java))
            true}

        button4.setOnClickListener() {
            startActivity(Intent(this, SzostaAktywnosc::class.java))
        }

            textView.setOnClickListener() {
            startActivity(Intent(this, TrzeciaAktywnosc::class.java))
        }

        textView.setOnLongClickListener(){
            startActivity(Intent(this, PiataAktywnosc::class.java))
            true}



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
