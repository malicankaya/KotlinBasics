package com.malicankaya.kotlinbasics

fun main() {

    //those types are IntArray
    var intArray: IntArray = intArrayOf(1, 2, 3, 4, 5)
    var intArray2 = intArrayOf(5, 4, 3, 2, 1)
    //but type of this is Array<Int>, we should use above
    var intArray3 = arrayOf(1, 1, 1, 1, 1)

    for (value in intArray) {
        print("$value-")
    }
    intArray[0] = 555
    println("\n---------------------------------------")
    //indices is a nice property
    for (index in intArray.indices) {
        print("${intArray[index]}-")
    }
    println("\nContent to string ${intArray.contentToString()}")
    println("----------------------------------------")

    var animals = arrayOf(
        Animal("Sheep", 76.4, 45.0),
        Animal("Goat", 66.7, 51.6)
    )

    println("animals array content to string ${animals.contentToString()}")

    var mixArray = arrayOf(1, 2, 4.6, "Babba", Animal("Cow", 56.0, 565.8))

    println("mixArraycontent to string ${mixArray.contentToString()}")
}

data class Animal(val name: String, val pricePerKg: Double, val weight: Double)