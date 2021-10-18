package com.example.pdf31fuentes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Proyecto134Fuentes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proyecto134_fuentes)

        val num1 = findViewById<EditText>(R.id.editTextNumber)
        val num2 = findViewById<EditText>(R.id.editTextNumber2)
        val boton = findViewById<Button>(R.id.button4)
        val mensaje = findViewById<TextView>(R.id.textView)

        boton.setOnClickListener{
            val numero = num1.text.toString().toInt()
            val numero2 = num2.text.toString().toInt()

            mensaje.text = ("Numero aleatorio: ${Matematica.aleatorio(numero, numero2)}")
        }
    }

    object Matematica {
        val PI = 3.1416

        fun aleatorio(minimo: Int, maximo: Int) = ((Math.random() * (maximo + 1 -
        minimo)) + minimo).toInt()
    }
}