package com.dk.matchcase

/**
  * 模式匹配
  */
object MatchCaseTest {
//    守卫
    def bigData(data:String): Unit = {
        data match {
            case "Spark" => println("Wow!!!")
            case _ if data == "Flink" => println("Nice!!!")
            case _ => println("Something others")
        }
    }


//    类型匹配
    def matchType(p:Person) {
        p match {
            case stu:Student => println("I am a student"+stu)
            case worker:Worker => println("I am a worker"+worker)
            case _ => println("Nothing")
        }
    }

//    匹配数组
    def data(array:Array[String]): Unit = {
        array match {
            case Array("Scala") => println("Scala...")
            case Array(spark,hadoop,storm) => println(array.mkString(":"))
            case Array("Spark",_*) => println("Spark...")
            case _ => println("Nothing")
        }
    }

//    匹配元组
    def dataTuple(tuple:Tuple2[Any,Any]): Unit = {
        tuple match {
            case (0,_) => println("0 is matched")
            case (y,0) => println(y+"0")
            case (x,y) => println(x+":"+y)
            case _ => println("Nothing")
        }
    }
}

class Person {}
case class Worker() extends Person
case class Student() extends Person

