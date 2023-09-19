package com.example.nothing.OOP

class MySecondCars {

    var name : String? = null
    var model: Int? = null
/*

        private set  // sets the private method to the model object so it can allow the 'get' but not the 'set' method
                get
*/

    // the secondary constructor is delcared in the body of the class and must take initial values alongside the object properties declared.
//the secondary constructor in kotlin is similar to the constructor in java

    //we initialize the properties of the class in a secondary constructor using the 'this' keyword

   /*
   //first way is to hard code the constructor and initialize the propoerties of the constructor
    constructor(name : String , model : Int )
    {
     this.name = name
     this.model = model
    }
    */

    // second way is easily done using the 'generate' option in the IDE and selecting 'secondary constructor' and then
    //after choosing the properties to initilaize, validate using 'ok'

    constructor(name: String?, model: Int?) {
        this.name = name
        this.model = model
    }


}