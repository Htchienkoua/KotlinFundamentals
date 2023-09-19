package com.example.nothing.Functions

/*
functions are of two types

- Standard library Functions
these are predefined functions which are called into the code from the JVM e.g the println() function ,
- User-defined Functions
These are customisable functions created by the coder for use in the code

Function return types :
*Unit(void) : if you do not return any value, kotlin takes it as a void function i.e returns nothing
*Primitive return types( char, byte, boolean , short, int , long, float , double )
*Non-primitive return types ( object of the class, string ,
 */

fun main(args: Array<String>) {

    println("Please enter the first number : ")
    var number1: Int = readLine()!!.toInt()
    println("Please enter the second number: ")
    var number2: Int = readLine()!!.toInt()

    show(number1, number2)
    println("The two numbers entered are $number1 and $number2")

    var a = add(number1, number2)
    println("Sum of the numbers = $a")

    var b = findMinimumNumber(number1, number2)
    println("The minimum number is $b")
}

fun show(num1: Int , num2: Int ) //a unit (void) function since no return type was declared for the function
{
    println("You entered $num1 and $num2: ")
}

fun add(num1: Int , num2: Int ): Int // this is a primitive function since the return type of the function is a primitive Int value
{
    var sum: Int = 0
    sum = num1 + num2
    return sum
}
//camel case for functions and variable naming. the first letter starts in a lowercase and the other words in Uppercase joined to the whole phrase
fun findMinimumNumber(num1: Int , num2: Int ) : Int
{
    var minimum: Int
    if(num1 > num2)
    {
        minimum = num2
    }else
    {
        minimum = num1
    }
    return minimum
}

fun _Start2Stop(){

}