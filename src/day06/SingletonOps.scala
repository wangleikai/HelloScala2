package day06

/**
  * @author WangLeiKai
  *         2018/9/13  9:18
  */
object SingletonOps {
  def main(args: Array[String]): Unit = {
    val instance1 = Singleton.getInstance
    val instance2 = Singleton.getInstance
    println(instance1 == instance2)

    instance1.index = 5

    println(instance1.index)
    println(instance2.index)
  }

}
object Singleton{
  private val singleton = Singleton

  def getInstance = Singleton

  var index = 1
}
