package ex_mutable_iterator_interface

/*
// MutableIterator Interface

public interface MutableIterator<out T>: Iterator<T>{
    public fun remove(): Unit
}
 */

fun main(args: Array<String>){
    val list = mutableListOf(1, 2, 3)
    val iter: MutableIterator<Int> = list.iterator() // MutableList<Int> 타입의 list 변수로부터 MutableIterator<Int>를 얻어냄

    println(list)

    iter.next(); iter.remove() // 반복자 커서 이동 후 원소 삭제
    println(list)

    iter.next(); iter.remove()
    println(list)
}