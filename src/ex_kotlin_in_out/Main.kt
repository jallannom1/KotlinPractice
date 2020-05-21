package ex_kotlin_in_out

/*
AAA<Int> 타입의 값을 AAA<Any> 타입으로 받을 수 있게 하는 방법
 */

class AAA<out T>

class BBB<in T>

fun main(args: Array<String>){
    val aaaSub = AAA<Int>()
    val aaaSuper : AAA<Any> = aaaSub

    val bbbSuper = BBB<Any>()
    val bbbSub: BBB<Int> = bbbSuper

    val star: AAA<*> = aaaSub
}

// out T는 자바의 ? extends T와 같다.
// in T는 자바의 ? super T와 같다.