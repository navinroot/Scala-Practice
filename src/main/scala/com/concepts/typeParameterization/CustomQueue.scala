package com.concepts.typeParameterization

class CustomQueue[T] private (
                    private val leading:List[T],
                    private val trailing:List[T]
                    ) {


  /**
   * Adding auxilury constructor because primary constructor is private
   * @return
   */
  def this() = this(Nil,Nil)
  def this(elements:T*)=this(elements.toList,Nil)

  private def mirror:CustomQueue[T] ={
    if(leading.isEmpty){
      new CustomQueue(trailing.reverse,Nil)
    }else{
      this
    }
  }

  def head =mirror.leading.head

  def tail:CustomQueue[T] ={
    val q = mirror
    new CustomQueue(q.leading.tail,q.trailing)
  }

  def enqueue(x:T) ={
    new CustomQueue[T](leading,x::trailing)
  }

}


object CustomQueue{

  //construct a Queue with initial value
  def apply[T](xs:T*): CustomQueue[T] = new CustomQueue(xs.toList, Nil)


  /**
   * we can over load apply method and create multiple factory method
   */
  //def apply[T](leading: List[T]): CustomQueue[T] = new CustomQueue(leading, Nil)

}
