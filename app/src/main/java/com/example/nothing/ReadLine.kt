package com.example.nothing

//also contains some nullables knowledge manipulation codes
/*
declaration to also consider if there is a null value(like for example if the user didnt enter any value)
var name: String?= readLine()
OR
var name: String = readLine()!!

var age: Int = readLine()!!.toInt()
 */
fun main(args: Array<String>) {

    print("What is your name? ")
    var name: String? = readLine()

    println("How old are you ? ")
    var age: Int  = readLine()!!.toInt()
//must convert it to an Int since the value inputed by default is always a string

println("Your name is $name and your age is " + age)

}