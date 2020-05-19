package ex_any_class

fun main(args:Array<String>){
    val building = Building("Kotlin","3020203", area = 100)
    printObject(building)
}

fun printObject(any: Any){
    println(any.toString())
}