package com.concepts.dynamicProgramming

object FibonacciSeriesUsingDp {

  //using normal recursion where it does redundant computation
  // time complexity exponential - 2 power n
  private def fibonacciUsingRecursrion(n:Int):Int={
    var result=0
    if(n ==1 || n==0){
      result = n
    }
    else {
      result=fibonacciUsingRecursrion(n-1)+fibonacciUsingRecursrion(n-2)
    }
    result
  }

  /**
   *  fibonacci using DP memoized solution
   *
   */
  private def fibonacciUsingDPMemoizedApproach(n:Int,arr:Array[Int]):Int={
    var result =0
    if(arr(n)!=0){
       return arr(n)
    }
    if(n==1||n==0){
      result=n
    }else{
      result = fibonacciUsingDPMemoizedApproach(n-1,arr)+fibonacciUsingDPMemoizedApproach(n-2,arr)
    }
    result
  }




  /**
   * fibonacci using DP (Bottom up approach)
   *
   *
   * @param n
   * @return
   */
  private def fibonacciUsingDP(n:Int)={
    val solutionArray = Array.fill[Int](n+1)(0)
    solutionArray(0)=0
    solutionArray(1)=1
    for (i<- 2 to n){
      solutionArray(i)=solutionArray(i-1)+solutionArray(i-2)
    }

    solutionArray(n)
  }

  def main(args: Array[String]): Unit = {
    println(fibonacciUsingDP(10))
    println(fibonacciUsingRecursrion(10))
  }



}
