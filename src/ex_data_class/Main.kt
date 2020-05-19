package ex_data_class

/*
클래스에는 크게 데이터 자체의 역할만 하는 클래스와, 데이터를 다루는 역할을 하는 클래스가 있다.
사원 데이터 자체만 속성으로 갖고 있는 Employee 클래스와, Employee의 인스턴스들을 관리하는 EmployeeManager 클래스 같은 식으로 말이다.
 */

data class Employee(val name: String, val age: Int, val salary: Int)

fun main(args:Array<String>){
    val first = Employee("John", 30, 3000)
    val second = Employee("Page", 24, 5300)
    val third = first.copy()

    println(first.toString())
    println(third.toString())
    println(first == second)
    println(first == third)
}