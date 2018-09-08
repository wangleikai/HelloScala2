package day01

object FunctionDef {
  def multiply(x : Int): Int ={
    x * x }

  val func = (i: Int) => {
    multiply(i)
  }
  def main(args: Array[String]): Unit = {
    val unit = func(9)

    println(unit)


  }

}
