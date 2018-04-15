package elements

class Bar(symbol: Char, override val height: Int) extends Element {

  override def contents: Seq[String] =
    (symbol.toString * height).toSeq.map(_.toString)

  override def width: Int = 1
}
