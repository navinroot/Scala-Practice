package com.practice

import scala.collection.mutable.ArrayBuffer
import scala.util.control.Breaks

object FindFirstNonRepeatedCharacter {

  def FirstNonRepeatingCharactor(str:String):Char ={
    val arr= ArrayBuffer.fill[Char](256)(0)
    var char:Char = 0
    for( c <- str){
      arr(c) =(arr(c)+1).toChar
    }

    val breaks = new Breaks;
    breaks.breakable(
      for(c <- str){
        if(arr(c) ==1){
          char = c
          breaks.break()
        }
      }
    )
    char
  }

  def main(args: Array[String]): Unit = {
    println(FirstNonRepeatingCharactor("navinaryan"))

  }

}
