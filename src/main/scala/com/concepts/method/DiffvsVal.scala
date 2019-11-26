package com.concepts.method

/**
 * val functions are concrete instances of Function0 through Function22.
 *
 *
 */


class DiffvsVal {

//  val test: () => Int = {
//    val r=util.Random.nextInt
//    () => r
//  }



  def test(): Int = {
    val r = util.Random.nextInt
        println(r)
    r
  }

  val testVal = util.Random.nextInt()

}

object DiffvsVal extends App {
  val diffvsVal = new DiffvsVal()
   println(diffvsVal.test)
  println(diffvsVal.test)

  println(diffvsVal.testVal)
  println(diffvsVal.testVal)

}
