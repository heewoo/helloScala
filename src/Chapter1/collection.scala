package Chapter1



object collection {

  /*스칼라의 컬렉션은 기본적으로 불변형. (멀티프로세서 아키텍쳐 환경에서 의도한대로 코드가 정확히 동작하게 특히 중요.)*/
  /*자바와 비교시 큰 특징은 병렬처리를 기본적으로 지원한다는 점.*/

  /* List 사용 */
  var numbers = List(1,2,3,4,5,6,7,8,9,10)

  var revNumbers = numbers.reverse

  // 리스트원소 표기 :: 로 가능 (콘스 cons)연산자
  // Nil을 적은 이유는 마지막 글자가 콜론으로 끝나는 메소드가 왼쪽이 아닌 오른쪽 원소와 결합하기 때문
  var simpleList1 = 1::2::3::4::5:: Nil

  var simpleList2 = List(6).::(5)


  def main(args: Array[String]): Unit = {

    for(n<-numbers){
      println("number -> " + n)
    }

    for(i<-revNumbers){
      println("rev -> " + i)
    }

    // drop() 해당 값 보다 큰거만
    var drop = numbers.drop(3)
    // take() 해당 값 만큼만 (앞에서부터)
    var take = numbers.take(2)

    // 3보다 크고 2개만 List 에서 가져오기 (4,5)
    var dropTake = numbers.drop(3).take(2)


    println(simpleList2)

    // map 으로
    println(numbers.map((i: Int) => i * 2))
  }

}
