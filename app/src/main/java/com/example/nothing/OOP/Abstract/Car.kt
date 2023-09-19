package com.example.nothing.OOP.Abstract

class Car(override var model: Int) : Vehicle() {

    override fun vehicleName(name: String): String {
    return name
    }
}