package ex_upcasting

open class Person(val name: String, val age: Int)

class Student(name: String, age: Int, val id: Int): Person(name, age)

fun main(args: Array<String>){
/* error
    // Peson 참조 변수는 Student의 인스턴스를 가리키고 있기는 하지만,
       타입이 Person이기 때문에 name과 age 프로퍼티 밖에 접근하지 못함.

       var person: Person = Student("John", 23, 12345678)


    // Person 타입으로 카리킨 Student의 인스턴스를 다시 원래 타입으로
       가리킬 수 없다.

       val person: Person = Student("John", 32, 12345678)
       val student: Student = person
*/
}