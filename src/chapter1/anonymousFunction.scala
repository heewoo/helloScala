package chapter1



class Complex(real: Double, imaginary: Double) {
  // 클래스에 파라미터값을 가질 수 있다.
  // 파라미터 값을 객체에 담는다.
  def re = real
  def im() = imaginary

  override def toString() =
    "" + re + (if (im < 0) "" else "+") + im + "i"


}


object ComplexNumbers {
  def main(args: Array[String]) {
    val c = new Complex(1.2, 3.4)
    println("imaginary part: " + c.im())
  }
}
