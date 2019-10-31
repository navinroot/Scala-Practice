package com.concepts.typeParameterization

trait CustomQueueUsingTrait[T] {
  def head: T

  def tail: CustomQueueUsingTrait[T]

  def enqueue(x: T): CustomQueueUsingTrait[T]

}

/**
 * Private constructors and private members are one way to hide the initialization and representation of a
 * class. Another more radical way is to hide the class itself and only export a trait that reveals the public
 * interface of the class.
 *
 *
 */
object CustomQueueUsingTrait {

  def apply[T](xs: T*): CustomQueueUsingTrait[T] = new QueueImpl[T](xs.toList, Nil)

  private class QueueImpl[T](
                              private val leading: List[T],
                              private val trailing: List[T]
                            ) extends CustomQueueUsingTrait[T] {
    override def head: T = mirror.leading.head

    private def mirror = {
      if (leading.isEmpty) {
        new QueueImpl[T](trailing.reverse, Nil)
      } else {
        this
      }
    }

    override def tail: CustomQueueUsingTrait[T] = {
      val q = mirror
      new QueueImpl[T](q.leading.tail, q.trailing)
    }

    override def enqueue(x: T): CustomQueueUsingTrait[T] = {
      new QueueImpl[T](leading, x :: trailing)

    }
  }


}
