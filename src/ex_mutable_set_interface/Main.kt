package ex_mutable_set_interface

/*
// mutableSetOf 함수를 호출하면 MutableSet<E> 타입의 객체가 반환됨.
// MutableSet<E> 인터페이스는 MutableCollection<E>를 상속함.
 */

fun main(args: Array<String>){
    val set: MutableSet<Int> = mutableSetOf(1, 5, 7)
    println(set)

    println(set.add(5))
    println(set)

    println(set.addAll(listOf(3, 7)))
    println(set)
}