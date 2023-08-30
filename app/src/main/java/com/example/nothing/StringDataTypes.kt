package com.example.nothing

fun main(args: Array<String>) {

    var a: String = "Hello Kotlin"
    var b: String = "Language "
    var age: Int = 25

    println(a)

    //concatenating strings
    println(a + b)
    println(a + " " + b)

    //display integer values in a statement
    println("Your age is = " + age)

    //length of a string variable
    var x: String ="Kotlin"
    //assign the length method to a variable of its corresponding datatype
    var i: Int = x.length
    println("Length of Kotlin = " + i)

    //comparing two string values via indexation using the equals method
    var r : Boolean = x.equals("Java")
    println("equals method test = " +r)

    //checking if the string variable is empty via the empty method
    println("is empty method test = " +x.isEmpty())

    //adding string values to an existing string variable
    println("the string plus method test = "+x.plus(" language"))

    //the lower and uppercase string methods
    println("the lowercase string method "+x.lowercase())
    println("*****************")
    println("the uppercase string method"+x.uppercase())

    //the trim method usage
    var t: String ="   Android   "
    println(x + t)
    println(x + t.trim())

}