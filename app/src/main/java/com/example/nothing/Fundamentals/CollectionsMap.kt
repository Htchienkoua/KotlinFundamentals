package com.example.nothing.Fundamentals

fun main(args: Array<String>) {

    println("______________immutable map of ____________")
    // a map arrayList collection takes into its parameters a key-value pair
    // the first variable type is for its key variable and the second is for its value variable type
    //useful to reference arrayList using a value or a key pair without knowing the arrayList contents
    var age = mapOf<String, Int>("David" to 20, "Ronaldo" to 25, "Bismarck" to 45)

    println("age of David: " +age["David"])
    println("age of Ronaldo: " +age["Ronaldo"])

    //adding or removing elements from a Map collection ArrayList
    //maps are immutable collections... meaning after the creation of a map, we can't add or edit the map ArrayList


    //this is how to make a map collection ArrayList mutable
    println("______________mutable map of ____________")
    var mutableAge = mutableMapOf<String, Int>("David" to 20, "Ronaldo" to 25 )

    //now we can add another element
    mutableAge.put("Buffon", 30)

    println("age of David: " +age["David"])
    println("age of Ronaldo: " +age["Ronaldo"])
    println("age of Buffon: " +mutableAge["Buffon"])

    //using the get method
    println("age of Buffon: " +mutableAge.get("Buffon"))
}