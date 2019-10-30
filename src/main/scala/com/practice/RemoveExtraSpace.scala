package com.practice

import java.util

/**
 * use case is to remove extra space without using any string inbuilt function
 * eq input-  "    I        Love     Scala      "
 * output - "I Love Scala"
 */

object RemoveExtraSpace {

  def main(args: Array[String]): Unit = {
    removeExtraSpace("    I        Love     Scala      ")
  }

  def removeExtraSpace(str: String) = {
    val linkedList = new util.LinkedList[Char]()
    for (c <- str) {
      linkedList.add(c)
    }

    for (i <- 0 until (linkedList.size())) {
      while (linkedList.size() > i + 1
        && linkedList.get(i).isWhitespace
        && linkedList.get(i + 1).isWhitespace) {
        linkedList.remove(i + 1)
      }
    }
    if (linkedList.peekFirst().isWhitespace) {
      linkedList.removeFirst()
    }
    if (linkedList.peekLast().isWhitespace) {
      linkedList.removeLast()
    }

    val string = linkedList.toArray().mkString("")

    println("<:"+string+":>")


  }

}
