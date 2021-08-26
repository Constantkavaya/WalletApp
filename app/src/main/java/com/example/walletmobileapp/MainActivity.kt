package com.example.walletmobileapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listOfTransactions()

    }

    fun listOfTransactions(){

        var  rvlistoftransactions=findViewById<RecyclerView>(R.id.rivlistoftransactions)
        rvlistoftransactions.layoutManager= LinearLayoutManager(baseContext)
        var balance= mutableListOf<String>()
        var totalTransaction:Double
        var credit=""
        var debit=""
        if (debit==balance) {
            debit= balance.getbalance("1000") !!+1
        }
        else {
            credit= balance.getbalance("9000") !!-1
        }
    }


}