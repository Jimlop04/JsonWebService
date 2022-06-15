package com.example.jsonwebservice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.view.View
import android.widget.TextView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONArray
import org.json.JSONObject
import org.json.JSONTokener

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val txtMostrarUsuario= findViewById<TextView>(R.id.txt_MostrarUsuario);

        val bundle = this.getIntent().getExtras();

        txtMostrarUsuario.setText(
            "Bienvenido... \n"
            +"Usuario: " + bundle?.getString("Usuario") +"\n"
            +"Contraseña: " +bundle?.getString("Clave"));
    }


    fun ConsultaVolley(view: View){

        val Cadenatxt = findViewById<TextView>(R.id.txt_MostrarResVolley)
        val mostrarDatos = Volley.newRequestQueue(this)
        val url = "https://gorest.co.in/public/v1/users"

        val stringRequest = StringRequest(
            Request.Method.GET, url,
            Response.Listener<String> { response ->
                Cadenatxt.text = "${response.toString()}"
            },
            Response.ErrorListener { Cadenatxt.text = "No se realizo la Consulta!"})
        Cadenatxt.movementMethod= ScrollingMovementMethod()

     //   val jsonObject = JSONTokener(stringRequest.toString()).nextValue() as JSONObject
     //   val jsonArray = jsonObject.getJSONArray("data");

     //   for(i in 0 until jsonArray.length()){

       //  val id = jsonArray.getJSONObject(i).getString("id")
        //  Log.i("id: ", id)

          //  val name = jsonArray.getJSONObject(i).getString("name")
          //  Log.i("name: ", name)

           // val email = jsonArray.getJSONObject(i).getString("email")
           // Log.i("email: ", email)

           // val gender = jsonArray.getJSONObject(i).getString("gender")
           // Log.i("gender: ", gender)

           // val status = jsonArray.getJSONObject(i).getString("status")
           // Log.i("status: ", status) }

          mostrarDatos.add(stringRequest);

    }

    fun regresarPrincipal(view: View){
        onBackPressed();
    }


}