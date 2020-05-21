package ex_inherit_from_generic

// 제네릭이 적용된 클래스나 인터페이스는 상소갈 때 타입 인수를 전할해 주어야 한다.

interface Plusable<T>{
    operator fun plus(other: T): T
}