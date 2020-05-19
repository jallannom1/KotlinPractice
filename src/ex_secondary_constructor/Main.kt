package ex_secondary_constructor

class Time(val second: Int){
    init{
        println("running init block")
    }

    // 보조 생성자 1
    constructor(minute: Int, second: Int): this(minute * 60 + second){
        println("보조 생성자 1 실행중")
    }

    // 보조 생성자 2
    constructor(hour: Int, minute: Int, second: Int): this(hour * 60 + minute, second)
    init {
        println("보조 생성자 2 실행중")
    }
}

fun main(args: Array<String>){
    println("${Time(15,6).second} 초")
    println("${Time(6, 3, 16).second} 초")
}