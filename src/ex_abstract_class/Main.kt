package ex_abstract_class

// 단순히 학생, 교수, 직원 클래스를 하나의 타입으로 묶어주는 클래스
abstract class Person{
    abstract fun getSalary(): Int
}

// 학생 클래스, tuition은 한 한기 등록금
class Student(private val tuition: Int): Person(){
    // 학생은 등록금을 납부하므로 salary를 음수 처리
    override fun getSalary() = -tuition
}

// 교수 클래스, classCount는 진행하는 수업의 수
class Professor(private val classCount: Int): Person(){
    override fun getSalary() = classCount * 200
}

class Employee(private val initial: Int, private val years: Int): Person(){
    override fun getSalary(): Int = initial * (1.0 + years / 10.0).toInt()
}

// 구성원으로부터 학교의 재정을 구한다.
fun getFinance(vararg persons: Person): Int{
    var i = 0
    var finance = 0
    while(i < persons.size){
        finance -= persons[i].getSalary()
        i += 1
    }
    return finance
}

fun main(args:Array<String>){
    val finance = getFinance(Student(330), Student(330), Professor(1), Professor(2), Employee(1300, 2))
    println("학교 재정:$finance 만원")
}

/*
// 추상 클래스는 추상 프로퍼티도 가질 수 있다. 추상 프로퍼티를 만드려면, 추상 멤버 함수처럼 프로퍼티 선언문 맨 앞에 abstract 키워트를 붙이면 된다.

// 추상 클래스를 상속하는 서브클래스에도 abstract를 붙이면 추상 멤버 함수를 반드시 오버라이딩하지 않아도 된다. 단, 이 클래스를 다시 일반 클래스로 상속할 때는
// 오버라이딩을 반드시 해야 한다.
 */