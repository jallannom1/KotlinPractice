fun main(args:Array<String>){

    //whlie 문
    /*var i = 1

    while(i<10){
        println(i)
        i+=1
    }
    println("i는 10과 같거나 더 크네요")*/

    //do-while문
   /* var i = 1
    do{
        println("실행됨")
    }while(i == 0)
    println("i는 0이 아니라 반복문 종료")*/

    //흐름 제어 continue
/*    var i = 0
    while (i < 10){
        i +=1
        if(i % 2 ==0)
            continue
        print(i)
    }*/

    //흐름제어 break

    var i = 0
    while(true){
        i +=1
        if(i>=5)
            break
        print(i)
    }
}