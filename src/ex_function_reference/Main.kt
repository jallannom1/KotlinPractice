package ex_function_reference

// 함수 타입의 변수는 이미 선언되어 있는 함수나 객체의 멤버 함수를 가리킬 수도 있다.

fun plus(a: Int, b: Int) = println("plus 호출됨${a + b}")

object Object{
    fun minus(a: Int, b: Int) = println("Object의 minus 호출됨${a - b}")
}

class Class{
    fun average(a: Int, b: Int) = println("Class average 호출됨${(a + b )/ 2}")
}

fun main(args: Array<String>){
    var instantFunc: (Int, Int)-> Unit
    instantFunc = ::plus
    instantFunc(60, 27)

    instantFunc = Object::minus
    instantFunc(36, 12)

    instantFunc = Class()::average
    instantFunc(25, 15)
}