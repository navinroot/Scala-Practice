package com.concepts.dynamicProgramming

object LongestIncreasingSubsequence {

  def longestIncSubUsingRecursion(arr:Array[Int]): Int ={
    val len = arr.length
    val countArray =Array.fill[Int](len)(1)

    for(i<- 1 until  len){
      for(j<- 0 to i){
        if(arr(i)>arr(j) && countArray(i)<countArray(j)+1){
          countArray(i)=countArray(j)+1
        }

      }
    }
    countArray.max
  }

  def main(args: Array[String]): Unit = {
    val arr = Array( 10, 22, 9, 33, 21, 50, 41, 60 );
    println(longestIncSubUsingRecursion(arr))

  }


}
