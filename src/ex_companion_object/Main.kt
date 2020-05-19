package ex_companion_object

// 동반자 객체는 클래스 안에 포함되는 이름 없는 객체임
// 어떤 클래스의 모든 인스턴스가 공유하는 객체를 만들고 싶을 때 사용

class Person private constructor(){ // create 멤버 함수를 통해서만 Person 객체 생성할 수 있도록 private 지정
    companion object{
        fun create(): Person{
            countCreated += 1
            return Person()
        }

        var countCreated = 0
            private set
    }
}

fun main(args:Array<String>){
    val a = Person.create()
    val b = Person.create()
    println(Person.countCreated)
    println(a)
    println(b)
}

/*
// 동반자 객체에 접근하는 또 다른 방법
Person.create() 는 Person.Companion.create() 로도 호출 가능

// java의 static을 대체함
*/
