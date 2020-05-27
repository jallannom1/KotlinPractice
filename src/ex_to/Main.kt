package ex_to

/*
// to는 모든 타입에 적용되는 확장 함수

infix fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)

// to 확장 함수는 리시버 타입에 제네릭을 적용했기 때문에 모든 타입에 이용 가능.
// 내부적으로 Pair 생성자를 호출하여 Pair 객체를 생성 후 반환.
 */

fun main(args: Array<String>){
    val test: Pair<Int, Double> = 10 to 3.14
}