package ex_mutable_list_iterator_interface

/*
// MutableListIterator<T>인터페이느는 ListIterator<T>와 MutableIterator<T>
// 인터페이스를 구현한다.

// MutableListIterator<T> 추가 멤버

adstract fun set(element:T): Unit

abstract fun add(element: T): Unit
 */

fun main(args: Array<String>){
    val list = mutableListOf(1,2,3)
    val iter: MutableListIterator<Int> = list.listIterator()

    println(list)

    iter.next()
    iter.next()
    iter.add(7)
    println(list)

    iter.next()
    iter.set(10)
    println(list)

}