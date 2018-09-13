package day04

/**
  * @author WangLeiKai
  *         2018/9/11  15:27
  */
object WordCount {
  def main(args: Array[String]): Unit = {
    val lines = Array("hadoop,scala,mapreduce,sqoop","hbase,hive,yarn","hadoop,sqoop","hive,hbase","jiji,kongkong"," , ")

    val strings = lines.flatMap(line => line.trim.split(","))

    val tuples = strings.map(word => (word,1))
    println(tuples)
    println(tuples.toBuffer)
    val stringToTuples = tuples.groupBy(t => t._1)

    println(s"grouped:${stringToTuples.toBuffer}")
    println(stringToTuples)

    val stringToInt = stringToTuples.map(x => (x._1,x._2.map(_._2).sum)).toList.sortBy(x => x._2).reverse
    println(stringToInt.toBuffer)
  }
}
