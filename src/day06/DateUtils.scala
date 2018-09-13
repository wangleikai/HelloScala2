package day06

import java.text.SimpleDateFormat
import java.time.format.DateTimeFormatter
import java.util.Calendar

/**
  * @author WangLeiKai
  *         2018/9/13  8:38
  * 工具类
  */
object DateUtils {
  def getCurrentDate:String = getCurrDateTime(dateTimeFormat = "EEEE ,MMMM d")
  def getCurrentTime:String = getCurrDateTime(dateTimeFormat = "K:m aa")


  private def getCurrDateTime(dateTimeFormat: String) : String ={
      val dateFormat = new SimpleDateFormat(dateTimeFormat)
      val cal = Calendar.getInstance()
      dateFormat.format(cal.getTime)
  }
}
