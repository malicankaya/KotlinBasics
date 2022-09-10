package com.malicankaya.kotlinbasics

// Article on Kotlin words
// https://blog.kotlin-academy.com/kotlin-programmer-dictionary-function-vs-method-vs-procedure-c0216642ee87


fun main() {
    myFunction()
    myFunction()

    println("${addUp(5, 3)}")

    //arguments
    var added = addUp(5, 7)
    println("$added")

    var average = avg(5.0, 15.0)
    println("average is $average")
}

fun myFunction() {
    println("Called in myFunction.")
}

//parameters
fun addUp(a: Int, b: Int): Int {
    return a + b
}

fun avg(a: Double, b: Double): Double {
    return (a + b) / 2
}