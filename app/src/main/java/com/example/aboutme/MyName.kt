package com.example.aboutme

data class MyName (var name: String = "", var nickname: String = "")
// objects of a data class can use == to check for data equality of two objects. See p.99 Hagos
// i.e. no need to use .equals()

