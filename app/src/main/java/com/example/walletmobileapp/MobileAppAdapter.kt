package com.example.walletmobileapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class MobileAppAdapter(var transactionLists: List<MobileWalletApp>,var  context: Context): RecyclerView.Adapter<MobileAppAdapter.WalletViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WalletViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_of_transactions, parent, false)
        return WalletViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: WalletViewHolder, position: Int) {
        var currents = transactionLists.get(position)
        holder.accountNames.text = currents .reference
        holder.currency.text = currents .transactionType
        holder.balance.text = currents .amount
        holder.date.text = currents .Date
        holder.average.text = currents .Description
    }

    override fun getItemCount(): Int {
        return transactionLists.size
    }


    class  WalletViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
            var accountNames=itemView.findViewById<TextView>(R.id.tvaccountName)
            var currency=itemView.findViewById<TextView>(R.id.tvcurrency)
            var balance=itemView.findViewById<TextView>(R.id.tvbalance)
            var date=itemView.findViewById<TextView>(R.id.tvdate)
            var average=itemView.findViewById<TextView>(R.id.tvaverage)
            var  cvcontacts=itemView.findViewById<CardView>(R.id.cvtransaction)


        }

    }

