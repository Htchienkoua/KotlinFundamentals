package com.example.nothing

fun main(args: Array<String>) {
//first syntax of creating and using an ArrayList
    var age = ArrayList<Int>()

    age.add(10) //first way to add elements to an arrayList by just declaring the element after the add method
    //we already added an initial element at index 0 , so the next one must be at index 1
    age.add(1,15) //second way to add elements to an arrayList by declaring the index and element to the add method
    age.add(20) //this will be the third element

   /* println("First element of ArrayList = " +age[0])
    println("Second element of ArrayList = " +age.get(1))
    println("Third element of ArrayList = ${age[2]} " ) //different ways to display the elements of the ArrayList
*/
    //the remove method needs the element of the arrayList
    //the removeAt method needs the index of the element to remove in the arrayList
    //both methods do the same task but have a slighly different syntax of usage
    age.remove(15)
    println(age.size)

    println("First element of ArrayList = " +age[0])
    println("Second element of ArrayList = " +age.get(1))
    println("__________________________")

//Second syntax of creating and using an ArrayList
    var cars = arrayListOf<String>("Opel", "BMW")
    //lets add the third element of the arrayList using the add method
    cars.add("Ford")
    cars.add(3, "Preado")

    println("First element of ArrayList = " +cars[0])
    println("Second element of ArrayList = " +cars.get(1))
    println("Third element of ArrayList = ${cars[2]} " )
    println("Third element of ArrayList = ${cars[2+1]} " )
    println("-----------------------------------")

    //declaring an arrayList of diffferent variable datatypes in the array
    var myMixArrayList = ArrayList<Any>()
    myMixArrayList.add("Ford")
    myMixArrayList.add(5)
    myMixArrayList.add(2.5)
    myMixArrayList.add(false)
    myMixArrayList.add('K')

    println(myMixArrayList[0])
    println(myMixArrayList[1])
    println(myMixArrayList.get(2))
    println(myMixArrayList.get(3))


}