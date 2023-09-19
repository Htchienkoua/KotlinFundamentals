package com.example.nothing.Fundamentals

fun main(args: Array<String>) {

    var age = arrayOf(1,2,3)

    println("First element of Array = " +age[0])
    //using the get method
    println("Second element of Array = " +age.get(1))
    println("Third element of Array = " +age[2])

    var cars = arrayOf("Mercedes","BMW", "Opel")

    println("---------------------------")
    println("First element of Array = " +cars[0])
    //using the get method
    println("Second element of Array = " +cars.get(1))
    println("Third element of Array = " +cars[2])

    //using the set method to edit array values: takes the index and value to change of the array value index
    cars.set(2,"Ford")

    println("---------------------------")
    println("First element of Array = " +cars[0])
    //using the get method
    println("Second element of Array = " +cars.get(1))
    println("Third element of Array = " +cars[2])

    //getting the size of an array. It returns a result of Int datatype
    println("Size of the cars array is : " +cars.size)

    var carsAndAge = arrayOf("Mercedes", 5 , "Opel", 10)
    println("---------------------------")
    println("First element of Array = " +carsAndAge[0])
    //using the get method
    println("Second element of Array = " +carsAndAge.get(1))
    println("Third element of Array = " +carsAndAge[2])
    println("Fourth element of Array = " +carsAndAge[3])


}