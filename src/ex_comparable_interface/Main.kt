package ex_comparable_interface

/*
타입 매개변수 T를 받으며, 연산자 멤버 함수로 compareTo를 가지고 있어
Comparable 인터페이스를 구현하는 클래스를 비교 연산자를 지원함.
 */

class Rectangle(val width: Int, val height: Int): Comparable<Rectangle>{
    val area = width * height

    override fun compareTo(other: Rectangle): Int =
            when{
                this.area > other.area-> 1
                this.area < other.area-> -1
                else-> 0
            }
}

fun main(args: Array<String>){
    val rect = Rectangle(3, 5)
    val rect2 = Rectangle(7, 3)
    val rect3 = Rectangle(2, 9)

    println(rect >= rect3)
    println(rect < rect2)
    println(rect2 > rect3)

}

// operator fun <T:Comparable<T>> T.rangeTo(that: T): ClosedRange<T>