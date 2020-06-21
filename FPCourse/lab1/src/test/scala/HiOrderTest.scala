import lab1.HiOrder
import org.scalatest.{FunSuite, Matchers}

class HigherOrderTest extends FunSuite with Matchers{

  test("test function plus"){
    HiOrder.plus(9, 10) shouldBe 19
  }

  test("test  function multiply"){
    HiOrder.multiply(4, 5) shouldBe 20
  }

  test("test method nTimes"){
    HiOrder.nTimes(HiOrder.plus, 5, 20, 10) shouldBe 250
  }

  test("test method testNTimes"){
    HiOrder.testNTimes(HiOrder.multiply, 5, 5, 5) shouldBe 125
  }

  test("test method testAnonymousNTimes"){
    HiOrder.testAnonymousNTimes(5, 5, 5) shouldBe 25
  }

}
