package Chapter1

object chapter1_obj {

  def main(args: Array[String]): Unit = {

    // 초기값을 선언 한다 //
    example1(1, "heewoo1")
    example1(2, "heewoo2")
    example1(3, "heewoo3")

    // caseClass 초기화시 선언된 값으로  set
    var ex1 = example1(1, "heewoo1")
    var ex2 = example2(2, "heewoo2")
    var ex3 = example3()

    // example의 오브젝트 return 된다
    println(ex1)
    println(ex2)
    println(ex3)



  }

}
