package ex_range

// ..연산자는 범위를 표현하는 연산자

fun main(args: Array<String>){
    val oneToTen: IntRange = 1..10
    println(5 in oneToTen)

    val upperAtoZ: CharRange = 'A'..'Z'
    if('C' in upperAtoZ)
        println("대문자입니다.")

    if('p' in 'a'..'z')
        println("소문자입니다.")
}

/*
// ..연산자는 operator fun rangeTo(매개변수: 자유 타입): 자유 타입으로 오버로딩 할 수 있다.
 */