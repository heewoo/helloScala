package chapter1


object timer {
  // - function object
  // 함수도 객체 처럼 사용할수 있다.

  def oncePerSecond(callback:()=>Unit): Unit ={
    while(true){callback();Thread sleep(1000)}
  }

  def timeFlies(): Unit ={
    println("time flies like an arrow ......")
  }

  def main(args:Array[String]): Unit ={
    oncePerSecond(timeFlies)
  }
}


object TimerAnonymous {
  // 익명함수는 다음과같이 사용한다.

  def oncePerSecond(callback: () => Unit) {
    while (true) { callback(); Thread sleep 1000 }
  }
  def main(args: Array[String]) {
    oncePerSecond(() => println("time flies like an arrow..."))
  }
}


