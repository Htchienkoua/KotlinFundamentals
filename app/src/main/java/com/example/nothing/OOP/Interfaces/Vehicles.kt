package com.example.nothing.OOP.Interfaces


/*
    an interface is also abstract in the sense that it doesn't contain methods in its body
    but defines the properties of the class from which it interacts with
    Normally in kotlin , a class can inherit only from one parent class
    So interfaces can permit for cross inheritance between other classes without creating other
    parent classes. We use interfaces
     */

class Vehicles : CanGo , CanStop {  //shows the inheritance of vehicles from the CanGo and CanStop interfaces
    override val name: String
        get() = "Ferrari"

    override fun stop(){
        println("Vehicles can stop")
    }

}