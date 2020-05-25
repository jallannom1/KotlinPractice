package ex_delegated_property

/*
프로퍼티의 Getter/Setter 구현을 다른 객체에 맡길 때 사용하는 문법
 */

class Sample{
    var number: Int by OnlyPositive()
}