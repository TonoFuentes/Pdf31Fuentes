package com.example.pdf31fuentes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Proyecto135Fuentes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proyecto135_fuentes)

        val mensaje = findViewById<TextView>(R.id.textView2)
        val boton = findViewById<Button>(R.id.button5)

        boton.setOnClickListener{
            val dados = object {
                val arreglo = IntArray(5)
                fun generar() {
                    for(i in arreglo.indices)
                        arreglo[i] = ((Math.random() * 6) + 1).toInt()
                }
                fun imprimir(): String {
                    var texto = ""
                    for(elemento in arreglo)
                        texto = ("$elemento - \n")
                    return texto
                }
                fun mayor(): Int {
                    var may = arreglo[0]
                    for(i in arreglo.indices)
                        if (arreglo[i] > may)
                            may = arreglo[i]
                    return may
                }
            }
            dados.generar()
            mensaje.append("${dados.imprimir()}\n")
            mensaje.append("Mayor valor: ${dados.mayor()}")
        }
    }
}