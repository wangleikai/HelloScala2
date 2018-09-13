package day06

/**
  * 单例模式
  * @author WangLeiKai
  *         2018/9/13  8:32
  */
object Demo1 {
  private var eyeNum = 2
  println("this is DEmo1 obj!")

  def getEyeNum: Int ={
    eyeNum
  }
}

object Demo1Test{
  def main(args: Array[String]): Unit = {
    println(Demo1.getEyeNum)
    println(Demo1.getEyeNum)
    println(Demo1.getEyeNum)



    println(DateUtils.getCurrentDate)
    println(DateUtils.getCurrentTime)
  }
}
