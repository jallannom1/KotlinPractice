fun main(args:Array<String>){
    /*println(cToF(30))
    println(celsiusToFah(30))
    println(celsiusToFah2(30))
    println(getAverage(89, 96))*/

    println(getSumOf(1, 2, 3, 4, 5, 6, 7))
    println(getSumOf(32, 57, 12))
    println(getSumOf())
}

fun cToF(celsius:Int): Double{
    return celsius * 1.8 + 32
}

fun getAverage(a:Int, b:Int): Double{
    return(a + b) / 2.0
}

//반환 값이 필요 없을 때
fun celsiusToFah(celsius:Int){
    println(celsius * 1.8 + 32)
}
//축약형
fun celsiusToFah2(celsius:Int) = println(celsius * 1.8 + 32)

//디폴트 인수
fun getAverage2(a:Int=0, b:Int=0, print: Boolean = false): Double{
    val result = (a + b) / 2.0
    if(print)
        println(result)
    return result
}

//가변 인수
fun getSumOf(vararg numbers: Int):Int{
    val count = numbers.size
    var i = 0
    var sum = 0

    while(i < count){
        sum += numbers[i]
        i += 1
    }
    return sum
}