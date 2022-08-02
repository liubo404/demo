trait Printable:
  def print: Unit

class PdfPrinter extends Printable:
  def print = println("hello trait")
  def test = for i <- 1 to 5 do println(i)
  def test2 = for i <- 1 until 5 do println(i)

