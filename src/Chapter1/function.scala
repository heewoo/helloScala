package Chapter1

object function {

  /* function 사용법 */
  /*
     def 로 선언  return type 명시
   */

  def example(val1:Int): Unit ={
    println("example function")
  }


  /* no return */
  def function1(val1:Int, val2:String): Unit ={
    val hi = "hello ~ "
    println (hi)
    return hi
  }

  /* return 타입 명시 */
  def function2(val1:Int, val2:String): String={
    return val2
  }

  def main(args: Array[String]): Unit = {

    function1(1,"")
    println(function2(2,"world"))

  }

}
