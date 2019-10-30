package com.concepts.dynamicProgramming

/**
 *  for given Array of number {2,4,6,10}
 *  find out how many sum of number of combination are possible for number N
 *
 */


object CombinationOfSumOfNumber {

  def numberOfCombination(n:Int):Int={
    val numberArray =Array[Int](2,4,6,10)
    val countArray = Array.fill[Int](n+1)(0)
    countArray(0)=1

    for( i<- 1 to n){
      for(j <- numberArray.indices){
        if(i>=numberArray(j)){
          countArray(i) += countArray(i-numberArray(j))
        }
      }

    }
    countArray(n)
  }

  def main(args: Array[String]): Unit = {
    println(numberOfCombination(10))
  }


}
