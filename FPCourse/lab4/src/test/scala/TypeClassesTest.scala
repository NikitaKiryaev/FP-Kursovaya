import lab4._
import org.scalatest.{FunSuite, Matchers}

class TypeclassesTest extends FunSuite with Matchers{

  test("test method revers"){
    TypeClasses.reverse("name":String)(TypeClasses.Reversable.ReversableString) shouldBe "eman"
  }

  test("test method testReversableString"){
    TypeClasses.testReversableString("Cat") shouldBe "taC"
  }

  test("test method smash"){
    TypeClasses.smash(3.5, 3.5)(TypeClasses.Smash.SmashDouble) shouldBe 12.25
  }

  test("test method testSmashInt"){
    TypeClasses.testSmashInt(2, 3) shouldBe 5
  }

  test("test method testSmashDouble"){
    TypeClasses.testSmashDouble(3.5, 3.5) shouldBe 12.25
  }

  test("test method testSmashString"){
    TypeClasses.testSmashString("nik", "ita") shouldBe "nikita"
  }

  test("test method reverse"){
    TypeClasses.Reversable.ReversableString.reverse("name") shouldBe "eman"
  }
  test("test method smash in implication object SmashInt"){
    TypeClasses.Smash.SmashInt.smash(23, 23) shouldBe 46
  }

  test("test method smash in implication object SmashDouble"){
    TypeClasses.Smash.SmashDouble.smash(3.3, 5.7) shouldBe(18.81)
  }

  test("test method smash in implication object SmashString"){
    TypeClasses.Smash.SmashString.smash("Hi ", "Mark!") shouldBe "Hi Mark!"
  }
}
