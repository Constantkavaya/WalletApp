package com.example.walletmobileapp

import java.math.BigInteger

data class MobileWalletApp(
    var Description:String,
    var reference:String,
    var Date:String,
    var amount:BigInteger,
    var transactionType:String

)
