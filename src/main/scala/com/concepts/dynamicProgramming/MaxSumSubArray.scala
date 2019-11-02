package com.concepts.dynamicProgramming

class MaxSumSubArray {

  def maxSum(arr:Array[Int])={
    var maxEndingHere =0
    var maxSoFar =0

    for(i <- arr.indices){
      maxEndingHere =maxEndingHere+arr(i)

      if(maxEndingHere<0){
        maxEndingHere=0
      }

      if(maxSoFar < maxEndingHere){
        maxSoFar=maxEndingHere
      }
    }
    maxSoFar
  }

}


object MaxSumSubArray extends App {
  val arr =Array(0,2, -3, 0, -2, 0,-40)
  val max = new MaxSumSubArray()
  println(max.maxSum(arr))
}