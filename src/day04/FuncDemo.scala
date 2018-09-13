package day04

/**
  * @author WangLeiKai
  *         2018/9/11  9:08
  */
object FuncDemo {
  def main(args: Array[String]): Unit = {
    val arr = Array(1,2,3,4,5,6,7,8,9)


    val arr2 = for (i <- arr if i%2 == 0 ) yield i
      println(arr2.toBuffer)

    println("***************************************")
    val func = (x:Int) => x%2 == 0
    val ints = arr.filter(func)
    println(ints.toBuffer)
    println("***************************************")

    val arr3 = arr.filter(_%2==0)
    println(arr3.toBuffer)
  }
}
