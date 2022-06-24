package com.example.jsonwebservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.Button
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

        val txtUsu = findViewById<EditText>(R.id.txt_usuario);
        val txtPass = findViewById<EditText>(R.id.txt_clave);
        val boton = findViewById<Button>(R.id.btn_Ingresar);


            boton.setOnClickListener {

            if (txtUsu.getText().toString().equals("jimmy") &&
                txtPass.getText().toString().equals("1234"))
            {
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                val b = Bundle();
                b.putString("Usuario", txtUsu.getText().toString());
                b.putString("Clave", txtPass.getText().toString());
                intent.putExtras(b);
                startActivity(intent);
            }
            else{
                val text = "Usuario Incorrecto"
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(applicationContext, text, duration)
                toast.show()
            }
        }

    }



}


