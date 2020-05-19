package ex_nothing_type

import java.lang.Exception

fun throwing(): Nothing = throw Exception()

fun main(args:Array<String>) {
    println("start")
    val i: Int = throwing()
    println(i)
}