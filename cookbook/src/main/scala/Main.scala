@main def hello: Unit = 
  println("Hello world!")
  println(msg)

  val p:Printable = new PdfPrinter
  p.print

def msg = "I was compiled by Scala 3. :)"
