package ex_inline_function

// inline 함수를 사용하면, 실행 흐름을 점프하지 않고 함수 호출문을 함수의 몸체로 대체하기 때문에
// 성능을 조금이나마 개선 가능

inline fun hello(){
    println("Hello")
    println("Kotlin")
}

fun main(args:Array<String>){
    hello()
    hello()
    hello()
}
//