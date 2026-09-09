package br.gov.sp.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val valor1 = findViewById<EditText>(R.id.textEditValor1)
        val valor2 = findViewById<EditText>(R.id.textEditValor2)

        val btnAdicao = findViewById<Button>(R.id.buttonAdicao)
        val btnSubtracao = findViewById<Button>(R.id.buttonSubtracao)
        val btnMultiplicacao = findViewById<Button>(R.id.buttonMultiplicacao)
        val btnDivisao = findViewById<Button>(R.id.buttonDivisao)

        val txtResultado = findViewById<TextView>(R.id.textViewResultado)

        val btnLimpar = findViewById<Button>(R.id.buttonLimpar)

        btnAdicao.setOnClickListener {
            val soma = valor1.text.toString().toDouble() + valor2.text.toString().toDouble()
            txtResultado.text = soma.toString()
        }

        btnSubtracao.setOnClickListener {
            val calc = valor1.text.toString().toDouble() - valor2.text.toString().toDouble()
            txtResultado.text = calc.toString()
        }

        btnMultiplicacao.setOnClickListener {
            val calc = valor1.text.toString().toDouble() * valor2.text.toString().toDouble()
            txtResultado.text = calc.toString()
        }

        btnDivisao.setOnClickListener {
            val calc = valor1.text.toString().toDouble() / valor2.text.toString().toDouble()
            txtResultado.text = calc.toString()
        }

        btnLimpar.setOnClickListener {
            valor1.text.clear()
            valor2.text.clear()
        }

    }
}