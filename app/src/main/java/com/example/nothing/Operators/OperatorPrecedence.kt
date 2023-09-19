package com.example.nothing.Operators

//Operator priority in kotlin
/*
first the unary operators in highest priority (++ , -- , + , - , ! )
Second the Multiplicative operators ( * , / , %)
Third the Additive Operators ( + , - )
Fourth the Relational Operators (< , <= , > , >= )
Fifth the Equality Operators ( == , != )
Sixth the Conditional AND operator(&&)
Seventh the Conditional OR operator(||)
Last the Assignment Operators( = , += , -= , *= , /= , %=

take note that operators in parenthesis () is considered of topmost priority

 */
fun main(args: Array<String>) {

    var result : Int = 5 + 2 * 4
    println("Result = " + result)

    var result2: Int  = (5 + 2) * 4
    println("Result2 = " + result2)

    var x: Int = 8
    var y: Int = 4
    var z : Int = 2
    var sum : Int = 0

    sum = x + --y + --z
    println("Sum = " + sum )


    // exercise task
    print(13/2)
    print(13/2.0)
    print(13%2)
    print(13%2.0)

}