package com.example.nothing

fun main(args: Array<String>) {

    var mySetArray = arrayListOf<Any>("Kotlin", 2, 2.5, 'K', true , "Kotlin")

    println(mySetArray.size)
    //the last method allows us to access the last element in an arrayList
    println(mySetArray.last())
    println("___________________________________")

    // now we use the setOf method and observe the difference
    var mySetNArray = setOf<Any>("Kotlin", 2, 2.5, 'K', true , "Kotlin")

    println(mySetNArray.size)
    //the last method allows us to access the last element in an arrayList
    println(mySetNArray.last())
}