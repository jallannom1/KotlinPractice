package ex_the_diamond_problem

interface Parent {fun follow(): Unit}

interface Mother: Parent{
    override fun follow() = println("follow his mother")
}

interface Father: Parent{
    override fun follow() = println("follow his father")
}

class Child: Mother, Father{ // 두 인터페이스 상속
    override fun follow(){
        println("A Child decided to")
        super<Mother>.follow() // <>로 호출할 super 멤버 함수를 지정
    }
}

fun main(args:Array<String>){
    Child().follow()
}