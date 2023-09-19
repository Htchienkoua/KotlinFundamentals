package com.example.nothing.OOP.override

import com.example.nothing.OOP.Vehicle

fun main(args: Array<String>) {

    // creating an object from Vehicle Class

    var vehicle = Vehicles()

    vehicle.start()
    vehicle.accelerate(80)
    vehicle.stop()


    //creating an object from Car class
    println("____________________________")
    var car = Car()

    car.start()
    car.accelerate(100)
    car.stop()

    //without overriding the function methods and values in the child class, the parent class methods and
    //objects will be called always even in the child classes
    //look at the function overriding details in the parent class 'Vehicle' and child class 'Car'


    //displaying the methods with the super class in the car class from the vehicle class 
    println("____________________________")
    car.superStart()
    car.superAccelerate()
    car.superStop()
}