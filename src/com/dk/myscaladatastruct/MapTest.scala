package com.dk.myscaladatastruct

class MapTest {

}

object MapTest {
    def main(args: Array[String]): Unit = {
//        定义不可变Map
        val bigData = Map("Scala" -> 35,"Hadoop" -> 30,"Spark" -> 50)
        println(bigData("Scala"))

//        判断Map中是否包含key为Hadoop的健值对
        println(bigData.contains("Hadoop"))

//        如果Map中存在Key为Spark的健值对，则返回对应的value，如果不存在，则返回默认值70
        println(bigData.getOrElse("Spark",70))

        println(bigData.mkString("{",",","}"))

//        返回第三个元素
        println(bigData.drop(2))


//        可变Map
        val bigDataVar = scala.collection.mutable.Map("Scala" -> 35,"Hadoop" -> 30,"Spark" -> 50)
        bigDataVar("Spark") = 100
        println(bigDataVar)

//        添加健值对
        bigDataVar += ("Kafka" -> 69)
        println(bigDataVar)

//        删除健值对
        bigDataVar -= ("Kafka")
        println(bigDataVar)

//        遍历Map
        for((k,v) <- bigDataVar) println(k+" "+v)       // 打印key和value

        for(k <- bigData.keySet) println(k)             // 只打印key

    }
}
