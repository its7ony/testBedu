package com.example.projectassembly.clases

data class Data(
    //Map of the Products Available
    val productList: Map<String, Float> = mapOf(
        "café" to 42.50f,
        "donas" to 12.40f
    ),

    //Map of pre-registered user name and password
    val loginData: Map<String, String> = mapOf(
        "1234" to "gmlimon",
        "hola" to "teaby",
        "5678" to "mbravo"
    ),

    val iva: Float = 1.08f

)