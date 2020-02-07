package com.concepts.dynamicProgramming

object DecodeToAlphabet {

  def decode( str:String):Int={
    val len = str.length
    val countArray = Array.fill[Int](len+1)(0)
    countArray(0) = 1
    countArray(1) = if(str.charAt(0)=='0') 0 else 1

    for(i<- 2 to len){
      val oneDigit = str.substring(i-1,i).toInt
      val towDigit = str.substring(i-2,i).toInt
      if(oneDigit >=1){
        countArray(i) += countArray(i-1)
      }
      if(towDigit >=10 && towDigit<=26){
        countArray(i) += countArray(i-2)
      }

    }
    countArray(str.length)
  }


  def main(args: Array[String]): Unit = {
      println(decode("1221"))

  }
}
