package ex_sealed_class

// sealed 클래스는 자신의 중첩 클래스에만 상속을 허용하는 클래스이다.

sealed class Outer{
    class One : Outer()
    class Two : Outer()
    class Three : Outer()
}