package day03

/**
  * @author WangLeiKai
  *         2018/9/10  14:59
  */
object MethodAndFunctionTest {
  def m1(f:(Int,Int) => Int) : Int = {
    f(2,6)
  }
  val f1 = (x:Int,y:Int) => x + y

  val f2 = (x:Int,y:Int) => x * y

  def main(args: Array[String]): Unit = {
    val i = m1(f1)
    println(i)

    val y = m1(f2)
    println(y)
  }
}
