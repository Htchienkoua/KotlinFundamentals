package com.example.nothing.OOP.override

class Car : Vehicles() {

    //we copied the methods from the 'Vehicle' parent class
    // but to use them here , we need to use the modifier 'Override' to show
    // that we are editing the method names in the child class for usage specific to the child class

   // also we need to edit the visibility modifier of the methods/functions in the parent class to 'open'
   // so give access for modification in a child class

    override fun start()
    {
        println("The Car has Started ")
    }

    override fun accelerate(speed: Int)
    {
        println("Car accelerates at $speed .")
    }

    override fun stop()
    {
        println("Car has Stopped . ")
    }

    //usage of the 'super' keyword
    //the 'super' keyword denotes the properties from a super class(parent class) to be used
    //in a child class without overriding it individually in the child class

    fun superStart() {
        super.start()
    }

    fun superAccelerate(){
        super.accelerate(130)
    }

    fun superStop(){
        super.stop()
    }

}