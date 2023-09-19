package com.example.nothing.OOP.Abstract


//definition and aplication of an abstract class
//an abstract class is a class which doesn't have any objects defined in the body of the class
// hence it serves just as a horizontal interlink between two child classes
// we use the keyword 'abstract' to create an abstract class
abstract class Vehicle {

    //abstract function
    abstract fun vehicleName(name: String) : String

    //non -abstract class function
    fun vehicleType(type: String) : String {
        return type
    }

    //abstract property
    abstract var model : Int

    //non-abstract property

    var speed: Int ? = null

}