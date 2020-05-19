fun main(args:Array<String>){
    val a = -36
    val result = absolute(a)
    println(result)
}

//입력받은 정수의 절대값을 반환하는 함수
fun absolute(number:Int): Int{
    return if(number >= 0)
        number
    else -number
}

//메모리에는 스택이라고 하는 영역이 있고 이곳에는 지역변수가 저장된다.