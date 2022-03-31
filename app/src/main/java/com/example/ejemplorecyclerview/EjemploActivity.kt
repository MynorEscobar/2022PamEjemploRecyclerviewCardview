package com.example.ejemplorecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EjemploActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejemplo)

        val btnSalir = findViewById<Button>(R.id.ejemplo_btn_salir)
        val btnPersona = findViewById<Button>(R.id.ejemplo_btn_personas)
        val btnVehiculo = findViewById<Button>(R.id.ejemplo_btn_vehiculos)

        btnSalir.setOnClickListener {
            finishAndRemoveTask()
        }
        btnPersona.setOnClickListener {
            val llamarPersona: Intent = Intent(this, MainActivity::class.java)
            startActivity(llamarPersona)
        }
        btnVehiculo.setOnClickListener {

        }
    }
}