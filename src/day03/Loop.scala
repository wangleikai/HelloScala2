package day03

/**
  * @author WangLeiKai
  *         2018/9/10  15:33
  * 循环示例
  */
object Loop {
  def main(args: Array[String]): Unit = {
    val str = Array(1,2,3,4,5,6,7)

    for(i <- str ) {
      println(i)
    }

    val add  = for (i <- str) yield i +100
    println (add.toBuffer)
    val str2 = add.mkString(",")
    println(str2)
    for {
      i <- 1 to 9
      y <- 1 to i
    } {
      if (y == 1 ) println()
      print(i*y+" ")
    }
  }
}
