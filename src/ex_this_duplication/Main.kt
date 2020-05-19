package ex_this_duplication

class AAA{
    var name = 15

    fun memberFunc(num:Int){
        println(num)
        println(this.name)
    }
}

fun main(args:Array<String>){
    val a = AAA()
    a.memberFunc(53)
}