package com.example.pdf31fuentes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Proyecto136Fuentes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proyecto136_fuentes)

        val mensaje = findViewById<TextView>(R.id.textView3)
        val boton = findViewById<Button>(R.id.button6)

        boton.setOnClickListener{
            mensaje.append("${Mayor.maximo(12, 23)}\n ${Mayor.maximo(12.5, 23.5)}\n ${Mayor.maximo(12.5f, 23.5f)}\n")
        }
    }

    object Mayor {
        fun maximo(x1: Int, x2: Int) = if (x1 > x2) x1 else x2
        fun maximo(x1: Float, x2: Float) = if (x1 > x2) x1 else x2
        fun maximo(x1: Double, x2: Double) = if (x1 > x2) x1 else x2
    }
}