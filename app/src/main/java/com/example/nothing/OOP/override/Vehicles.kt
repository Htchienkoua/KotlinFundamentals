package com.example.nothing.OOP.override

open class Vehicles {

    open fun start()
    {
        println("The vehicle has Started ")
    }

    open fun accelerate(speed: Int)
    {
        println(" Vehicle accelerates at $speed .")
    }

    open fun stop()
    {
        println(" Vehicle has Stopped . ")
    }
}