package com.example.proyectobase

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Date

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        val edNombre:EditText = findViewById(R.id.ed_nombre)

        val edApellido:EditText = findViewById(R.id.ed_apellido)

        val edFecNac:EditText = findViewById(R.id.ed_Fnac)

        val btnGuardar:Button = findViewById(R.id.btn_act3)

        val msgRescate:TextView = findViewById(R.id.tx_Rescate)



        btnGuardar.setOnClickListener{

            msgRescate.text= edNombre.text.toString()+ " " + edApellido.text.toString() + " " + edFecNac.text.toString()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}