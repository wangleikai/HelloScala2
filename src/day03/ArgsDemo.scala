package day03

/**
  * @author WangLeiKai
  *         2018/9/10  17:47
  */
object ArgsDemo {
  def main(args: Array[String]): Unit = {
    //Call by value 对函数实参求值，且只求一次  先求值再调用
    def test1(x :Int,y:Int):Int = x+x
    //函数实参每次在函数体内被用到时都会被求值   调用的时候才会执行
    def test2(x: => Int,y: => Int):Int = x+x

    println(test1(3+4,8))
    println(test2(3+4,8))

    println("************************************************")
    //默认参数
    def func1(name : String = " Tom "):String = "Hello "+name
    val merry = func1("merry")
    val s = func1()
    println(s)
    println(merry)
    println("************************************************")
    //带名参数
    def func2(str:String="Good Morning ",name:String="Tom",age:Int=20)=str + name +" and the name of "+name+" is "+ age

    println(func2(name="merry"))
    println(func2())
    println(func2(age = 25))
    println("************************************************")
    //变长参数
    def sum(args:Int*) = {
      var result  = 0
      for (arg <- args) result += arg
      result
    }

    println(sum(1,2,3))

    println(sum(1,2,3,4,5,6))
  }
}
