package com.example.helloworld

import java.lang.Math.max

/**
 * 学习Kotlin
 * @author wangshy
 * @date 2020/08/07
 */

fun main() {
    val a = 37
    val b = 40
    val value = largerNumber(a, b)
    println("larger number is " + value)
}

//fun largerNumber(num1: Int, num2: Int): Int {
//    return max(num1, num2)
//}
//fun largerNumber(num1: Int, num2: Int): Int = max(num1, num2)
fun largerNumber(num1: Int, num2: Int) = max(num1, num2)