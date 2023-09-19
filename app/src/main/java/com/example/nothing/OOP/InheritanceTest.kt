package com.example.nothing.OOP

fun main() {

    //creating an object from Car class
    // lets note that all the properties from the 'Vehicle' class can be accessed from the 'Car' class as well
    //we had the type, model , maxSpeed and show() methods from the parent class
    var car = Car()
    car.type = "Car"
    car.model = "Ferrari"
    car.maxSpeed = 320

    car.show()

    //creating an object from Motorcycle class
    // lets note that all the properties from the 'Vehicle' class can be accessed from the 'Motorcycle' class as well
    //we had the type, model , maxSpeed and show() methods from the parent class

    var motor = Motorcycle()
    motor.type = "Motorcycle"
    motor.model = "Yamaha"
    motor.maxSpeed = 180

    motor.show()
}