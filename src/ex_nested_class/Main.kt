package ex_nested_class

// 클래스 안에 또다른 클래스 선언

class Outer // 바깥 클래스
{
    class Nested // 중첩 클래스
    {
        fun hello() = println("중첩된 클래스")
    }
}

fun main(args:Array<String>){
    val instance: Outer.Nested = Outer.Nested()
    instance.hello()
}

/*
Nested class는 Nested라는 식별자만 Outer 클래스에 속해있을 뿐, 실제로는 완전히 분리된 장소에 있다.
따라서 Nested 클래스의 멤버 함수는 Outer 클래스의 프로퍼티나 멤버 함수에 접근할 수 없다.
 */