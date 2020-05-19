package ex_interface

// 인터페이스는 클래스에 어떤 멤버 함수와 프로퍼티가 반드시 존재한다는 것을 보장하기 위한 장치

interface Printable{
    fun print(): Unit
}

class AAA: Printable {
    override fun print(){
        println("Hello")
    }
}

fun print(anything: Printable){
    anything.print()
}

fun main(args:Array<String>){
    print(AAA())
}

/*
인터페이스는 어디에 쓰는 것이 좋을까? 일단 인터페이스는 기존의 클래스를 확장한다는 것보다는, 어떤 클래스에 플러그인을 추가한다는 개념에 가깝다.
예로 AAA 클래스가 Printable 인터페이스를 구현한다는 것은, AAA에 출력 기능을 갖는 Printable 플러그인을 탑재시키는 것이라고 보면 된다.
 */