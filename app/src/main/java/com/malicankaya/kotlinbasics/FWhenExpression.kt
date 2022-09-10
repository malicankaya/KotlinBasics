package com.malicankaya.kotlinbasics

fun main() {

    val season = 5
    when (season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Wrong season")
    }

/*----------------------------------------------------------------*/
    val age = 19
    when (age) {
        in 21..Int.MAX_VALUE -> println("You may drink in the US")
        in 18..20 -> println("You may vote in the US, your age is $age")
        16, 17 -> println("You may drive, your age is $age")
        in 15 downTo 0 -> println("You are too young because you are only $age")
        else -> println("Wrong age")
    }
/*----------------------------------------------------------------*/
    val x = 15
    when (x) {
        //we can use in and is keyword with exclamation mark
        !in 10..14 -> println("x is not between 10 and 14")
    }
/*----------------------------------------------------------------*/
    val value: Any = 3.14
    when (value) {
        is Int -> println("$value is INT")
        //we can use in and is keyword with exclamation mark
        !is Int -> println("$value is not INT")
        is Double -> println("$value is Double")
        is Float -> println("$value is FLOAT")
        else -> println("$value is none of the above")
    }
}