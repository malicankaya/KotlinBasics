package com.malicankaya.kotlinbasics

import kotlin.random.Random

data class DataClass(val id: Int, var name: String)

fun main() {
    var user1 = DataClass(1, "cankaya")
    println("${user1.id} ${user1.name}")
    //you cannot change val object
    //myVar.name = "hasan"

    user1.name = "Balcı"
    println(user1.name)

    //== checks data === checks pointer
    var user2 = DataClass(1, "Balcı")
    println(user1 == user2)
    println("User Details $user1")

    //copy function
    var updatedUser = user2.copy(name = "Hakkı")
    println("updatedUser details $updatedUser")

    println(updatedUser.component1())//prints id so 1
    println(updatedUser.component2())//prints name so Hakkı

    //we can assign object related to data class
    var (id, name) = updatedUser

    println("assigned id is $id and name is $name")

    /*------------------Exercise-------------------------*/

    var phone = MPhone("Android", "POCO", "X3 Pro")
    phone.ChargeBattery(50)

}

/*-------------------Exercise--------------------------------*/

class MPhone(var osName: String, var brand: String, var model: String) {

    private var battery: Int = Random.nextInt(0, 50)

    fun ChargeBattery(chargeAmount: Int) {
        print("Previous battery level is $battery, ")
        battery = if (battery + chargeAmount > 99) 100 else battery + chargeAmount
        println("and now, new battery level is $battery")
    }
}