package 继承和实现

/**
  * @author WangLeiKai
  *         2018/9/13  11:14
  */
class Dog {

}
object Dog{
  def main(args: Array[String]): Unit = {
    val dog = new Dog with Flyable{
      override def fly: Unit = {
        println("monkey want to  fly")
      }
    }

    dog.fly
  }
}

