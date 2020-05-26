package ex_list_interface

/*
// List 인터페이스
interface List<out E>: Collection<E>

// List 인터페이스의 추상 멤버 함수
abstract operator fun get(index: Inx): E

abstract fun indexOf(element: E): Int

abstract fun lastIndexOf(element: E): Int

abstract fun listIterator(): ListIterator<E>

abstract fun listIterator(index: Int): ListIterator<E>

 */

fun main(args: Array<String>){
    val list: List<Double> = listOf(20.18, 1.14, 9.15, 1.14)

    println(list[0])
    println(list.indexOf(1.14))
    println(list.indexOf(9.31))
    println(list.lastIndexOf(1.14))
    println(list.subList(0,3))
}