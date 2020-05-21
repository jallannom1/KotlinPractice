package ex_for

/*
// 코틀린의 for는 for-each 스타일만 지원한다.

// operator fun iterator(): Iterator<자유 타입>

// for문 속 in과 일반 in 연산자는 다르다.
 */

fun main(args: Array<String>) {
    for (i: Int in 1..10)
        print("$i")
    println()

    for (i: Int in 1..10){
        if (i > 5)
            break

        print("$i ")
    }
}

/*
// while문 사용시
val iter: Iterator<Int> = (1..10).iterator()
while (iter.hasNext()){
    val i = iter.next() // 매 반복마다 i에는 1, 2, 3, ..., 10의 값이 들어간다.
    print(i)
}
*/