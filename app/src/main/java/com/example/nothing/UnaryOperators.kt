package com.example.nothing

fun main(args: Array<String>) {

    var number: Double = 7.6
    var isCheck : Boolean = true

    println("+number = " + + number)
    println("-number = " + - number)
    println("++number = " + ++ number)
    println("--number = " + -- number)
    println("!isCheck = " + !isCheck)

    println("_____________________________")

    var result : Double = 4.7
    println("result++ = " + result++)  // the result increments after the memory prints the reslt
    println("result = " + result)  // here is the incremented result
    println("++result = " + ++result) //the result gets incremented before the memory print the result
    println("result = " + result) //here is the result which was already incremented
}