package ex_lambda_expression

/*
(Int)-> Unit은 매개변수가 Int 타입이고 반환 타입이 Unit인 함수를 저장할 수 있는 타입이다.
이를 함수타입(Function Type)이라고 한다.
 */

fun main(args: Array<String>){
    val instantFunc: (Int)-> Unit
    instantFunc = {number: Int-> // 함수 리터럴의 매개변수를 나타냄. ->를 경계로, 매개변수와 함수내용이 분리됨.
        println("Hello $number") // 만약 매개변수 없는 함수 만들고 있다면 'number: Int->' 없애면 됨.
    }
    /*
    10-11 부분이 함수 리터럴(Function Literal)이다. 말 그대로 함수를 나타내는 리터럴이라는 뜻

    함수 리터럴에는 return을 적지 않는다. 함수 리터럴의 반환 값은 함수 내용의 마지막 표현식이 됨
    */
    instantFunc(33)
    instantFunc.invoke(33)
    // 함수타입의 변수는 invoke 멤버 함수를 통해서도 호출할 수 있다.
    // 일반적으로()로 바로 호출하면 되지만, 변수가 Nullable일 때는 invoke를 통해서 호출하는 편이
    // instantFunc?.invoke(33)과 같이 쓸 수 있으므로 Null 처리를 하기 편해진다.
}