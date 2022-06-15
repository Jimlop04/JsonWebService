package com.example.jsonwebservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun VerificarUsuario(view: View){

        val intent = Intent(this@MainActivity, MainActivity2::class.java)

        val txtUsu = findViewById<EditText>(R.id.txt_usuario);
        val txtPass = findViewById<EditText>(R.id.txt_clave);

        val b = Bundle();
        b.putString("Usuario", txtUsu.getText().toString());
        b.putString("Clave", txtPass.getText().toString());

        intent.putExtras(b);
        startActivity(intent);

    }

}


