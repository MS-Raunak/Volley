package com.ms.fetchingapi_volley

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ms.fetchingapi_volley.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}