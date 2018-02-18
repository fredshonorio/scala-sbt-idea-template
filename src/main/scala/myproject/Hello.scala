package myproject

object Hello {

  def add(a: Int, b: Int) = a + b
  def add2(a: String, b: String) : String = a + b

  def doThing(): Unit = {
    println("")
  }

  def main(args: Array[String]): Unit = {
    println("Heyo")
  }
}
