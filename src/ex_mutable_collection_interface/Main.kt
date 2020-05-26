package ex_mutable_collection_interface

/*
// 코틀린의 컬렉션은 기본적으로 수정이 불가능하기 때문에 Thread-Safe한 코드를 만들 수 있음.

// MutableCollection
interface MutableCollection<E>: Collection<E>, MutableIterable<E>

// MutableIterable Interface
interface MutableIterable<out T>: Iterable<T>{
    override fun iterator(): MutableIterator<T>
}

// MutableIterable<E> 인터페이스의 멤버

abstract fun add(element: E): Boolean

abstract fun addAll(elements: Collection<E>): Boolean

abstract fun remove(element: E): Boolean

abstract fun removeAll(elements: Collection<E>): Boolean

abstract fun retainAll(elements: Collection<E>): Boolean

abstract fun clear()
 */

fun main(args: Array<String>){
    val mutableList: MutableCollection<Int> = mutableListOf(1, 2, 4, 2, 3, 2, 5)
    println(mutableList)

    mutableList.add(1)
    println(mutableList)

    mutableList.addAll(listOf(3, 2, 4))
    println(mutableList)

    mutableList.remove(1)
    println(mutableList)

    mutableList.removeAll(listOf(1, 2))
    println(mutableList)

    mutableList.retainAll(listOf(3, 5))
    println(mutableList)

    mutableList.clear()
    println(mutableList)
}