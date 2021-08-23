class Car (milesPerGallon: Int, gallonsPerTank: Int) {

  var mpg: Int = milesPerGallon
  var gpt: Int = gallonsPerTank
  var mpt: Int = 0

  def milesPerTank(): Unit = {
    mpt = mpg * gpt
    println("Number of Miles Per Tank " + mpt)
  }
}

object Volvo {

  def min(args: Array[String]): Unit = {
    val volvo = new Car(40, 10)
    volvo.milesPerTank()
  }
}
