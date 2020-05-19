fun main(args:Array<String>){
    //표현식 case 1
    /*val value:Int = if(10 > 5){
        println("10>5")
        10
    }else{
        println("10<5")
        5
    }

    println(value)*/
    //표현식 case 2
    val a = if(10>5){}
    else{}

    //표현식 case 3
    val b = if(10>5){
        val a = 10
    }else{
        val a = 5
    }
}