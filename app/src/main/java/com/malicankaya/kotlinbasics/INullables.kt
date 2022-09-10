package com.malicankaya.kotlinbasics

fun main() {

    var name: String = "Mali"
    //name = null -> Compile time error
    var nullableName: String? = "Mali"
    var nullableName2: String? = null
    nullableName = null
    println("$nullableName - $nullableName2")

    //if we type without question mark, we got error
    println("${nullableName?.length}")

    /*
    it means above
    if(nullableName != null){
        var len =  nullableName.length
    }else {
        null
    }
    */

    //if it is not null, then run inside
    nullableName?.let { println(nullableName.length) }

    /*----------------ELVIS OPERATOR(?:) & NULL ASSERTION(!!)--------------------------------*/

    //if nullableName is null, then use Savdır
    var wifeName = nullableName ?: "Savdır"
    println("$wifeName")

    //this means force it even if it is null.
    // so we will get nullpointer exception because of null.
    val nullableName3: String? = null
    println("${nullableName3!!.lowercase()}")
}