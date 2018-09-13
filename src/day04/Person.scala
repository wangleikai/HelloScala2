package day04

/**
  *每个辅助构造器都必须以一个对先前已定义的其他辅助构造器或主构造器的调用开始
  * @author WangLeiKai
  *         2018/9/11  21:27
  */
class Person(val id : Int,val name:String) {
  var gender : String = _
  //主构造器中  不属于任何方法的代码 就是主构造器的代码
  println("aaaa")
  def this(id: Int,name:String ,gender:String){
    this(id,name)
    this.gender=gender
  }

}
object  Person{

  def main(args: Array[String]): Unit = {
val p = new Person(12,"里斯","female")

    println(p.gender)

  }
}

object Ts{//静态对象   先加载  全部加载
  println("bbb")
  def main(args: Array[String]): Unit = {
    val p = new Person(12,"里斯")

    println(p.gender)
  }

}
