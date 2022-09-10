package com.malicankaya.kotlinbasics

import androidx.core.os.persistableBundleOf

fun main() {
    var mali = Person("Mali", "Can");
    var default = Person();
    var surname = Person(lastName = "Cankaya")
    /*---------------------------------------*/
    var samsung = MobilePhone("Android", "Samsung", "Galaxy 20 Ultra")
    var apple = MobilePhone("IOS", "Apple", "13 Pro Max")
    var poco = MobilePhone("Android", "Poco", "X3 Pro")
}

class Person(firstName: String = "DefaultName", lastName: String = "DefaultSurname") {
    init {
        println(
            "Person class initialized, firstname is $firstName and" +
                    " lastname is $lastName"
        )
    }
}

/*-------------------------------------------------------------------------------------*/

class MobilePhone(osName: String, brand: String, model: String) {
    init {
        println("$brand $model ($osName)")
    }
}