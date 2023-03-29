package com.example.projectassembly.clases

enum class Size {Small, Medium, Jumbo}

//Clase abstracta que se para definir el producto en su aspecto general
abstract class Product(open val name: String) {

    //Todos los productos tienen un sabor, tamaño, precio y se especifíca una cantidad
    abstract val flavor: String
    //open protected var size: Size = Size.Small
    open protected var price: Float = 0.0f
    open protected var quantity: Int = 0

    //Función que calcula la cantidad a pagar de un producto génerico en base a la cantidad y tamaño

    open fun subTotal(cantidad: Int, tamaño: String) =

        when (tamaño) {
            "Small" -> cantidad * price

            else -> 1.2f * cantidad * price
        }
       /* when (size) {
            Size.Small -> cantidad * price

            else -> 1.2f * cantidad * price
        }*/
}