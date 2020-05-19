package ex_extension_function

// 문자열이 숫자로만 이루어져있는지 판단하는 확장 함수
fun String.isNumber(): Boolean{
    var i = 0
    while(i < this.length){
        // 숫자가 아닌 문자가 하나라도 들어있으면 false 반환
        if(!('0' <= this[i] && this[i] <= '9'))
            return false
        i += 1
    }
    // 모든 조건을 통과하면 true 반환
    return true
}

fun main(args:Array<String>){
    println("12345790".isNumber())
    println("500원".isNumber())
}