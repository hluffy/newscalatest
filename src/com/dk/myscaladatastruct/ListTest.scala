package com.dk.myscaladatastruct

class ListTest{

}
object ListTest {
    def main(args: Array[String]): Unit = {
////        定义String类型的List
//        val fruit: List[String] = List("apple","oranges","pears")
//
//        //        定义Int类型的List
//        val nums:List[Int] = List(1,2,3,4)
//
//        //        定义空List
//        val empty:List[Nothing] = List()
//
//        //        二维List
//        val dim:List[List[Int]] =
//            List(
//                List(1,0,0),
//                List(0,1,0),
//                List(0,0,1)
//            )

//        定义列表的另一种方式
        val fruit = "apple"::("oranges"::("pears"::Nil))
        println(fruit)

        val nums = 1::(2::(3::(4::Nil)))
        println(nums)

//        定义空列表
        val empty = Nil

        val t = new Test
        t.ops


        val lct = new ListConcatTest
        lct.concatTest


    }




}

/**
  * 列表的基本操作
  */
class Test {
    def ops: Unit ={
        val fruit = "apple"::("oranges"::("pears"::Nil))
        val nums = Nil

//        head取出List中的第一个值
        println("Head of fruit: " +fruit.head)

//        tail取出List中除了第一个值外的其他所有值，返回一个List
        println("Tail of fruit: "+fruit.tail)

        println("Check if fruit is empty: "+fruit.isEmpty)
        println("Check if nums is empty: "+nums.isEmpty)
    }

}

class ListConcatTest {
    def concatTest = {
        val fruit1 = "apple"::("oranges"::("pears"::Nil))
        val fruit2 = "mangoes"::("banana"::Nil)

//        用::将两个或跟多的List表串联起来
        var fruit = fruit1 ::: fruit2
        println("fruit1 ::: fruit2 : "+fruit)

//        调用方法
        fruit = fruit1.:::(fruit2)
        println("fruit1 ::: fruit2 : "+fruit)

//        调用.concat()方法
        fruit = List.concat(fruit1,fruit2)
        println("List.concat(fruit1,fruit2): "+fruit)

    }
}
