package com.example.nothing.OOP


//we define the inheritance of a class by using the " : " sign after the child class name linking to the parent class
// but a class in kotlin is 'final' by default (meaning it doesn't permit inheritance).
// so we need to modify the visibility modifier of the parent class 'Vehicle' by adding the 'open' keyword

//creation of the 'Motorcycle' child class
class Motorcycle : Vehicle() {

}