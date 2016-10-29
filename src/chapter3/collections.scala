package chapter3

class collections {

  def collection_list(): Unit ={
    val onwTwoThree = List(1,2,3)
    println(onwTwoThree);
  }

  def list_length(): Unit ={
    val list = List("123","1234","5678","112233","abcd")
//    list.count(s => s.length==4)
      list.exists(x=> x =="abcd")
  }

  def tuple(): Unit ={
    val pair = ("123","heewoo","kang")
    println(pair._1)
    println(pair._2)
    println(pair._3)

  }


}


object collection{
  def main(args: Array[String]): Unit = {
    val c = new collections()
    //c.collection_list()
    c.list_length()
    c.tuple()

  }
}

