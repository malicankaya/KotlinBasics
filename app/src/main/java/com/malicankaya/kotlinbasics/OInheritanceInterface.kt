package com.malicankaya.kotlinbasics

interface Drivable {
    val maxSpeed: Double
    fun drive(): String
    fun brake() {
        println("The drivable is braking")
    }
}

//Super class, base class, parent class
//if one class will be inherit, open keyword must be used
open class Car(override val maxSpeed: Double, val model: String, val brand: String) : Drivable {
    //if one member,object will be override in child class, open keyword must be used
    open var range = 100.0

    //if one property or function will getting from an interface,
    //override keyword must be used
    override fun drive(): String {
        return "Drive function is working"
    }

    //if one function will be override in child class, open keyword must be used
    open fun drive(distance: Double) {
        println("Drove for $distance KM")
    }
}

//child class, sub class, derived class
class ElectricCar(maxSpeed: Double, model: String, brand: String,
                  private var batteryLife: Double ) : Car(maxSpeed, model, brand) {

    override var range = batteryLife * 5
    var chargerType: String? = null

    override fun drive(distance: Double) {
        println("$brand - $model car driven for $distance")
    }


    override fun drive(): String {
        return "Electric car simple driven"
    }

    override fun brake(){
        super.brake()
        println("brake running in electric car")
    }

    fun extendBatteryLife(amount: Double) {
        if (amount > 0) {
            batteryLife += amount
            println("Batterlife extended for $amount, current battery life is $batteryLife")
        }
    }
}

fun main() {
    var myAudi = Car(200.0,"A3", "Audi")
    var myTesla = ElectricCar(250.0,"Model S", "Tesla", 88.0)

    myAudi.drive(100.0)

    myTesla.drive()
    myTesla.drive(200.0)
    myTesla.extendBatteryLife(7.0)

    myAudi.brake()
    myTesla.brake()
}