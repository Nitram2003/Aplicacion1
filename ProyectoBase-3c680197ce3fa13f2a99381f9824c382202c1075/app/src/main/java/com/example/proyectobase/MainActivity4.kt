package com.example.proyectobase


import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.EditText
import android.widget.Spinner
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectobase.utils.OperacionesMat

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)

        val edNumero1:EditText = findViewById(R.id.ed_numero1)
        val edNumero2:EditText = findViewById(R.id.ed_numero2)
        val btnCalcular:Button = findViewById(R.id.btn_calcular)
        val spOperacion:Spinner = findViewById(R.id.sp_operacion)
        val txtResultado:TextView = findViewById(R.id.txt_resultado)

        val menuOperaciones = arrayOf("+","-","*","/")
        val adaptador = ArrayAdapter(this,android.R.layout.simple_spinner_item,menuOperaciones)
        spOperacion.adapter = adaptador

        btnCalcular.setOnClickListener{
            var num1 = edNumero1.text.toString().toIntOrNull() ?: 0
            var num2 = edNumero2.text.toString().toIntOrNull() ?: 0
            var resultado = OperacionesMat.sumar(num1,num2)
            txtResultado.text = resultado.toString()

        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}