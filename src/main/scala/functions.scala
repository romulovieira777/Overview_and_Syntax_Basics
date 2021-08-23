object functions extends App {

  def multiplyInt(d: Int, f: Int): Int = {
    var result = d * f
    return result
  }

  println(multiplyInt(4, 6))

  val myMultiply = (d: Int, f: Int) => d * f
  println(multiplyInt(7, 8))

}
