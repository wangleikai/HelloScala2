package day01

object IfDemo {
  def main(args: Array[String]): Unit = {
    /*val a = 10
    val b = if(a>10) 1 else -1*/


    for(i <- 1 to 3; j <- 1 to 3 if i != j){
      print(10 * i + j +" ")
    }

  }

}
