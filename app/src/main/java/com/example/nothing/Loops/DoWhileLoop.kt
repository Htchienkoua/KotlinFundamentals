package com.example.nothing.Loops

fun main(args: Array<String>) {

    var number : Int = 1

// the code in the do braces are executed at least once before the condition is checked at the end of the loop

//    do {
//        println("$number")
//        number++
//    }while (number <= 15)
//
    var a = 5
    var b = a++
    val cars = arrayOf("Mercedes","BMW","Ford","Opel")
    while (a > b){
        println(cars[2])
    }

//Notice that the increment operator is written after the variable "a".
// This means: transfer the value of "a" to "b" then increment the value of "a".
// So the value of "b" is still 5, not 6. But the value of "a" is now 6.
// Since 6 > 5, the while condition is true and an infinite loop occurs.
// In this loop, the Ford element is printed to the console every time.
// You can test this yourself.
}