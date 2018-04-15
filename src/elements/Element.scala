package elements

trait Element {
  def contents: Seq[String]
  def height: Int
  def width: Int

  def heighten(additional: Int): Element = {
    val top = additional / 2
    val bottom = additional - top
    val enhanced = (0 until top).map(_ => " ") ++
      contents ++
      (0 until bottom).map(_ => " ")
    new Rectangle(enhanced)
  }

  def above(bottom: Element): Element =
    new Rectangle(contents ++ bottom.contents)

  def beside(right: Element): Element = {
    val missingLeft = Math.max(0, right.height - height)
    val missingRight = Math.max(0, height - right.height)
    val enhancedLeft = heighten(missingLeft)
    val enhancedRight = right.heighten(missingRight)
    val enhancedContents =
      (enhancedLeft.contents zip enhancedRight.contents).map {
        case (l, r) => l + r
      }
    new Rectangle(enhancedContents)
  }

  override def toString: String = contents.mkString("\n")
}
