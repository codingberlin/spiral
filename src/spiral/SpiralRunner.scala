package spiral

import elements._

object SpiralRunner extends App {

  val name = "Spiral Runner"
  val line = new Line('*', name.length + 2)
  val bar = new Bar('*', 3)
  val empty = new Line(' ', 4)

  val header = bar beside (line above new Label(name) above line) beside bar
  val spirals = (2 to 10)
    .foldLeft[Element](new Spiral(1)) {
      case (spirals: Element, size: Int) =>
        spirals beside empty beside new Spiral(size)
    }

  val elements = header above empty above spirals

  println(elements)
}
