package Chapter1

object filter {

  /* filter 사용법 */
  var test = Map("foo"->"bar")


  var numbers = List(1,2,3,4,5,6,7,8,9,10)


  def main(args: Array[String]): Unit = {

    println(numbers.map((i: Int) => i * 2))
  }

}
