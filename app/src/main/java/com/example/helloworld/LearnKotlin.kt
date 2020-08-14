package com.example.helloworld

/**
 * 学习Kotlin
 * @author wangshy
 * @date 2020/08/07
 */

fun main() {
//    val a = 37
//    val b = 40
//    val value = largerNumber(a, b)
//    println("larger number is " + value)

    //println(getScore("Jim"));

//    val num = 10
//    checkNumber(num)

    val num = 10L
    checkNumber(num)

}

//fun largerNumber(num1: Int, num2: Int): Int {
//    var value = 0
//    if (num1 > num2) {
//        value = num1
//    } else {
//        value = num2
//    }
//    return value
//}

//Kotlin中的if语句相比于Java有一个额外的功能，它是可以有返回值的，返回值就是if语句每一个条件中最后一行代码的返回值。
//fun largerNumber(num1: Int, num2: Int): Int {
//    val value = if (num1 > num2) {
//        num1
//    } else {
//        num2
//    }
//    return value
//}

//value是一个多余的变量，可以直接将if语句返回
//fun largerNumber(num1: Int, num2: Int): Int {
//    return if (num1 > num2) {
//        num1
//    } else {
//        num2
//    }
//}

//语法糖:当一个函数只有一行代码时，可以省略函数体部分，直接将这一行代码使用等号串连在函数定义的尾部。
//fun largerNumber(num1: Int, num2: Int) = if (num1 > num2) {
//    num1
//} else {
//    num2
//}

//fun largerNumber(num1: Int, num2: Int) = if (num1 > num2) num1 else num2

//fun getScore(name: String) = if (name == "Tom") {
//    86
//} else if (name == "Jim") {
//    77
//} else if (name == "Jack") {
//    95
//} else if (name == "Lily") {
//    100
//} else {
//    0
//}

fun getScore(name: String) = when (name) {
    "Tom" -> 86
    "Jim" -> 77
    "Jack" -> 95
    "Lily" -> 100
    else -> 0
}

fun getScore1(name: String) = when {
    //不管你传入的名字是Tom还是Tommy，只要是以Tom开头的名字，他的分数就是86分
    name.startsWith("Tom") -> 86
    name == "Jim" -> 77
    name == "Jack" -> 95
    name == "Lily" -> 100
    else -> 0
}


fun checkNumber(num: Number) {
    when (num) {
        is Int -> println("Int")
        is Double -> println("Double")
        else -> println("number not support")
    }
}

