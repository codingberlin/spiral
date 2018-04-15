package spiral

import elements.{Bar, Element, Line, Single}

class Spiral(size: Int) extends Element {

  private def line = new Line('-', size - 1)
  private def bar = new Bar('|', size - 1)
  private def marginBar = new Bar(' ', size - 1)
  private def marginLine = new Line(' ', size - 1)

  override def height: Int = size

  override def width: Int = size

  override def contents: Seq[String] = {
    val edge = new Single('+')

    if (size == 1)
      return edge.contents

    val innerSpiral = new Spiral(size - 1)

    val spiral =
      if (size % 4 == 2)
        edge beside line above innerSpiral
      else if (size % 4 == 3)
        innerSpiral beside (edge above bar)
      else if (size % 4 == 0)
        marginBar beside innerSpiral above (line beside edge)
      else
        bar above edge beside (marginLine above innerSpiral)

    spiral.contents
  }

}
