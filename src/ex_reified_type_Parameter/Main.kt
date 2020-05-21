package ex_reified_type_Parameter

/*
// 타입 매개변수는 대부분의 상황에서 일반 타입으로 쓸 수 있지만, 특정 상황에서는 그렇지 못함

// error
fun <T> check(){
    val number = 0
    if (number is T)
        println("T는 Int 타입 입니다.")
}

// 타입 매개변수는 is 연산자의 피연산자로 사용할 수 없다.
 */

// 타입매개 변수 앞에 reified를 붙여주면 해당 타입 매개변수를 in 연산자에 사용할 수 있고 여시거 함수를 inline으로 선언해야 한다.
inline fun <reified T> check(){
    val number = 0
    if (number is T)
        println("T는 Int 타입 입니다.")
}

fun main(args: Array<String>){
    check<Int>()
}