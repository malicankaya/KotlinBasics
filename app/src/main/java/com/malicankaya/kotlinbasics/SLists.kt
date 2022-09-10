package com.malicankaya.kotlinbasics

fun main(){

    var months = listOf("Jan","Feb","Mar","Apr","May")
    var anyTypes = listOf("Dade",1,true,2.5,'c')
    println("anyTypes size ${anyTypes.size}")
    println("second element of months is ${months[1]}")
    println("immutable list $months")
    //we cannot add item of List<>, it has to be MutableList<>
    var months2 = months.toMutableList()
    months2.add("June")
    println("mutableList $months2")
    //and you can also add list
    months2.addAll(months)
    println("mutable list added twice $months2")

    //assign a mutable list
    var mutableList = mutableListOf("Mon","Tue", "Wed", "Thu")
    mutableList.add("Fri")
    println("assigned mutableList $mutableList")
    //lets remove

    mutableList.remove("Mon")
    println("Removed \"Mon\" $mutableList")
    var days = listOf("Mon","Wed","Fri")
    mutableList.removeAll(days)
    println("Removed $days -> $mutableList")
    mutableList.clear()
    println("clear all of member $mutableList")

}