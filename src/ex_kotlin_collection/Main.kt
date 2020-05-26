package ex_kotlin_collection

/*
// 컬렉션 === 프로그램을 개발하는데 필요한 기본적인 자료구조 통칭하는 말

name    |   mean
------------------------------------------------------------------------------------------------------
List    |   순서가 있는 목록을 표현하는 자료구조. 'Dynamic Array' 나 'Linked List' 가 여기 포함
Set     |   집합을 표현하는 자료구조. 원소 중복 x, 순서 x
Map     |   'Associative Array' 를 표현하는 자료구조. key : value, 중복 x
------------------------------------------------------------------------------------------------------

// List<E> 와 Set<E> 은 Collection<E> 상속, Map<k, V> 는 독자적
 */

fun main(args: Array<String>){
    val list: Collection<Int> = listOf(10, 20, 10) // fun <T> listOf(vararg elements: T): List <T>
    val set: Collection<Int> = setOf(1, 2, 3, 2, 3) // fun <T> setOf(vararg elements: T): Set <T>
    val map: Map<String, String> = mapOf("Apple" to "사과", "Banana" to "바나나") // fun <K, V> mapOf(vararg pairs: Pair<K, V>): Map<K, V>

    println(list)
    println(set)
    println(map)
}