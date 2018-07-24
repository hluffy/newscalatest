package com.dk.myscalafun

/**
  * 函数值
  */
object FunctionValue {
    def resultValue(num:Int,total:Int=>Int):Int = {
        var hello = 0
        for(i <- 1 to num){
            hello += total(i)
        }

        hello
    }

    def main(args: Array[String]): Unit = {
        val result = resultValue(23,x=>if(x>0) x+3 else 0)
        println(result)
    }

}
