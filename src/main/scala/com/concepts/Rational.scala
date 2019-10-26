package com.concepts

class Rational(n: Int, d: Int) {
  require(d != 0)

  private val gcd: Int = greatestCommonDevisor(n.abs, d.abs)
  val numer: Int = n / gcd
  val denom: Int = d / gcd



  // call of primary constructor because print is not part of anf method or instance variable
  println(s"create object with numerator $n and denominator $d")

  /**
   * defining Auxiliary constructor
   *
   * @param n
   */
  def this(n: Int) = this(n, 1)


  def add(that: Rational): Rational = {
    new Rational(
      numer * that.denom + that.numer * denom,
      that.denom * denom
    )
  }

  /**
   * defining + operator for class
   *
   * @param that
   * @return
   */
  def +(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  /**
   *  operator or method overloading
   *
   * @param i
   * @return
   */
  def +(i: Int): Rational =
    new Rational(numer + i * denom, denom)

  def -(that: Rational): Rational =
    new Rational(
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )

  def -(i: Int): Rational =
    new Rational(numer - i * denom, denom)

  def *(that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)

  def *(i: Int): Rational =
    new Rational(numer * i, denom)

  def /(that: Rational): Rational =
    new Rational(numer * that.denom, denom * that.numer)

  def /(i: Int): Rational =
    new Rational(numer, denom * i)

  def max(that: Rational) = {
    if (this.lessThan(that)) that else this
  }

  def lessThan(that: Rational): Boolean = {
    this.numer * that.denom < this.denom * that.numer
  }

  override def toString: String = n + " /" + d

  private def greatestCommonDevisor(a: Int, b: Int): Int = {
    if (b == 0) a else greatestCommonDevisor(b, a % b)
  }


}

object Rational extends App {

  implicit def intToRational(x: Int) = new Rational(x)
  val oneHalf = new Rational(1, 2)
  val twoThirds = new Rational(2, 3)

  oneHalf add twoThirds

  val useAuxiliaryConstructor = new Rational(2)

  // implicit conversion example
  val r = new Rational(2,3)
  val implicitConversionExample=2 * r

}