package ex_overriding

open class AAA{
    open fun func() = println("AAA")
}

class BBB: AAA(){
    override fun func(){
        super.func()
        println("BBB")
    }
}

fun main(args:Array<String>){
    AAA().func()
    BBB().func()
}

/*
// override 키워드는 그 자체로 open 키워드가 포함되어 있다. 즉, override된 멤버 함수는
   서브클래스에서 몇 번이고 재오버라이딩이 가능하다. 멤버 함수의 재오버라이딩을 막으려면
   아래 예시처럼 final 키워드를 붙여야 한다.

   open class AAA{
     open fun hello() = Unit
   }

   open class BBB: AAA(){
     // final을 붙여 더 이상 hello를 오버라이딩할 수 없게 만든다.
     final override fun hello() = super.hello()
   }

   open class CCC: BBB(){
     // 에러
     override fun hello(){
     }
   }
*/