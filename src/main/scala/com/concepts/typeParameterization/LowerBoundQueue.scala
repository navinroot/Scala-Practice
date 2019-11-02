package com.concepts.typeParameterization

class LowerBoundQueue[+T](
                         private val leading:List[T],
                         private val trailing:List[T]
                         ) {

  def enqueue[U>:T](x:U) ={
    new LowerBoundQueue[U](leading,x::trailing)
  }

}
