package com.example.caixadocaminhao


import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnEntradas = findViewById<Button>(R.id.btnEntradas)
        btnEntradas.setOnClickListener {
            startActivity(Intent(this, EntradaActivity::class.java))
        }

        val btnSaidas = findViewById<Button>(R.id.btnSaidas)
        btnSaidas.setOnClickListener {
            startActivity(Intent(this, SaidaActivity::class.java))
        }

        val btnRelatorios = findViewById<Button>(R.id.btnRelatorios)
        btnRelatorios.setOnClickListener {
            startActivity(Intent(this, RelatorioActivity::class.java))
        }
    }
}
