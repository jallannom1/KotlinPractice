fun main(args:Array<String>){
    println(myFunction())
    println(myFunction() + 10)
    println(testfunction())
    println(test2function())
    println(test3function())
}

fun myFunction():Int{
    val a = 3
    val b = 6
    println("a: $a + b: $b")
    return a + b
}

//함수 간단히 쓰기
fun testfunction():Double{
    return 3.0 + 7
}

//문장이 하나뿐인 블록은 = 를 이용하여 줄여쓸 수 있다.
//단 return은 반드시 생략해야 하며 = 오른쪽은 함수의 반환 타입과 일치하는 표현식이 와야 한다.
fun test2function():Double = 3.0 + 7

//여기서 더 나아가, 아예 함수의 반환 타입까지 생략할 수 있다.
fun test3function() = 3.0 + 7