package com.concepts.method

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
