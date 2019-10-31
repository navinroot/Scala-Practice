package com.concepts.dynamicProgramming


/**
 * Given two strings str1 and str2 and below operations that can performed on str1.
 * Find minimum number of edits (operations) required to convert ‘str1’ into ‘str2’.
 * 1. Insert
 * 2. Remove
 * 3. Replace
 *
 *
 */
object MinimumEditProblem {

  def minEdit(str1:String,str2:String):Int={
    val l1 = str1.length
    val l2 = str2.length
    val arrayCount=Array.ofDim[Int](l1+1,l2+1)

    for(i<- 0 to l1){
      for(j <- 0 to l2){
        if(i==0){
          arrayCount(i)(j)=j
        }
        else if(j==0){
          arrayCount(i)(j)=i
        }
        else if(str1(i-1)==str2(j-1)){
          arrayCount(i)(j)=arrayCount(i-1)(j-1)
        }
        else {
          arrayCount(i)(j)= 1+ min(arrayCount(i-1)(j),arrayCount(i)(j-1),arrayCount(i-1)(j-1))
        }
      }
    }
    arrayCount(l1)(l2)
  }

  private def min(x:Int, y:Int,z:Int):Int={
    Math.min(x,Math.min(y,z))
  }


  def main(args: Array[String]): Unit = {
    // your code goes here
    val str1 = "sunday"
    val str2 = "saturday"
    println(minEdit(str1,str2))

  }
}
