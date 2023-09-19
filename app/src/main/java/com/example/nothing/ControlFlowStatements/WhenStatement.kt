package com.example.nothing.ControlFlowStatements

fun main(args: Array<String>) {

    //code to know which number corresponds to the day of the week
    println("Please enter the day of the week: ")

    var dayNumber: Int = readLine()!!.toInt()
    var day: String

    when(dayNumber)
    {
        1 -> day = "Monday" //the lambda expression for the first condition
        2 -> day = "Tuesday"
        3 -> day = "Wednesday"
        4 -> day = "Thursday"
        5 -> day = "Friday"
        6 -> day = "Saturday"
        7 -> day = "Sunday"
        else -> day = "Invalid day choice"
    }

    println("Day is $day : " + dayNumber )
}
