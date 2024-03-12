package com.example.caixadocaminhao

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.example.caixadocaminhao.DatabaseHelper

class EntradaActivity : AppCompatActivity() {

    private val dbHelper = DatabaseHelper(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entrada)

        val spinnerTipoEntrada = findViewById<Spinner>(R.id.spinnerTipoEntrada) as Spinner
        val editTextData = findViewById<EditText>(R.id.editTextData) as EditText
        val editTextValor = findViewById<EditText>(R.id.editTextValor) as EditText
        val editTextObservacoes = findViewById<EditText>(R.id.editTextObservacoes) as EditText

        val btnSalvar = findViewById<Button>(R.id.btnSalvar)
        btnSalvar.setOnClickListener {
            val tipoEntrada = spinnerTipoEntrada.selectedItem.toString()
            val data = editTextData.text.toString()
            val valor = editTextValor.text.toString().toDouble()
            val observacoes = editTextObservacoes.text.toString()

            val entrada = Entrada(tipoEntrada, data, valor, observacoes)
            dbHelper.insertEntrada(entrada) // Verifique se este método existe

            finish()
        }
    }
}