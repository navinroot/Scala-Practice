package com.concepts.method

class Time {
  private[this] var h = 12
  private[this] var m = 0

  def hour: Int = h

  def hour_=(x: Int) = {
    require(0 <= x && x < 24)
    h = x
  }

  def minute = m

  def minute_=(x: Int) = {
    require(0 <= x && x < 60)
    m = x
  }
}

object GetterSetterScala {
  def main(args: Array[String]): Unit = {
    val time = new Time()


    time.hour = (4)
    time.minute = (30)


    println(time.hour)
    println(time.minute)
  }


}