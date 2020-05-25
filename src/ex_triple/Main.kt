package ex_triple

// Triple Class : 세 변수 하나로 묶기
// 원의 지름, 원주, 넓이를 반환한다.
fun calculateCircle(radius: Int): Triple<Int, Double, Double> = Triple(radius * 2, 2 * 3.14, 3.14 * radius* radius)

fun main(args: Array<String>){
    val (diameter, _, area) = calculateCircle(5) // 사용하지 않을 값을 _로 무시
    println("지름: $diameter")
    println("넓이: $area")
}
