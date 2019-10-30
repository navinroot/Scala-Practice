package com.concepts.dynamicProgramming

import scala.collection.mutable


object LongestCommonSubsequence {


  /**
   * lcs using recursion
   *
   * @param str1
   * @param str2
   * @param l1
   * @param l2
   * @return
   */
  def findLcsUsingRecursion(str1:String,str2:String,l1:Int,l2:Int):Int={
    var result=0
    if(l1==0 || l2==0){
      return 0
    }
    if(str1(l1-1)==str2(l2-1)){
      result = 1+findLcsUsingRecursion(str1,str2,l1-1,l2-1)
    }else{
      result = Math.max(findLcsUsingRecursion(str1,str2,l1-1,l2),findLcsUsingRecursion(str1,str2,l1,l2-1))
    }
    result
  }

  /**
   * lcs using recursion dynamic Programming memoized approach
   *
   * @param str1
   * @param str2
   * @param l1
   * @param l2
   * @return
   */
  def findLcsUsingRecursionMemoizedApproach(str1:String,str2:String,l1:Int,l2:Int,map:mutable.Map[String,Int]):Int={
    var result=0
    val mapKey=l1+":"+l2
    if(l1==0 || l2==0){
      return 0
    }
    if(map.contains(mapKey)){
      return map(mapKey)
    }
    if(str1(l1-1)==str2(l2-1)){
      result = 1+findLcsUsingRecursion(str1,str2,l1-1,l2-1)
    }else{
      result = Math.max(findLcsUsingRecursion(str1,str2,l1-1,l2),findLcsUsingRecursion(str1,str2,l1,l2-1))
    }
    map+=(mapKey->result)
    result
  }

  /**
   * find lcd using dynamicProgramming bottom up approach
   *
   * @param str1
   * @param str2
   */
    def findLcsUsingDPBottomUp(str1:String,str2:String):Int={
      val l1 = str1.length
      val l2 = str2.length
      val countArray = Array.ofDim[Int](l1+1,l2+1)

      for( i<- 0 to l1){
        for(j <- 0 to l2){
          if(i==0 || j==0){
            countArray(i)(j)=0
          }else if(str1(i-1)==str2(j-1)){
            countArray(i)(j)= countArray(i-1)(j-1)+1
          }else{
            countArray(i)(j)=Math.max(countArray(i)(j-1),countArray(i-1)(j))
          }
        }
      }
//      for( i<- 0 to l1){
//        for(j <- 0 to l2){
//          print(" "+countArray(i)(j))
//        }
//        println()
//      }

      countArray(l1)(l2)
    }




  def main(args: Array[String]): Unit = {
    val str1 = "AGGTAB"
    val str2 = "GXTXAYB"
    val map:mutable.Map[String,Int]=mutable.Map.empty

    println(findLcsUsingRecursion(str1,str2,str1.length,str2.length))
    println(findLcsUsingRecursionMemoizedApproach(str1,str2,str1.length,str2.length,map))
    println(findLcsUsingDPBottomUp(str1,str2))
  }

}
