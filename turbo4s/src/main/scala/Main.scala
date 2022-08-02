import com.ctjsoft.turbo4s.bo._
import com.ctjsoft.turbo4s.util._


@main def hello: Unit =
  println("Hello world!")
  println(msg)
  val ele = ElementInstance("e1", "name", null, 0)
  println(ele)
  val e2 = ElementInstance("e2", 0)
  println(e2)
  val e3 = ElementInstance
  println(e3)
  val fb: FlowBasicInfo = FlowInfo("xxx", "aaa", "bbb", "ccc", "ccd")
  println(fb)
  val key = RegexUtil.extractOriginalNodeKey("abc_123123")
  key.map(println)

  val sg = new StrongUuidGenerator
  println(sg.getNextId)

def msg = "I was compiled by Scala 3. :)"
