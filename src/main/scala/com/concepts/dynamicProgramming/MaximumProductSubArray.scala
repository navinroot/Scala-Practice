package com.concepts.dynamicProgramming

import java.lang.Math.max,Math.min

class MaximumProductSubArray {

  def maxProductSubArray(arr:Array[Int]): Int ={
    val len = arr.length
    var maxVal =1
    var minVal =1

    var productSoFar =1

    for(i <- 0 until  len){
      if(arr(i)==0){
        maxVal=1
        minVal=1
      }
      if(arr(i)<0){
        val swap = (maxVal,minVal)
        minVal = swap._1
        maxVal = swap._2
      }
      maxVal = max(maxVal*arr(i),maxVal)
      minVal = min(minVal*arr(i),minVal)

      productSoFar =max(maxVal,productSoFar)
    }
    productSoFar
  }



}

object MaximumProductSubArray extends App{
  val arr =Array(0,2, -3, 0, -2, 0,-40)
  val max = new MaximumProductSubArray()
  println(max.maxProductSubArray(arr))

}
