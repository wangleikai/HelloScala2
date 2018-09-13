package day03

/**
  * @author WangLeiKai
  * @date 2018/9/10  14:28
  */
object BlockExpressionTest {
  def main(args: Array[String]): Unit = {
    val a = 0
    val result = {
      if (a < 0){
        -1
      }else if (a >= 1){
        1
      }else{
        "error"
      }
    }
    println(result)
  }

}
