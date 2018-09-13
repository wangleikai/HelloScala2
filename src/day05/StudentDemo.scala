package day05

/**
  * @author WangLeiKai
  *         2018/9/12  14:18
  */
private[day05] class Student {
  val id : Int = 1
  val name : String = "lisi"

  private var gender = "female"
  private[this] var height = 120

  def getGender(): String ={
    gender
  }
  println(Student.NANE)
  println(TestMain.NANE)
}
//伴生对象
object Student{
  val NANE = "Student对象"
  def main(args: Array[String]): Unit = {
    //Student.height  //不能访问静态的属性
  }
}
object TestMain{
  val NANE = "TestMain对象"
  def main(args: Array[String]): Unit = {
    val s = new  Student
    //s.name = "ll"
    println(s.id +" "+ s.name)
    println(s.getGender())
  }
}