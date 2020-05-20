package ex_closure

// 지역 변수는 항상 자신이 소속된 블록이 끝나면 소멸한다.
// 그러나, 클로저를 이용하여 지역 변수가 소멸하지 않는 것처럼 보이도록 할 수 있다.

fun returnFunc(num: Int): ()-> Unit = { println(num)}
fun main(args: Array<String>){
    val f: ()-> Unit = returnFunc(30)
    f()
}

/*
returnFunc 함수가 끝나는 순간 num 매개변수가 소멸하지만,
함수 리터럴이 만들어지는 순간,함수 리터럴은 자기 주변의 상황을 함께 저장한다.
즉, 함수가 만들어질 때 num 매개변수의 값을 복사해 갖고 있는다.
이렇게 함수가 만들어질 때 주변 상황을 기억하는 함수를 클로저라고 한다.
 */