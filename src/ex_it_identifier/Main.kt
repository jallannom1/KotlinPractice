package ex_it_identifier

// 람다식의 매개변수가 하나일 때는 매개변수 선언을 생략할 수 있다.

fun main(args: Array<String>){
    val instantFunc: (Int)-> Unit = {
        println("Hello $it")
    }

    instantFunc(33)
}