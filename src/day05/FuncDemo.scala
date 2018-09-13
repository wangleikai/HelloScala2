package day05

/**
  * @author WangLeiKai
  *         2018/9/12  8:14
  */
object FuncDemo {

  def say(name:String,msg:String="hello"): Unit ={
    println(name+" say "+msg)
  }
  val a = Array(1,2,3)


  def course(cou:String*): Unit ={
    cou.foreach(println)
    for(i <- cou)
      println(i+" ")
    val iterator = cou.iterator
    while(iterator.hasNext){
      println(iterator.next())
    }
  }

  def greeting(name:String,func:(String)=>Unit): Unit ={
    func(name)
  }
  def main(args: Array[String]): Unit = {
    /*say("lisi")
    course("s","s","f")*/

    greeting(name="高总",(name:String)=>println(s"${name}，好"))
    greeting("李总",(name) => println(name+"，早"))
  }
}
