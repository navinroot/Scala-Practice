package com.practice

/**
 *   use case is to remove extra space without using any string inbuilt function
 *  eq input-  "    I        Love     Scala      "
 *  output - "I Love Scala"
 */

object RemoveExtraSpace {

  def removeExtraSpace(str:String) ={

    var len=str.length
    var  lastStringIndex, firstStringIndex = 0

    //first remove the spaces in start and end
    var startFlag,endFlag = true
    var startIndex, endIndex, i =0
    while (startFlag || endFlag){
      if(startFlag && !str(i).isWhitespace){
        startIndex = i
        startFlag=false
      }
      if(endFlag && !str(len-1-i).isWhitespace){
        endIndex = len-i
        endFlag =false
      }
      i+=1
    }

    val strBuilder = new StringBuilder(str.substring(startIndex,endIndex))
    len = strBuilder.length
    for( i <- 0 until len){



    }





  }


  def main(args: Array[String]): Unit = {
    removeExtraSpace("    navin     aryan       ")
  }

}
