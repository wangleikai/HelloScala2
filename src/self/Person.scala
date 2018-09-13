package self

/**
  * @author WangLeiKai
  *         2018/9/12  15:28
  */
class Person(val name:String ,val age : Int,salary:Int) {
  def sayHello() : String = "Hello "+name+" and the age is "+ age
}

class Emp(override val name : String ,override val age : Int ,val salary : Int) extends Person(name:String, age:Int,salary : Int){

  override def sayHello(): String = "子类中重写的方法"
}

object  Demo1{
  def main(args: Array[String]): Unit = {
    val p1 = new Person("lisi",20,2)

    println(p1.sayHello())
    var p2:Person = new Person("zhangsan",22,2){
      override def sayHello(): String = "匿名子类重写的父类的方法"
    }


    println(p2.sayHello())
    val e1 = new Emp("tom",30,3000)
    println(e1.sayHello())
  }
}