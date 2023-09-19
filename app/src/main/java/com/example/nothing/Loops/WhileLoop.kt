package com.example.nothing.Loops

import kotlin.random.Random

fun main(args: Array<String>) {

//    var i = 5
//    while (i > 0)
//    {
//        println(i)
//        i--
//    }

    //function to get the factorial of a number
//    var k = 1
//    var fact = 1
//    while (k < 6)
//    {
//        fact *= k   //fact = fact * k
//        println("$k! = " + fact)
//        k++
//    }

    //infinite loop i.e continues infinitely until the desired condition is met
    val number = Random.nextInt(0, 100)  //package which generates a random number between 0 and 100
    println("please enter a number : ")

    //write any condition which will always be met i.e while (true), while( 2>1 ) , while (10 > 5), etc
    while ( true )
    {
        val userGuess: Int = readLine()!!.toInt()
        if(userGuess == number)
        {
            println("Congratulations, you know the number in my mind")
            break
        }
        else if (userGuess < number)
        {
            println("Increase your guess ")
        }
        else
        {
            println("Decrease your guess")
        }
    }
}