package com.malicankaya.kotlinbasics

fun main() {

    /*----------------------------WHILE LOOP-------------------------------*/
    var x = 100
    while (x >= 0) {
        print("$x")
        x -= 2
    }
    println("\nwhile loop was ended\n")

    /*------------------------DO WHILE LOOP------------------------------*/

    var a = 15
    do {
        print("$a")
        a++
    } while (a <= 5)
    println("\ndo while loop was ended\n")

    /*-----------------------DO WHILE LOOP------------------------------*/

    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold") {
        roomTemp++
        print("$roomTemp°C ")
        if (roomTemp >= 20) {
            feltTemp = "comfy"
            println("\nas $roomTemp°C the feltTemp is comfy now\n")
        }
    }

    /*-----------------FOR LOOP----------------------------------------*/

    for (num in 1..10) {
        print("$num")
    }
    println()
    for (i in 1 until 10) {
        print("$i")
    }
    println()
    for (i in 10 downTo 1 step 2) { //same as for(i in 10.downTo(1).step(2))
        print("$i")
    }

    /*--------------Exercise Loops-----------------------------*/

    for (i in 1..10000) {
        if (i == 9001)
            println("\nIT'S OVER 9000!!!")
    }

    var humidityLevel = 80
    var humidity = "humid"

    while (humidity == "humid") {
        humidityLevel -= 5
        println("humidity decreased to $humidityLevel")
        if (humidityLevel < 60) {
            println("it's comfy now")
            humidity = "comfy"
        }
    }
    /*------------------------------------------------------------------*/

    for (i in 1 until 20) {
        print("$i ")
        if (i / 2 == 5) {
            break
        }
    }
    println("\nbreak for loop ended, 10 to 20 are missing")

    for (i in 1 until 20) {
        if (i / 2 == 5)
            continue
        print("$i ")
    }
    println("\ncontinue for loop ended 10 and 11 is missing")
}