//전역변수 와 지역변수
var count = 0
var b = 5

fun main(args:Array<String>){
    val a = 15
    println(a)

    count += 1
    printCount()
    println(count)

    // 지역 변수와 전역 변수의 이름이 중복될 때
    val b = 30
    println(b)
    func()
}

fun printCount(){
    println(count)
    count += 1
}

fun func(){
    println(b)
}