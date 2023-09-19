package com.example.nothing.OOP


//usage fo inheritance in Kotlin OOP language
// we will use a 'Vehicle' super class in which there will be two subclasses : 'Cars' and 'Motorcycle'
// we will transmit the properties of the parent class(Vehicle) to the child classes 'Cars' and 'Motorcycle'
// but each child/sub class will have some specific details(methods) to them in addition to what was
//inherited from the parent class

open class Vehicle {


    //defining the propoerties of the super class 'vehicle'
    var type : String ? = null
    var model: String ? = null
    var maxSpeed: Int ? = null

    fun show(){
        println("Type :  $type")
        println("Model :  $model")
        println("Max Speed  :  $maxSpeed")
    }


}