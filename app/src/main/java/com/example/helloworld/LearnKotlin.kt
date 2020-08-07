package com.example.helloworld

/**
 * 学习Kotlin
 * @author wangshy
 * @date 2020/08/07
 */

fun main(){
    //val（value的简写）用来声明一个不可变的变量,对应Java里的final变量
    //Kotlin有类型推导机制，但是如果对一个变量延迟赋值，Kotlin就无法自动推导它的类型
    val a=10
    println("a="+a)
}