package com.example.nothing.OOP.Abstract

fun main(args: Array<String>) {
/*
    remember that since the abstract class has no properties , we can't create objects(instances)
    of this class in the main body of the code
    but the abstract class links the properties of the normal class : Vehicle, Car to the Car class
    this is because in the abstract class, just the function of the other class is declared
    without necessarily declaring its individual members
*/



   // var vehicle = Vehicle()

    var car = Car(2021)
    car.speed = 300

    println("Name: ${car.vehicleName("Ferrari")} \n" +
            " Type : ${car.vehicleType("Car")} \n" +
            "Model: ${car.model} \n" +
            "Speed : ${car.speed} ")
}

