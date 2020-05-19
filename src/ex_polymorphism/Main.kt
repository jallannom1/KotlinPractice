package ex_polymorphism

open class AAA{
    open fun hello() = println("AAA 입니다")
}

class BBB : AAA(){
    override fun hello() = println("BBB 입니다")
}

fun main(args:Array<String>){
    val one = AAA()
    val two = BBB()
    val three: AAA = two

    one.hello() // AAA 입니다
    two.hello() // BBB 입니다
    three.hello() // BBB 입니다
}