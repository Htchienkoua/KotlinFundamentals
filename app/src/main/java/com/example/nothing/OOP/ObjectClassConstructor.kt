package com.example.nothing.OOP

fun main(args: Array<String>) {

    //creating an object from the class
/*

    //an object is an instance of a class i.e the class in a particular form with particular properties

    // then we create an object of the class 'Cars'

    var myCar = Cars()

    //then we can now use the properties of that class from its object name
    myCar.name = "Ferrari"
    myCar.model = 2021
    myCar.country = "USA"


    // this is another example of an object created from the class Cars
    var myCar2 = Cars()
    myCar2.name = "Mercedes"
    myCar2.model = 2010
    myCar2.country = "Germany"

    // and use the object in the coding sequence for various tasks like printing the result, etc

    println("My first car's name is ${myCar.name} and its model is ${myCar.model}. It comes from ${myCar.country}")

    println("My second car's name is ${myCar2.name} and its model is ${myCar2.model}.It comes from ${myCar2.country}")
*/

    //using the primary constructor only of the class in pratical use
    var myNewCar = MyCars("Ferrari",2021)

    // we can use the init to place properties for our object , or assign them in the compilation code
    println("My car's name is ${myNewCar.name} and its model is ${myNewCar.model}")


    var mySecondCars = MySecondCars("Mercedes", 2000)

    //reassigning the object properties values after declaring and initializing the class i.e if need be in the code
    //this is because the set method in the backend does the modifiers for this class object properties and rewrites the property values

    mySecondCars.name = "Opel"
    mySecondCars.model = 2010

    //should in case we dont wish to change the value for the object property(value) , we should
    // use the 'private' visibility modifier to make it accessible only from its original class.
    //this process is the encapsulation process in kotlin

    println("My second car's name is ${mySecondCars.name} and the model is ${mySecondCars.model}")

}