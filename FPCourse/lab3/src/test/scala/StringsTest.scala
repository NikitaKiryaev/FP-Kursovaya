import lab3.Strings
import org.scalatest.{FunSuite, Matchers}

class StringTest extends FunSuite with Matchers{

  test("test method testUppercase"){
    Strings.testUppercase("string") shouldBe "STRING"
  }

  test("test method testInterpolations"){
    Strings.testInterpolations("Nikita", 19) shouldBe ("Hi, my name is Nikita and I am 19 years old.")
  }

  test("test method testCompitation"){
    val a: Int = 130
    val b: Int = 34
    Strings.testComputation(a, b) shouldBe ("Hi,\n" +
      "now follows a quite hard calculation. We try to add:\n" +
      s"  a := $a\n" +
      s"  b := $b\n\n" +
      s"  return $a + $b")
  }

  test("test method testTakeTwo"){
    Strings.testTakeTwo("String test") shouldBe "S"
  }
}
