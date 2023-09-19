package com.example.nothing.OOP.Interfaces

interface CanGo {


    /*another difference between an abstract class and an interface is that the interface can
    * take a body in its defining functions , but abstract classes only have the function and
    * primary constructor defined . They aren't allowed to take any body in its functions  */

    //interfaces don't allow properties/methods to be initialized in the body of the interface
    //but permit for the 'get' and 'set' methods

    fun go()
    {
        println("Vehicles can go ")
    }

    val name: String
}