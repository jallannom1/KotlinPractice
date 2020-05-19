package ex_extension_property

// 문자열이 큰지 판단하는 확장 프로퍼티
val String.isLarge: Boolean
    get() = this.length >= 10

fun main(args:Array<String>){
    println("1234567890".isLarge)
    println("500원".isLarge)
}