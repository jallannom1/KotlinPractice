package ex_property_getter_setter

fun main(args:Array<String>){
    val person = Person()
    person.age = -30
    println(person.age)
}

/*
// Getter와 Setter 별도 정의하지 않을경우

class Person{
    var age:Int = 0
    get(){
        return field
    }
    set(value){
        field = value
    }
}

// Getter/Setter 정의

// case_1 : 디폴트 Getter/Setter 정의

var age = 0
    get
    set


// Getter 속 문장이 하나일 때 축약 가능
var name = ""
    get() ="이름: $filed"


// val 프로퍼티이고, Getter의 반환 값이 field가 아닐 때
   프로퍼티 타입 생략 가능 : Getter의 반환 타입으로 프로퍼티의
   타임을 추론할 수 있기 때문

class Person{
    var age = 0
    val isYoung get() = age < 30
}
*/