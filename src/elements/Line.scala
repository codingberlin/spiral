package elements

class Line(symbol: Char, override val width: Int) extends Element {

  override def contents: Seq[String] = Seq(symbol.toString * width)

  override def height: Int = 1

}
