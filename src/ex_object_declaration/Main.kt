package ex_object_declaration

/*
object 키워드 덕에 자바에서 작성해야만 했던 싱글톤 패턴 코드를 더이상 쓰지 않아도 됨.
그저 일반 클래스를 선언하듯이, 프로그램 전체에서 단 하나만 존재하는 객체를 편하게 만들수 있음.
*/

object Person{
    var name: String = ""
    var age: Int = 0
    fun print(){
        println(name)
        println(age)
    }
}

fun main(args:Array<String>){
    // 식별자 Person으로 객체에 바로 접근 가능
    Person.name = "Singleton"
    Person.age = 45
    Person.print()
}