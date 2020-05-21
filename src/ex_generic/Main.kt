package ex_generic

// 제네릭이라는 문법을 이용하면, 인수를 전달하듯이 함수에 타입을 전달할 수 있다.

fun <T> toFunction(value: T): ()-> T = { value }

fun main(args: Array<String>){
    val func: ()-> Int = toFunction<Int>(1107)
    println(func())
}