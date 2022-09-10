package com.malicankaya.kotlinbasics

fun main() {
    //the primary constructor will be initiate after that the second constructor
    //i guess, the logic is 2nd constructor call primary constructor.
    var obj = MyClass("mali", "cankaya", 25)
}

//primary constructor, YOU CAN ACCESS PARAMETERS ONLY IN init
class MyClass(firsName: String = "defaultName", lastName: String = "defaultSurname") {

    //member variables - properties
    var age: Int? = null

    //primary constructor's init
    init {
        println("My name is $firsName and my surname is $lastName")
    }

    //second constructor and its init
    constructor(firsName: String, lastName: String, age: Int)
            : this(firsName, lastName) {

        println("My name is $firsName, my surname is $lastName and i am $age")
    }
}