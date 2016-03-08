package chapter2

object Loops {

  def factorial(n: Int): Int = {
    def rec(x: Int, acc: Int): Int =
      if(x <= 0) acc
      else rec(x-1, acc * x)
    rec(n, 1)
  }


}
