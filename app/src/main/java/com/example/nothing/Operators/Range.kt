package com.example.nothing.Operators

fun main(args: Array<String>) {

    var myCharRange = 'a'.rangeTo('p')
//the previous line of code could still be written like this:
    // var myCharRange = 'a'..'j'

    var myChar = 'k' in myCharRange
    println("myCharRange has k : " + myChar)

}