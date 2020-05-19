package ex_constructor

class Person constructor(name:String, age:Int){
    val name:String
    val age:Int

    init{
        this.name = name
        this.age = age
    }
}

fun main(args:Array<String>){
    val person = Person("홍", 46)
    println("이름: ${person.name}")
    println("나이: ${person.age}")
}


/*
  //생성자는 다음처럼 정의한다. 여기서 constructor 키워드는 생략해도 됨.
    class 클래스 이름 constructor(생성자의 매개변수 선언){...}

  //생성자도 함수의 일종이므로 디폴트 인수와 가변 인수를 사용할수 있다.
*/