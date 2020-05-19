package ex_elvis_operator

/*
엘비스 연산자(Elvis Operator)는 왼쪽의 피연산자가 null이 아니면
그 값을 그대로 쓰고, null이면 우측의피연산잘 대체하는 매우 유용한 연산자이다.
*/
fun main(args:Array<String>){
    val number: Int? = null
    println(number?: 0)

    val number2: Int? = 15
    println(number2?: 0)
}