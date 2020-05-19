fun main(args:Array<String>){
  /*
      when도 if와 같이 조건에 따라 문장 실행 여부를 경정하는 키워드이다.
      when은 자바의 switch-case를 훨씬 업그레이드한 버전이다.

      when(타깃 표현식){
          타깃 표현식과 비교할 값->{
              N개의 문장
          }
      }
  */

/*    val score = 64

    when(score / 10){
        6->{println('D')}
        7->{println('C')}
        8->{println('B')}
        9,10->{println('A')}
    }

    println("test")
*/

    //when을 표현식으로

/*    val score = 95

    val grade: Char = when(score/10){
        6->'D'
        7->'C'
        8->'B'
        9,10->'A'
        else->'F'
    }
    println(grade)*/

    //when을 if-else처럼 사용하기

    val score = 95
    val grade:Char = when{
        score >=90->'a'
        score >=80->'b'
        score >=70->'c'
        score >=60->'d'
        else->'f'
    }
    println(grade)

}