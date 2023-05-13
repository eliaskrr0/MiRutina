package com.example.mirutina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        abrirVentanaPrinicpal()
    }

    fun abrirVentanaPrinicpal() {
        val ventanaPrinciapl = Intent(this, MainActivity::class.java)
        Thread.sleep(2000)
        startActivity(ventanaPrinciapl)
    }
}