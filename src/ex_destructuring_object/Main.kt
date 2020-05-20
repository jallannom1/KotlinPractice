package ex_destructuring_object

// 데이터 클래스의 인스턴스의 한해, 객체를 여러 개의 변수로 쪼개는 것이 가능

data class Employee(val name: String, val age: Int, val salary: Int)

fun main(args: Array<String>){
    val (name, _,salary) = Employee("john", 30, 3300) // 사용하지 않는 변수 이름은 _를 지정하여 무시 가능
    println(name); println(salary)
}