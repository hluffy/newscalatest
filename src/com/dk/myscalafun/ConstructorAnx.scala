package com.dk.myscalafun

/**
  * 辅助构造器
  */
class ConstructorAnx {
    private var name = ""
    private var age = 0

//    定义辅助构造器
    def this(name:String) {
//        调用主构造器
        this()
        this.name = name
        println(name)
    }

//    定义另一个辅助构造器
    def this(name:String,age:Int) {
//        调用前一个辅助构造器
        this(name)
//        this.name = name
        this.age = age
        println(name+":"+age)
    }
}

object ConstructorAnx {
    def main(args: Array[String]): Unit = {
        val bigDate = new ConstructorAnx

        val hadoop = new ConstructorAnx("hadoop")

        val spark = new ConstructorAnx("Spark",4)




//        函数字面量和占位符
        val functionValue = (x:Int) => x+10
        val aa = functionValue(3)
        println(aa)

        val array = Array(1,2,3,4,5,6)
        var out = array.filter(item => item>2).foreach(println)

        out = array.map(_+2).filter(_>2).foreach(println)

    }
}
