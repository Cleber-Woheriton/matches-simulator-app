package com.minhaprimeiraaplicao

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.minhaprimeiraaplicao.databinding.ActivityDetailBinding
import com.minhaprimeiraaplicao.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {

    // Declarando a variável por não estar declarada no construtor
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Comentando esta linhda de código, para usar o binding
        //setContentView(R.layout.activity_main)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
}