package ex_higher_order_function

// 고차 함수란, 인수로 함수를 받거나, 함수를 받환하는 함수를 뜻한다.
// 어떤 함수를 호출하기 전/후에 수행해야 할 고정적인 작업이 있다면 활용하자.

fun decorate(task: ()-> Unit){
    println("=== 작업 시작 ===")
    task()
    println("=== 작업 끝 ===")
}

fun main(args: Array<String>){
    decorate{
        val a = 10;
        val b = 5
        println("$a + $b = ${a + b}")
    }
    decorate{
        println("some")
        println("tasks")
    }
}