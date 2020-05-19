package ex_null

import ex_upcasting.Person


// 타입 뒤에?를 붙이면 변수를 Nullable하게 만들 수 있다.
// Nullable이란, null 값을 지정할 수 있는 변수를 뜻함.
fun main(args:Array<String>){
    var person:Person? = Person("K", 30)
    person = null
    var num: Int? = null
    num = 10
}