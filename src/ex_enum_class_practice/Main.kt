package ex_enum_class_practice

/*
// 모던 열거 클래스는 자동으로 ENUM일는 클래스를 상속하며,다음과 같은 멤버가있다.
// val name: String; val ordinal: Int
// 또한 열거 클래스에는 다음과 같은 멤버 함수가 기본적으로 포함되어 있다.

fun valueOf(value: String): 열거 클래스
fun values(): Array<열거 클래스>
 */
enum class Mode{
    SELECTION, PEN, SHAPE, ERASER
}

fun main(args: Array<String>){
    val shapeMode: Mode = Mode.SHAPE
    println(shapeMode.name)
    println(shapeMode.ordinal)

    val modes: Array<Mode> = Mode.values()
    for(mode: Mode in modes)
        println(mode)

    println(Mode.valueOf("PEN").ordinal)
}