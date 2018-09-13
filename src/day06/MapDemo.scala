package day06

import java.util

import scala.collection.mutable

/**
  * @author WangLeiKai
  *         2018/9/13  16:09
  */
object MapDemo {
  def main(args: Array[String]): Unit = {
//    val m = Map(("hadoop",1),("Spark",2))
//    m.foreach(println)
//    println("******************")
//    import scala.collection.mutable._
//    val m2 = Map(("Scala",2),("hive",3))
//    m2 += (("habse",3))
//
//    m2.foreach(println)
//    println("******************")
//    m2 -= "Scala"
//    m2.foreach(println)
//
//
//    val l1 = mutable.LinkedList(1,2,3,4,5)
//    println(l1.sum)
//
//    val l2 = ListBuffer(1,2,3,4,5)
//    println(l2.sum)

    //import  collection.JavaConverters._
    import  collection.JavaConversions._

    //val l3 = util.ArrayList(3).asScala

//    val java = List(1,2,3).asJava
//    println(java)


    val scala = new util.ArrayList[Int](3)
    scala.add(1)
    scala.add(1)
    scala.add(1)
    scala.add(1)
    scala.add(1)

    println(scala)


  }
}
