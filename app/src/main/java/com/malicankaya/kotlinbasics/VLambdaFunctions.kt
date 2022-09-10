package com.malicankaya.kotlinbasics

fun main() {
    //structure is
    var sum: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    //or we can declare like this
    var sum2 = { a: Int, b: Int -> a + b }

    println("sum is ${sum(5, 10)} and sum2 is ${sum2(10, 20)}")

    //this is (Int,Int) -> Unit
    var sumPrint = { a: Int, b: Int -> println(a + b) }
    sumPrint(6,7)
}