package com.example.nothing.ControlFlowStatements

fun main(args: Array<String>) {

    println("Please enter a number : ")
    var number: Int = readLine()!!.toInt()

        //test if the number is an even number
        if (number % 2 == 0){
            println("$number is an even number")
        }else {
            println("$number is an odd number")
            //the number is an odd number
        }

}