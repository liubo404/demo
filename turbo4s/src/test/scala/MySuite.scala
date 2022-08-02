// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
import com.ctjsoft.turbo4s.util._

class MySuite extends munit.FunSuite {
  test("example test that succeeds") {
    val obtained = 42
    val expected = 42
    assertEquals(obtained, expected)
  }

  test("begin of dashed string") {
    val dashed = "isdfsd_1231231"
    val obtained = RegexUtil.extractOriginalNodeKey(dashed)
    val expected = Some("isdfsd")
    assertEquals(obtained, expected)
  }
}
