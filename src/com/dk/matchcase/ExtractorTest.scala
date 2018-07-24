package com.dk.matchcase

/**
  * 提取器
  */
object ExtractorTest {
    def main(args: Array[String]): Unit = {
        val x = ExtractorTest(5)
        println(x)

        x match {
            case ExtractorTest(num) => println(x+" is bigger two times than "+num)
            case _ => println("i cannot calculate")
        }
    }


    def apply(x:Int) = x*2
    def unapply(z:Int):Option[Int] = if(z%2==0) Some(z/2) else None
}
