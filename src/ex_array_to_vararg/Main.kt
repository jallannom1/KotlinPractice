package ex_array_to_vararg

// 배열 속에 있는 원소들은 가변 인수로 활용할 수 있다.

fun printAll(vararg tokens: String){
    for (token in tokens)
        print("$token ")
}

fun main(args: Array<String>){
    val numbers: Array<String> = arrayOf("What's", "your", "name?")
    printAll(*numbers) // 배열앞에 *을 찍으면 배열 속의 가변 인수로 활용할 수 있다.
    printAll("\n"+numbers)
}