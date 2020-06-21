import lab3.Adts
import org.scalatest.{FunSuite, Matchers}

import scala.util.Success


class AdtsTest extends FunSuite with Matchers{

  test("test method testGetNth"){
    Adts.testGetNth(List(10, 20, 30, 40, 50, 60), 5) shouldBe Some(60)
  }

  test("test exception testGetNth"){
    a[IndexOutOfBoundsException] should be thrownBy(Adts.testGetNth(List(1, 2, 3), 5))
  }

  test(" test method Double"){
    Adts.Double(Option(2)) shouldBe Some(4)
  }

  test(" test method testDouble"){
    Adts.testDouble(Option(10)) shouldBe Some(20)
  }

  test("test method IsEven"){
    Adts.IsEven(15) shouldBe Left("Нечетное число")
  }

  test("test method testIsEven"){
    Adts.IsEven(-22) shouldBe Right(-22)
  }

  test("test method SafeDivide"){
    Adts.SafeDivide(16, 4) shouldBe Right(4)
  }

  test("test method testSafeDivide"){
    Adts.testSafeDivide(13, 0) shouldBe Left("Вы не можете делить на ноль.")
  }

  test("test method GoodOldJava"){
    Adts.GoodOldJava((i: String) => if(i.equals("done")) -1 else 0, "done") shouldBe Success(-1)
  }

  test("test method testGoodOldJava"){
    Adts.GoodOldJava((i: String) => if(i.equals("done")) 1 else 0, "one") shouldBe Success(0)
  }

}
