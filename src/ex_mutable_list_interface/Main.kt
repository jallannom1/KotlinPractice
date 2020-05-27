package ex_mutable_list_interface

/*
// mutableListOf 함수를 호출하면 MutableList<E> 타입의 객체가 반환된다.
// MutableList<E> 인터페이스는 MutableCollection<E>를 상속함.

// MutableList<E> 멤버

abstract fun add(index: Int, element: E): Unit
abstract fun addAll(index: Int, elements: Collection<E>): Boolean
abstract operator fun set(index: Int, element:E): E
abstract fun removeAt(index: Int): E
 */

fun main(args: Array<String>){
    val list: MutableList<Char> = mutableListOf('c', 'a', 'z')
    println(list)

    list.add(1, '%')
    println(list)

    list.addAll(0, listOf('L', 'P'))
    println(list)

    println(list.set(2, '/'))
    println(list)

    println(list.removeAt(4))
    println(list)
}