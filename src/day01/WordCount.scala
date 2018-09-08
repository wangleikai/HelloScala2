package day01

object WordCount {
  def main(args: Array[String]): Unit = {
    val lines = Array("hello tom hello jerry hello tom","hi tom hi jerry","heheda")

    //lines.map(lines=>lines.split(" ")).flatten
    //lines.flatMap(lines=>lines.split(" ")).map(word => (word,1)).groupBy(t => t._1)
    val words: Array[String] = lines.flatMap(lines=>lines.split(" "))
    val wordAndOne: Array[(String, Int)] = words.map(word => (word,1))
    val grouped: Map[String, Array[(String, Int)]] = wordAndOne.groupBy(t => t._1)

    val sumed: Map[String, Int] = grouped.map(t => (t._1,t._2.length))

    val redult: List[(String, Int)] = sumed.toList.sortBy(t => t._2).reverse

    println(redult)




  }

}
