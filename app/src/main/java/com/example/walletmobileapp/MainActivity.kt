package com.example.walletmobileapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var  rvlistoftransactions=findViewById<RecyclerView>(R.id.rvlistoftransactions)
        rvlistoftransactions.layoutManager= LinearLayoutManager(baseContext)
    }
}