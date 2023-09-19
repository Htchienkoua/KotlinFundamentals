package com.example.nothing.ControlFlowStatements

fun main(args: Array<String>) {

    println("Please enter your age: ")
    var yourAge : Int = readLine()!!.toInt()

    //If Else Ladder statement
    if (yourAge < 13 ){
        println("You are a child")
    }else if(yourAge < 19) {
        println("You are a teenager")
    }else {
        //nested If statement
        if(yourAge < 65){
            println("You are an adult")
        }else{
            println("You are a senior")
        }
    }
 println("______________________")

    //code to check which number among three numbers is the largest
    println("Please enter 3 numbers : ")
    var number1: Int = readLine()!!.toInt()
    var number2: Int = readLine()!!.toInt()
    var number3: Int = readLine()!!.toInt()

    var largestNumber: Int

    if(number1 >= number2){
        if (number1 >= number3){
            largestNumber = number1
        }else{
            largestNumber = number3
        }
    }else{
        if(number2 >= number3){
            largestNumber = number2
        }else{
            largestNumber = number3
        }
    }
    println("The largest number is $largestNumber")


}