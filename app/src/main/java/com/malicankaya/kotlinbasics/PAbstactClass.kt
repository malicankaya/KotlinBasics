package com.malicankaya.kotlinbasics

//the members of an abstract class are non-abstract
//unless you explicitly use the abstract keyword to amke them abstract
//you CANNOT CREATE an instance of an abstract class
//abstract class can have constructors
abstract class Mammal(
    private val name: String,
    private val origin: String,
    private val weight: Double
) {
    //Abstract property must be overriden by subclasses
    abstract val maxSpeed: Double

    //abstract methods must be implemented by subclasses
    abstract fun run()
    abstract fun breath()

    //concrete (non abstract) method
    fun displayDetails() {
        println("Name: $name, Origin: $origin, Weight: $weight, MaxSpeed: $maxSpeed")
    }
}

//you can only implement one abstract class for one class
//but you can implement multiple interfaces
class Human(
    private var name: String,
    private var origin: String,
    private var weight: Double,
    override val maxSpeed: Double
) : Mammal(name, origin, weight) {

    override fun run() {
        println("Human $name is running as $weight kg")
    }

    override fun breath() {
        println("Human $name is breathing in $origin")
    }
}

//you can only implement one abstract class for one class
//but you can implement multiple interfaces
class Elephant(
    private var name: String, private var origin: String, private var weight: Double,
    override val maxSpeed: Double
) : Mammal(name, origin, weight) {

    override fun run() {
        println("Elephant $name is running as $weight kg")
    }

    override fun breath() {
        println("Elephant $name is breathing in $origin")
    }
}

fun main() {
    var human = Human("Mali", "Turkey", 120.0, 23.0)
    var elephant = Elephant("Doris", "India", 6600.0, 35.0)

    human.run()
    human.breath()
    human.displayDetails()
    println()
    elephant.run()
    elephant.breath()
    elephant.displayDetails()
}