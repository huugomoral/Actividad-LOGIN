package com.example.actividadlogin

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var mUsuario: TextView
    private lateinit var mContra: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mUsuario = findViewById(R.id.mUsuario)
        mContra = findViewById(R.id.mContra)

        mUsuario.text = getIntent().getStringExtra("usuario")
        mContra.text = getIntent().getStringExtra("contraseña")
    }
}