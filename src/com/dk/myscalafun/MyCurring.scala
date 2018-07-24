package com.dk.myscalafun

/**
  * 柯里化
  */
class MyCurring {

}
object MyCurring {
    def main(args: Array[String]): Unit = {
//        定义函数Curring
        def funCurring(x:Int) = (y:Int) => (z:Int) => x*y+z

        val step1 = funCurring(3)
        val step2 = step1(3)
        val step3 = step2(5)
        println(step3)
    }
}
