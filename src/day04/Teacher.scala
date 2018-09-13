package day04

/**
  * @author WangLeiKai
  *         2018/9/11  19:07
  */
class Teacher {
  val id = 1
  val name = "tom"
  private[this] val age = 20

  private[this] def printAge: Unit ={
    println(age)
  }
  //Teacher.constant

}
object Teacher{
  private[this] val constant = "123123"
  def main(args: Array[String]): Unit = {

     val teacher = new Teacher
    println(teacher.name)
    println(teacher.id)
    //println(teacher.age)
    //teacher.printAge
     def test1: Unit ={
      println("test")
    }
  }
}

object TeacherTest{
  def main(args: Array[String]): Unit = {

    val teacher = new Teacher
    println(teacher.id)
    println(teacher.name)
   // println(Teacher.constant)
  }
}
