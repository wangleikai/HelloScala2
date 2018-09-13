package 文件访问

import java.io.PrintWriter

import scala.io.Source

/**
  * @author WangLeiKai
  *         2018/9/13  14:25
  */

//一行一行的读文件
object ReadDemo {
  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("d:/data/app.txt")
    val iterator = source.getLines()
    for( i <- iterator) println(i.toString)
  }
}
//按照字符读文件
object ReadDemo2 {
  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("d:/data/app.txt")
    for( i <- source) println(i)
  }
}
//写文件
object WriteDemo{
  def main(args: Array[String]): Unit = {
    val writer = new PrintWriter("d:/data/temp.txt")
    for (i <- 1 to 10) writer.println(i)
    writer.close
  }
}