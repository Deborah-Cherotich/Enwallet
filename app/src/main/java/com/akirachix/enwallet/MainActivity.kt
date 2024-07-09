package com.akirachix.enwallet

import android.os.Binder
import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.enwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvMoney.layoutManager = LinearLayoutManager(this)
        displayMoneyList()
    }
    fun  displayMoneyList(){
        val money = Money( "","Salary", "KES 4000","1 July 2024")
        val money1 = Money( "","Rent", "KES 16000","2 July 2024")

        val money2 = Money( "","Dividends", "KES 24000","3 July 2024")

        val money3 = Money( "","Electricity", "KES 800","3 July 2024")
        val money4 = Money( "","Internet", "KES 2500","4 July 2024")
        val money5 = Money( "","Shopping", "KES 3500","5 July 2024")
        val money6 = Money( "","Bus fare", "KES 500","5 July 2024")
        val money7 = Money( "","Water bill", "KES 300","11 July 2024")

        val moneySpend = listOf(money,money1,money2,money3,money4,money5,money6,money7)
        val walletAdapter = WalletAdapter(moneySpend)
        binding.rvMoney.adapter = walletAdapter

    }
}