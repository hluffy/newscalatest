package com.dk.myscalafun

/**
  * 先决条件
  */
object FunctionObject {
    def main(args: Array[String]): Unit = {
        val people = new Person(1,2,2,"Tom")
        people.working("Programmer")

//        不满足先决条件条件
//        val people1 = new Person(1,2,3,"Han")
//        people1.working("Han")
    }
}

class Person(head:Int,hand:Int,foot:Int,name:String) {
//    先决条件，boolean类型
    require(head>0&&head<2)

//    当传入的值不满足，程序运行异常，异常信息为"error input of hand,..."
    require(hand>=0&&hand<3,"error input of hand,please input hand retring ")
    require(foot>=0&&foot<3,foot)

    def working(fangFa:String) = {
        val total = head + hand + foot
        println(name +"is a " + fangFa+" and working by\n\t"+head+" head to think and\n\t"+hand+" handsto cooperate something and\n\t"
        +foot+" foots to walk !")
        println(name+"are use total Organ: "+total)
    }
}
