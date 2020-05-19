package ex_lateinit

/*
클래스의 프로퍼티는 선언과 동시에 초기화하거나 init 블록 안에서 반드시 초기화해주어야 한다.
그러나 이런 강제성은 너무 불편하다. 프로퍼티의 타입이 String이나 Int라면 ""이나 0 등으로 초기화하면 되지만,
만약 사용자 정의 클래스라면 어떻게 초기화할 것인가?
 */

// 점을 표현하는 클래스
class Point(val x: Int, val y: Int)

// 사각형을 표현하는 클래스
class Rect{
    lateinit var pt: Point
    lateinit var pt2: Point

    val width: Int get() = pt2.x - pt.x
    val height: Int get() = pt2.y - pt.y
    val area get() = width * height
}

fun main(args:Array<String>){
    val rect = Rect()
    rect.pt = Point(3, 3)
    rect.pt2 = Point(6, 5)

    println("너비: ${rect.width}")
    println("높이: ${rect.height}")
    println("넓이: ${rect.area}")
}

/*
// 특정 lateinit 프로퍼티가 초기화되었는지 알려면
if(rect::pt.isInitialized){}
 */