package ex_generic_to_class_and_interface

fun main(args: Array<String>){
    val pair: Pair<Int, Double> = Pair(15, 9.12) // 아래 내용의 문법적 설탕
    println(pair.toString())
}
/*
// 위 문법 추천해 주어서 바꿈

fun main(args: Array<String>){
    val pair: Pair<Int, Double>
    pair = Pair<Int, Double>(15, 9.12)
    println(pair.toString())
}
*/
