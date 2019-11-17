package com.concepts.method

object MethodDefinitionUsingVal extends App {

  /**
   * assigning anonymous function to Val
   */
  val double = (x:Int) => x*2
  println(double(2))


  /**
   * two ways to define val function
   * 1. implicit approach
   * val add = (x: Int, y: Int) => { x + y }
   * val add = (x: Int, y: Int) => x + y
   *
   * 2. explicit approach
   * val add: (Int, Int) => Int = (x,y) => { x + y }
   * val add: (Int, Int) => Int = (x,y) => x + y
   *
   */

  val addImplicit = (x:Int,y:Int) => {x+y}

  val addExplicit: (Int,Int) => Int =(x,y) => {x+y}

  val addThenDoubleImplicit = (x:Int,y:Int) => {
    val a = x+y
    a*2
  }

  val addThenDoubleExplicit:(Int,Int) => Int = (x,y) => {
    val a =x+y
    a*2
  }

  val identifyDatatypeUsingValImplicit= (x:Any) => {
    x match {
      case i:Integer => println("Integer")
      case str:String => println("String")
    }
  }

  val identifyDatatypeUsingValExplicit:(Any) => Unit =(x) =>{
    x match {
      case i:Integer => println("Integer")
      case str:String => println("String")
    }
  }

  val identifyDatatypeUsingValExplicit1:(Any) => Unit ={
    case i: Integer => println("Integer")
    case str: String => println("String")
  }

  identifyDatatypeUsingValImplicit(1)
  identifyDatatypeUsingValExplicit("sgsg")
  identifyDatatypeUsingValExplicit1(5)






}
