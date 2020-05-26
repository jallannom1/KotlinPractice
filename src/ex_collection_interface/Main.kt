package ex_collection_interface

/*
// interface Collection<out E>: Iterable<E>

Iterable<E>는 fun iterator(): Iterator<E> 멤버 함수를 컬렉션에 주입하기 위한 인터페이스

Collection 인터페이스는 한 개의 추상 프로퍼티와, 네 개의 추상 멤버함수를 갖고 있음.

abstract val size: Int

abstract fun isEmpty(): Boolean

abstract operator fun contains(element: E): Boolean

abstract fun containsAll(elements: Collection<E>): Boolean

abstract fun iterator(): Iterator<E>
*/

fun main(args: Array<String>){
    val list: Collection<Int> = listOf(18,1,1, 4)

    println(list.size)
    println(list.isEmpty())
    println(18 in list)

    for(i: Int in list) print("$i ")
}