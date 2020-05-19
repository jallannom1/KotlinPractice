package ex_throw_exception

import java.lang.Exception

// 예외는 기본적으로 시스템에 의해 일어나지만,우리가 고의로 예외를 발생시킬수도 있다.
// 이를 '예외를 던진다'라고 표현.
fun main(args:Array<String>){
    try{
        something()
    }catch (e: Exception){
        println(e.message)
    }

}

fun something(){
    val num1 = 10
    val num2 = 0
    div(num1, num2)
}

// a를 b로 나눈 몫을 반환하는 함수
fun div(a: Int, b: Int): Int{
    if(b == 0)
        throw Exception("0으로 나눌 수 없습니다.")
    return a / b
}