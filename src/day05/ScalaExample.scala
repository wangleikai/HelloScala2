package day05

/**
  * @author WangLeiKai
  *         2018/9/12  9:28
  */
object ScalaExample extends App {
  for (i <- 1 to 5)
    /*i match{
      case x if (x%2 == 0) => println(s"${x}可以被2整除")
      case _ =>
    }*/
    i match{
      case 1 => println(1)
      case 2 => println(2)
      case 3 => println(3)
      case _ => println("其他")
    }
    println("***********************************")



}
