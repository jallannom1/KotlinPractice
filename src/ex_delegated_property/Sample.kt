package ex_delegated_property

<<<<<<< HEAD
=======
/*
프로퍼티의 Getter/Setter 구현을 다른 객체에 맡길 때 사용하는 문법
 */

>>>>>>> bdde933b8d071c4c426b70ac463ca58cfd73bfd4
class Sample{
    var number: Int by OnlyPositive()
}