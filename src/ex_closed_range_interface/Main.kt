package ex_closed_range_interface

/*
// ClosedRanage 인터페이스

ClosedRange는 타입 매개변수로 Comparable<T>를 구현하는 타입만 받는다.
대소 비교가 가능해야 범위를 형성할 수 있기 때문
 */

fun main(args: Array<String>){
    val intRange: IntRange = 1..10
    val longRange: LongRange = 1L..100L
    val charRange: CharRange = 'A'..'Z'

    println(intRange.start) // start 프로퍼티는 구간의 최소값
    println(longRange.endInclusive) // endInclusive 프로퍼티는 구간의 최대값
    println('*' in charRange)
    println(charRange.isEmpty()) // 객체가 비었는지 여부 반환
}