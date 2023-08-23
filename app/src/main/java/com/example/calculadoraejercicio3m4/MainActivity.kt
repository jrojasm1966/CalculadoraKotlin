package com.example.calculadoraejercicio3m4

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// Se conecta xml con Java por medio de findViewById
        val rst1 = findViewById<TextView>(R.id.Rst1)
        val editText1 = findViewById<TextView>(R.id.edit1)
        val editText2 = findViewById<TextView>(R.id.edit2)
        val rst2 = findViewById<TextView>(R.id.Rst2)
        val button1 = findViewById<Button>(R.id.btn1)
        val button2 = findViewById<Button>(R.id.btn2)
        val button3 = findViewById<Button>(R.id.btn3)
        val button4 = findViewById<Button>(R.id.btn4)

        // Proceso Principal
        button1.setOnClickListener {
            val num1 = editText1.text.toString()
            if (editText1.text.toString().isEmpty()) {
                val mytoast =
                    Toast.makeText(applicationContext, "INGRESE PRIMER VALOR", Toast.LENGTH_LONG)
                mytoast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 80)
                mytoast.show()
            } else {
                val num2 = editText2.text.toString()
                if (editText2.text.toString().isEmpty()) {
                    val mytoast = Toast.makeText(
                        applicationContext,
                        "INGRESE SEGUNDO VALOR",
                        Toast.LENGTH_LONG
                    )
                    mytoast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 80)
                    mytoast.show()
                } else {
                    val resul = num1.toInt() + num2.toInt()
                    rst2.text = "Resultado : $resul"
                    editText1.text = ""
                    editText2.text = ""
                }
            }
        }
        button2.setOnClickListener {
            val num1 = editText1.text.toString()
            if (editText1.text.toString().isEmpty()) {
                val mytoast =
                    Toast.makeText(applicationContext, "INGRESE PRIMER VALOR", Toast.LENGTH_LONG)
                mytoast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 80)
                mytoast.show()
            } else {
                val num2 = editText2.text.toString()
                if (editText2.text.toString().isEmpty()) {
                    val mytoast = Toast.makeText(
                        applicationContext,
                        "INGRESE SEGUNDO VALOR",
                        Toast.LENGTH_LONG
                    )
                    mytoast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 80)
                    mytoast.show()
                } else {
                    val resul = num1.toInt() - num2.toInt()
                    rst2.text = "Resultado : $resul"
                    editText1.text = ""
                    editText2.text = ""
                }
            }
        }
        button3.setOnClickListener {
            val num1 = editText1.text.toString()
            if (editText1.text.toString().isEmpty()) {
                val mytoast =
                    Toast.makeText(applicationContext, "INGRESE PRIMER VALOR", Toast.LENGTH_LONG)
                mytoast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 80)
                mytoast.show()
            } else {
                val num2 = editText2.text.toString()
                if (editText2.text.toString().isEmpty()) {
                    val mytoast = Toast.makeText(
                        applicationContext,
                        "INGRESE SEGUNDO VALOR",
                        Toast.LENGTH_LONG
                    )
                    mytoast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 80)
                    mytoast.show()
                } else {
                    val resul = num1.toInt() / num2.toInt()
                    rst2.text = "Resultado : $resul"
                    editText1.text = ""
                    editText2.text = ""
                }
            }
        }
        button4.setOnClickListener {
            val num1 = editText1.text.toString()
            if (editText1.text.toString().isEmpty()) {
                val mytoast =
                    Toast.makeText(applicationContext, "INGRESE PRIMER VALOR", Toast.LENGTH_LONG)
                mytoast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 80)
                mytoast.show()
            } else {
                val num2 = editText2.text.toString()
                if (editText2.text.toString().isEmpty()) {
                    val mytoast = Toast.makeText(
                        applicationContext,
                        "INGRESE SEGUNDO VALOR",
                        Toast.LENGTH_LONG
                    )
                    mytoast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 80)
                    mytoast.show()
                } else {
                    val resul = num1.toInt() * num2.toInt()
                    rst2.text = "Resultado : $resul"
                    editText1.text = ""
                    editText2.text = ""
                }
            }
        }
    }
}