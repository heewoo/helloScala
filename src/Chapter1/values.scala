package Chapter1

object values {

  /* value Type (val , var) */
  val value_val = "val" // immutable (상수형)

  var value_var = "var"  // mutable   (변수형)


  /*
   이미 선언된 val 변수에 값을 바꾸려하면 오류가 난다. (이럴경우 var 로 선언 )
  value_val="change"
  */

  def main(args: Array[String]): Unit = {
    println(value_val)
    println(value_var)
  }

}
