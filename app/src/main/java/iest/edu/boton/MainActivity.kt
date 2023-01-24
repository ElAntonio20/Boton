package iest.edu.boton

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tvFrase: TextView
        tvFrase = findViewById(R.id.TextViewFrase)
        var etFrase: EditText
        etFrase = findViewById(R.id.TextFrase)
        var bnMostrar = findViewById<Button>(R.id.Mostrar)
        bnMostrar.setOnClickListener {
            val frase = etFrase.text.toString()
            Snackbar.make(tvFrase, "Su frase fue $frase", Snackbar.LENGTH_LONG).show()
        }
    }
}