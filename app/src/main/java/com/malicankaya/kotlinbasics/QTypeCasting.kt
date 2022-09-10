package com.malicankaya.kotlinbasics

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.O)
fun main() {
    var stringList: List<String> = listOf("Mali", "Isparta", "Osman", "Trademark")

    var mixedTypeList: List<Any> = listOf("Hakkı", 120, true, "Bal", 10.0)

    for (value in mixedTypeList) {
        if (value is Int) {
            println("I am an Integer and my value is $value")
        } else if (value is String) {
            println("I am a String and my value is $value")
        } else if (value is Boolean) {
            println("I am a Bollean and my value is $value")
        } else if (value is Double) {
            println("I am a ${value::class.java.typeName} and my value is $value")
        } else {
            println("Unknown type")
        }
    }
    println("----------------")
    for (value in mixedTypeList) {
        when (value) {
            is Int -> println("I am an Integer and my value is $value")
            is String -> println("I am a String and my value is $value")
            is Boolean -> println("I am a Bollean and my value is $value")
            is Double -> println("I am a ${value::class.java.typeName} and my value is $value")
            else -> println("Unknown type")
        }
    }
    println("--------------------------")
    //SMART CAST
    val obj1: Any = "I have a dream."
    if (obj1 !is String) {
        println("I am not a String")
    } else {
        println("I am String of length ${obj1.length}")
    }

    //Explicit(UNSAFE) casting using the "as" keyword
    val str1: String = obj1 as String
    println("Unsafe casting string length is ${str1.length}")

/*
    val obj2: Any = 1337
    val str2: String = obj2 as String
    //will get error
    println("str2 is $str2")
*/

    //Explicit(SAFE) casting using the "as?" keyword
    val obj3: Any = 1337
    val str3: String? = obj3 as? String //will work
    println(str3) //prints null

}