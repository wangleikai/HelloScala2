package day05

import scala.collection.mutable.ArrayBuffer

/**
  * 类的嵌套使用
  * @author WangLeiKai
  *         2018/9/12  14:45
  */
class Student2 {
  private var name : String= "zhangsan"
  private var age : Int = 20

  class Course(val CourseName:String,val credit : Int){

  }

  private var courseList = new ArrayBuffer[Course]()

  def addNewCourse(cname : String,credit : Int): Unit ={
    val c = new Course(cname,credit)
    courseList += c
  }
}

object Student2{
  def main(args: Array[String]): Unit = {
    val s = new Student2
    s.addNewCourse("tiyu",2)
    s.addNewCourse("meishu",2)
    s.addNewCourse("yinyue",2)
    println(s.name+" "+s.age)
    println("*******选秀的课程**********")
    for( s1 <- s.courseList)
      println(s1.CourseName+" "+s1.credit)
  }
}
