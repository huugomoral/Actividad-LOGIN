package com.example.actividadlogin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast



class LoginActivity : AppCompatActivity() {
    private val MYUSER = "hugo"
    private val MYPASS = "secreto"

    private lateinit var editUsuario: EditText
    private lateinit var editPass: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        editUsuario = findViewById(R.id.edit_usuario)
        editPass = findViewById(R.id.edit_pass)
        button = findViewById(R.id.button)

        button.setOnClickListener {

            if (editUsuario.text.toString() == MYUSER && editPass.text.toString() == MYPASS) {
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("usuario", editUsuario.text.toString())
                    putExtra("password", editPass.text.toString())
                }

                startActivity(intent)

            } else {
                Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_LONG).show()

            }


        }
    }
}