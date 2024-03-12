package com.example.caixadocaminhao


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class SaidaActivity : AppCompatActivity() {

    private val dbHelper = DatabaseHelper(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saida)

        val spinnerTipoSaida = findViewById<Spinner>(R.id.spinnerTipoSaida)
        val editTextData = findViewById<EditText>(R.id.editTextData)
        val editTextValor = findViewById<EditText>(R.id.editTextValor)
        val editTextObservacoes = findViewById<EditText>(R.id.editTextObservacoes)

        val btnSalvar = findViewById<Button>(R.id.btnSalvar)
        btnSalvar.setOnClickListener {
            val tipoSaida = spinnerTipoSaida.selectedItem.toString()
            val data = editTextData.text.toString()
            val valor = editTextValor.text.toString().toDouble()
            val observacoes = editTextObservacoes.text.toString()

            val saida = Saida(tipoSaida, data, valor, observacoes)
            dbHelper.insertSaida(saida)

            finish()
        }
    }
}
