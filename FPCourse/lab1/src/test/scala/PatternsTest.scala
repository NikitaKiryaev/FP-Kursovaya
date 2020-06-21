import lab1.Patterns
import org.scalatest.{FunSuite, Matchers}

class PatternsTest extends FunSuite with Matchers {

  test("test method intToString") {
    Patterns.intToString(3) shouldBe "it is three"
  }

  test("test method testIntToString") {
    Patterns.testIntToString(3) shouldBe "it is three"
  }

  test("test method isMaxAndMoritz") {
    Patterns.isMaxAndMoritz("Max") shouldBe true
  }

  test("test method testIsMaxAndMoritz") {
    Patterns.testIsMaxAndMoritz("max") shouldBe true
  }

  test("test method isEvenNumber") {
    Patterns.isEvenNumber(9) shouldBe false
  }

  test("test method testIsEven") {
    Patterns.testIsEven(4) shouldBe true
  }

  test("test method winsA") {
    Patterns.winsA(Patterns.Scissor, Patterns.Rock) shouldBe Patterns.Lose
  }

  test("test method testWinsA"){
    Patterns.testWinsA(Patterns.Scissor, Patterns.Rock) shouldBe Patterns.Lose
  }

  test("test method getMammalWeight"){
    Patterns.getMammalWeight(Patterns.Mammal("cat", Patterns.Meat, 5)) shouldBe 5
  }

  test("test method testExtractMammalWeight"){
    Patterns.testExtractMammalWeight(Patterns.Mammal("cat", Patterns.Meat, 5)) shouldBe 5
  }

  test("test method updateFood"){
    Patterns.updateFood(Patterns.Fish("fish", Patterns.Plants)) shouldBe Patterns.Fish("fish", Patterns.Plants)
  }

  test("test method testUpdateFood"){
    Patterns.testUpdateFood(Patterns.Fish("fish", Patterns.Plants)) shouldBe Patterns.Fish("fish", Patterns.Plants)
  }
}
