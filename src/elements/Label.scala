package elements

class Label(label: String) extends Element {

  override def contents: Seq[String] = Seq(label)

  override def height: Int = 1

  override def width: Int = label.length
}
