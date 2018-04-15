package elements

class Rectangle(lines: Seq[String]) extends Element {

  override def contents: Seq[String] = lines.map { line =>
    val missing = width - line.length
    val left = missing / 2
    val right = missing - left
    " " * left + line + " " * right
  }

  override def height: Int = lines.size

  override def width: Int = lines.map(_.length).max
}
