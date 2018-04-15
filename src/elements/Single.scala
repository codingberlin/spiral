package elements

class Single(symbol: Char) extends Element {

  override def contents: Seq[String] = Seq(symbol.toString)

  override def height: Int = 1

  override def width: Int = 1
}
