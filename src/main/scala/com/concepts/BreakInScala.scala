package com.concepts

import scala.util.control.Breaks

object BreakInScala extends App {

  /**
   * Break in scala
   *
   */

  val outerLoop = new Breaks();
  val innerLoop = new Breaks();

  outerLoop.breakable {
    for (i <- 1 to 10) {
      println(i)
      if (i == 5) {
        outerLoop.break()
      }
      innerLoop.breakable {
        for (j <- 'a' to 'd') {
          println(j)
          if (j == 'c') {

            innerLoop.break()
          }
        }
      }
    }
  }


  /**
   * continue example
   *
   *
   */
  println("\n=== CONTINUE EXAMPLE ===")
  val searchMe = "peter piper picked a peck of pickled peppers"
  var numPs = 0
  for (i <- 0 until searchMe.length) {
    Breaks.breakable {
      if (searchMe.charAt(i) != 'p') {
        Breaks.break() // break out of the 'breakable', continue the outside loop
      } else {
        numPs += 1
      }
    }
  }

  val numberOfP = searchMe.toCharArray.count(_=='p')

  println(numberOfP)

  println("Found " + numPs + " p's in the string.")
}
