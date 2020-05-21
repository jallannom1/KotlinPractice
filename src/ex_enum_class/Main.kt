package ex_enum_class

enum class Mode{
    SELECTION, PEN, SHAPE, ERASER
}

fun main(args: Array<String>){
    // 현재 선택된 모드
    val mode: Mode = Mode.PEN

    when (mode){
        Mode.SELECTION-> println("선택 모드")
        Mode.PEN-> println("펜 모드")
        Mode.SHAPE-> println("도형 모드")
        Mode.ERASER-> println("지우개 모드")
    }
}