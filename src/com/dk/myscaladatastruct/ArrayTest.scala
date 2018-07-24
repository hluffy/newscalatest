package com.dk.myscaladatastruct

import scala.collection.mutable.ArrayBuffer

class ArrayTest {

}

object ArrayTest {
    def main(args: Array[String]): Unit = {
//        不可变数组
        val arrStr = Array("Scala","Spark")
        println(arrStr.mkString(","))
        arrStr(0) = "Storm"
        println(arrStr.mkString(","))

//        将不可变数组转换为可变数组
        arrStr.toBuffer

//        遍历数组
        for(i <- 0 until arrStr.length) println(arrStr(i))
//        或者
        for(elem <- arrStr) println(elem)

//        可变数组
        var arrBufInt = ArrayBuffer[Int]()
//        用+=在尾端添加元素
        arrBufInt += 1

//        同时在尾端添加多个元素
        arrBufInt += (2,3,4,5)
//        println(arrBufInt.mkString(","))

//        可以用++=操作符追加任何集合
        arrBufInt ++= Array(6,7,8)
        println(arrBufInt.mkString(","))

//        移除最后连个元素
        arrBufInt.trimEnd(2)
        println(arrBufInt.mkString(","))

//        移除第三个元素
        arrBufInt.remove(2)

//        从第三个元素开始移除2个元素
        arrBufInt.remove(2,2)
        println(arrBufInt.mkString(","))

    }
}
