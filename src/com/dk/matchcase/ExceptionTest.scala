package com.dk.matchcase

import java.io.{FileNotFoundException, FileReader,IOException}

/**
  * 模式匹配与异常处理
  */
object ExceptionTest {
    def main(args: Array[String]): Unit = {
        try {
            val f = new FileReader("C://1.txt")
        } catch {
            case ex:FileNotFoundException => {
                println("Missing file exception")
            }
            case ex:IOException => {
                println("IO Exception")
            }
            case _ => println("Unknown Exception")
        } finally {
            println("Exiting finally...")
        }



        def matchType(p:Person): Unit ={
            p match {
                case stu:Student => println("I am a student "+stu)
                case worker:Worker => println("I am a worker "+worker)
                case _ => println("Nothing")
            }
        }
    }

}

/**
  * 密封类
  */
sealed class Person
case class Worker() extends Person
case class Student() extends Person
