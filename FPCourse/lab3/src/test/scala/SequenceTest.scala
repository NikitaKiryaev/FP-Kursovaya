import lab3.Sequence
import org.scalatest.{FunSuite, Matchers}

class SequenceTest extends FunSuite with Matchers{

  test("test method testLastElement"){
    Sequence.testLastElement(Seq(11, 22, 33, 47, 551, 15)) shouldBe Some(15)
  }

  test("test method testZip"){
    Sequence.testZip(Seq(11, 45, 131), Seq(24, 67, 653)) shouldBe List((11, 24), (45, 67), (131, 653))
  }

  test("test method testForAll"){
    Sequence.testForAll(Seq(5, 10, 15, 25))((i: Int) => i % 5 == 0) shouldBe true
  }

  test("test method testPalindrom"){
    Sequence.testPalindrom(Seq(12, 134, 45, 7, 45, 134, 12)) shouldBe true
  }
}
