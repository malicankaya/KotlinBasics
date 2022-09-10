package com.malicankaya.kotlinbasics

fun main() {


    var myString: String = "Android Masterclass"
    var myFloat: Float = 3.17f
    //val is immutable
    val myDouble: Double = 3.14156456342
    var myByte: Byte = 25
    var myShort: Short = 2020
    var myLong: Long = 18881234567
    var myBool: Boolean = true
    var myChar: Char = 'a'


    var mySecondString = "Findfirstandlastcharacher"

    var firstChar = mySecondString[0]
    var lastChar = mySecondString[mySecondString.length - 1]
    var middleLocation: Int = (mySecondString.length / 2);
    var middleChar = mySecondString[middleLocation]

    println("mySecondString's first letter is $firstChar")
    println("mySecondString's last letter is $lastChar")
    println("mySecondString's middle letter is $middleChar and middle index is $middleLocation")
    println("mySecondString's length is ${mySecondString.length}")
}