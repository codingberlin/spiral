package spiral

import elements._

object SpiralRunner extends App {

  val name = "Spiral Runner"
  val line = new Line('*', name.length + 2)
  val bar = new Bar('*', 3)

  val header = bar beside (line above new Label(name) above line) beside bar

  println(header)
}
