import lab3.Maps
import org.scalatest.{FunSuite, Matchers}

import scala.collection.mutable

class MapsTest extends FunSuite with Matchers{

  test("test class User"){
    val t = new Maps.User("Nikita", 19)
    t.name shouldBe "Nikita"
    t.age shouldBe(19)
  }

  test("test method testGroupUsers"){
    Maps.testGroupUsers(Seq(Maps.User("Nik", 20), Maps.User("ita", 19))) shouldBe mutable.HashMap("ita" -> 19, "Nik" -> 20)
  }

  test("test method testNumberFrodos"){
    Maps.testNumberFrodos(Map("a" -> Maps.User("Adam", 1), "b" -> Maps.User("Nik", 20), "c" -> Maps.User("ita", 19))) shouldBe 1
  }

  test("test method testUnderaged") {
    Maps.testUnderaged(Map("a" -> Maps.User("Adam", 65), "b" -> Maps.User("Nik", 20), "c" -> Maps.User("ita", 19))) should not be empty
  }
}
