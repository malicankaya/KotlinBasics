package com.malicankaya.kotlinbasics

fun main() {
    var myObj = MyClassA()
    println(myObj.myCar)
    myObj.myHouse = "roof"
    println(myObj.myHouse)
    println(myObj.maxSpeed)
}

class MyClassA (){
    //everytime there are getter and setter by default. you can customize it
    var myCar = "BMW"
    get() = field.lowercase()
    var maxSpeed = -100
    get() = if(field >= 0) field else throw IllegalArgumentException("Max speed must be greater than 0")

    var myHouse = "ats First Floor"
    get () = if (myCar != "bmw") "at Garden Floor" else field
    set(value) { if (myHouse == "at FirstFloor") field = value else field = "None" }

    /*-----------------------------------------------------------------------*/

    //you cannot pass without initialize specific object type
    //lateinit keyword helps for it

    lateinit var nullableObj: String

    init {
        nullableObj = "Hekimoglu deeeerler beniiim adıııımaaaağğğğğ"
    }
}