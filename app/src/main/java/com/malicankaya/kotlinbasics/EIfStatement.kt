package com.malicankaya.kotlinbasics

fun main() {

    val age = 18

    if (age >= 21) {
        println("You may drink in the US, current age is $age")
    } else if (age >= 18) {
        println("You may vote in the TURKEY cause your current age is $age")
    } else if (age >= 16) {
        println("You may drive in the US, your age is $age")
    } else {
        println("You are too young all of the world because you are only $age")
    }

    val name = "Malis"
    if (name == "Mali")
        println("Welcome home $name")
    else
        println("Who t f are you")

    val isRainy = true
    if (isRainy)
        print("The weather is rainy")
}