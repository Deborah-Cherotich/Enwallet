package com.akirachix.enwallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class WalletAdapter ( var moneySpend:List<Money>) : RecyclerView.Adapter<MoneyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoneyViewHolder {
      val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_enwallet,parent,false)
        return  MoneyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return  moneySpend.size


    }

    override fun onBindViewHolder(holder: MoneyViewHolder, position: Int) {
        val Money = moneySpend[position]
        holder.tvSalary.text = Money.money
        holder.tvSalaryKes.text = Money.spend
        holder.tvSalaryData.text = Money.date
    }

}



class MoneyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val tvSalary = itemView.findViewById<TextView>(R.id.tvSalary)
    val tvSalaryKes = itemView.findViewById<TextView>(R.id.tvSalaryKes)
    val tvSalaryData = itemView.findViewById<TextView>(R.id.tvSalaryData)
}