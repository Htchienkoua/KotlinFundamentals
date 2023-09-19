package com.example.nothing.OOP

//primary and secondary constructors

// a primary constructor is declared with the class name and doesn't take any initial values( no initialization in the constructor). Just the object properties

class MyCars constructor(var name: String, var model: Int ){

    //if we need to give initial values to a primary constructor we need the 'init' keyword
    init {
        println("My car's name is $name and its model is $model")
    }
}