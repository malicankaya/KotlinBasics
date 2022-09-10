package com.malicankaya.kotlinbasics

class Base {
    private val a = 5

    class NestedClass {
        var description = "code inside nested class"
        private var id = 101
        fun foo() {
            //println("a is $a") // cannot access outer class member
            println("id is ${id}")
        }
    }
}

fun main() {
    println(Base.NestedClass().description)

    var obj = Base.NestedClass();
    println(obj.foo())
}