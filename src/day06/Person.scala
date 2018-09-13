package day06

/**
  * @author WangLeiKai
  *         2018/9/13  9:30
  */
class Person {
  var name : String = _
}

object Person{
  def apply(name:String): Person = {
    val person = new Person
    person.name = name
    person
  }
}

object TestPerson{
  def main(args: Array[String]): Unit = {
    val person = new Person
    person.name="tom"
    println(person.name)
    val p2 = Person("mike")
    println(p2.name)

  }
}
