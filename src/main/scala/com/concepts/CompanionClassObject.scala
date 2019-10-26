package com.concepts

import scala.collection._

/**
 * page 64
 *
 */


class CompanionClassObject {

  private var sum = 0

  def add(b: Byte): Unit = {
    sum += b
  }

  def checksum(): Int = ~(sum & 0xFF) + 1



}

object CompanionClassObject {

  private val cache = mutable.Map.empty[String, Int]

  def main(args: Array[String]): Unit = {
    println(CompanionClassObject.calculate("I love Scala Language"))
    println(CompanionClassObject.calculate("I love Scala Language"))


  }

  def calculate(string: String): Int = {
    if (cache.contains(string)) {
      cache(string)
    } else {
      val acc = new CompanionClassObject
      for (c <- string) {
        acc.add(c.toByte)
      }
      val checksum = acc.checksum()
      cache += (string -> checksum)
      checksum
    }
  }


}