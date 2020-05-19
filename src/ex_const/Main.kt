package ex_const

// inline 함수와 비슷하게, val 변수 앞에 const 키워드를 붙이면
// 변수에 접근하는 코드를 변수에 저장된 값으로 대체시킨다.

const val hello = "Hello" + "World!"

object Foo {
    const val bar = "bar"
}

fun main(args:Array<String>){
    println(hello)
    println(Foo.bar)
    println(hello)
    println(Foo.bar)
}

/*
const 키워드는 코틀린 문법 중에 리터럴만 와야 하는 자리가 몇 군데 있다.
const 키워드가 붙은 변수는 리터럴로 대체되므로, 이런 곳에 사용하면 좋다.
 */