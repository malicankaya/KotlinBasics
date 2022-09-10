package com.malicankaya.kotlinbasics

fun main(){
    val arrayList: ArrayList<Double> = ArrayList()
    var total = 0.0
    arrayList.add(5.5)
    arrayList.add(4.9)
    arrayList.add(88.7)
    arrayList.add(44.0)
    arrayList.add(57.32)

    for(value in arrayList){
        total+=value
    }
    println("avg is ${total/arrayList.size}")
}