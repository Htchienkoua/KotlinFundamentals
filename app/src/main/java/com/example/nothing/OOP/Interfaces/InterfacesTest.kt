package com.example.nothing.OOP.Interfaces

fun main(args: Array<String>) {

    var vehicles = Vehicles()

    println("Name : ${vehicles.name}")
    vehicles.go()
    vehicles.stop()
}