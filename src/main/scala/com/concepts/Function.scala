package com.concepts

object Function {

  val increase = (x: Int) => {
    println("We")
    println("are")
    println("here!")
    x + 1
  }

  def main(args: Array[String]): Unit = {
  //  var num = increase(10)
  //  println(num)

    var more =1
    val addMore = (x:Int) => x+more
    println(addMore(10))
    more =999
    println(addMore(10))


  }


}
