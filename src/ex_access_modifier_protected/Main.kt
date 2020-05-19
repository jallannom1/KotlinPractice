package ex_access_modifier_protected

open class AAA(protected val number: Int)

class BBB(number: Int): AAA(number){
    fun printNumber(){
        // AAA 클래스의 number 프로퍼티에 접근 가능
        println(number)
    }
}

fun main(args:Array<String>){
    val test = BBB(36)
//  println(test.number) error
    test.printNumber()
}