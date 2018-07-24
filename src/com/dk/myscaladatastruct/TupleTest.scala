package com.dk.myscaladatastruct

object TupleTest {
    def main(args: Array[String]): Unit = {
//        定义元组
        val tuple = (1,2,3,4,"hello")
        println(tuple._1)
        println(tuple._2)
    }

}
