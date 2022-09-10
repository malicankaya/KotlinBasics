package com.malicankaya.kotlinbasics

var accessAllinFile = 15;

fun main() {

    var accessInOnlyMain = 5
}

fun myTestFunction(a: Int) {
    //a = 5 is not work because it is a parameter
    //once you have assigned a = a, you cannot access a which is a parameter
    //this is called shadowing
    var a = a;
}