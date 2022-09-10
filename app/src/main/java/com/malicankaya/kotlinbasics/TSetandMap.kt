package com.malicankaya.kotlinbasics

fun main(){
    var fruits = setOf("Apple","Mango","Ananas","Pear","Ananas")
    //size will be 4 because set doesnt allow duplicate item
    println("size of set fruits ${fruits.size}")

    var newFruits = fruits.toMutableList()
    newFruits.add("Watermelon")
    newFruits.add("Grapes")
    println("new mutable list of fruits ${newFruits.toSortedSet()}")

    //Maps
    var days = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    println("map of days $days")

    for(key in days.keys){
        print("key in $days $key --")
    }

    var fruitsMap = mutableMapOf("Favorite" to Fruit("Apple",1.5), "Normal" to Fruit("Grape",1.1))

    println("\nfruits map members ${fruitsMap.toSortedMap()}")
    //add member to a map
    fruitsMap["Best"] = Fruit("Watermelon",0.3)
    println("\nfruits map members version 2 ${fruitsMap.toSortedMap()}")
}

data class Fruit(val name: String, val price: Double)