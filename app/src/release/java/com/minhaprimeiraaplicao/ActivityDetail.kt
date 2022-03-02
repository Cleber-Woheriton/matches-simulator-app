package com.minhaprimeiraaplicao

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.minhaprimeiraaplicao.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Declarando a variável por não estar declarada no construtor
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Comentando esta linhda de código, para usar o binding
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}