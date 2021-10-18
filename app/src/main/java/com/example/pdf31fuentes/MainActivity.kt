package com.example.pdf31fuentes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn109 = findViewById<Button>(R.id.button)
        val btn110 = findViewById<Button>(R.id.button2)
        val btn111 = findViewById<Button>(R.id.button3)

        btn109.setOnClickListener{lanzar109()}
        btn110.setOnClickListener{lanzar110()}
        btn111.setOnClickListener{lanzar111()}
    }

    fun lanzar109() {
        val i = Intent(this, Proyecto134Fuentes::class.java)
        startActivity(i)
    }

    fun lanzar110() {
        val i = Intent(this, Proyecto135Fuentes::class.java)
        startActivity(i)
    }

    fun lanzar111() {
        val i = Intent(this, Proyecto136Fuentes::class.java)
        startActivity(i)
    }
}