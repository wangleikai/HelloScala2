package day06

/**
  * 实现一个单例模式
  * 防止直接调用该类直接创建对象
  * @author WangLeiKai
  *         2018/9/13  8:58
  */
class StaticTest private{
  private def add(x:Int,y:Int): Int ={
    return x + y
  }
}

/**
  * 这个就是单例模式的定义 和类同名 且不带参数
  */

object  StaticTest{
  //内部声明一个StaticTest类是对象
  val static = new StaticTest

  def add(x:Int,y:Int): Int ={
    return static.add(x,y)
  }
}


object Testt{
  def main(args: Array[String]): Unit = {
    val static = StaticTest
    println(static.add(1,2))
  }
}
