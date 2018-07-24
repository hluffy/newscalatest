package com.dk.myscalafun

/**
  * 高阶函数
  */
class HighFunction {

}

object HighFunction {
    def main(args: Array[String]): Unit = {
        val hiScala = (name:String) => println(name)

        def helloScala(myFunction:(String) => Unit,context:String): Unit = {
            myFunction(context)
        }

        helloScala(hiScala,"Spark is Wonderful!")




        def helloSpark(name:String) = (name:String) => println(name)

        val spark = helloSpark("Scala")

        spark("Spark")


    }
}
