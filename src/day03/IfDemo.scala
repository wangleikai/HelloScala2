package day03

/**
  * @author WangLeiKai
  *         2018/9/10  14:41
  * If 示例
  *
  */

/**
  * 可以将条件表达式的值赋值给变量
  * 不需要return  最后一行就是返回值
  */
object IfDemo {
  def main(args: Array[String]): Unit = {
    val a = 1
    val y = if(a >= 1) 1 else -1
    println(y)

    val z = if(a >= 1) 1 else "error"
    println(z)

  }
}
