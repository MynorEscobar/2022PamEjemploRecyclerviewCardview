package com.example.ejemplorecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnSalir = findViewById<Button>(R.id.menu_btn_cerrar)
        val btnPersona = findViewById<Button>(R.id.menu_btn_personas)
        btnSalir.setOnClickListener {
            //finalizar
            finishAndRemoveTask()
        }
        btnPersona.setOnClickListener {
            val intent:Intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}