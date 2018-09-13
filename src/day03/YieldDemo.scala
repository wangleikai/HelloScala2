package day03

/**
  * @author WangLeiKai
  *         2018/9/10  17:11
  */
object YieldDemo {
  def main(args: Array[String]): Unit = {
    val arr = Array("Hadoop","Spark","Scala","Hive")
    arr.foreach(println)
    val newArr = for{
      s <- arr
      s1 = s.toUpperCase
    } yield s1

    println(newArr.toBuffer)
  }

}
