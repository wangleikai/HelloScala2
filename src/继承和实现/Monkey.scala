package 继承和实现

/**
  * @author WangLeiKai
  *         2018/9/13  10:56
  */
class Monkey extends Animal with Flyable with Beatable {
  override def run: Unit = {
    println("猴子在跑")
  }

  override def fly: Unit = {
    println("猴子会飞")
  }

  override def beat: Unit = {
    println("猴子还会打架")
  }
}

object  Monkey{
  def main(args: Array[String]): Unit = {
    val monkey = new Monkey
    monkey.run
    monkey.fly
    monkey.beat
  }
}
