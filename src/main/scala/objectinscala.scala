import java.io._
import scala.math

object objectinscala extends App {

  val d = 4
  println(d)

  var g = "Something"
  println(g)

  val adder = (j: Int, k: Int) => j + k
  println(adder(3, 4))

}

class Ball (diameter: Double) {
  var d: Double = diameter
  var c: Double = 0

  def calcCircumference(): Unit = {
    c = Pi * d
    println("Circumference of ball: " + c + " cm")
  }
}

object TennisBall {
  def main(args: Array[String]): Unit = {
    val tennisBall = new Ball(6.7)
    tennisBall.calcCircumference()
  }
}