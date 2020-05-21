package ex_iterator

/*
Iterator란, 특정 구간 속에 원소를 하나씩 반복적으로 꺼내기 위한 인터페이스를 뜻함.
코틀린에서는 Iterator라는 인터페이스가 기본적으로 선언되어 있음
 */

fun main(args: Array<String>){
    val range: IntRange = 1..3
    val iter: Iterator<Int> = range.iterator()

    println(iter.hasNext())
    println(iter.next())

    println(iter.hasNext())
    println(iter.next())

    println(iter.hasNext())
    println(iter.next())

    println(iter.hasNext()) // false

}