package com.example.listingapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.listingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMyLists.setOnClickListener {
            val intent = Intent (this, MyLists::class.java)
            startActivity(intent)

        }
        binding.btnNewList.setOnClickListener {
            val intent = Intent (this, NewList::class.java)
            startActivity(intent)

        }
        binding.btnAddItem.setOnClickListener {
            val intent = Intent (this, AddItem::class.java)
            startActivity(intent)

        }

    }
}
