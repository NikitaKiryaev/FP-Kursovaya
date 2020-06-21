import lab2.RecursiveFunctions
import org.scalatest.{FunSuite, Matchers}

class RecursiveFunctionsTest extends FunSuite with Matchers{

  test("test method length"){
    RecursiveFunctions.length(List("length")) shouldBe 1
  }

  test("test method reverse"){
    RecursiveFunctions.reverse(List(10, 20, 30, 40)) shouldBe List(40, 30, 20, 10)
  }

  test("test method testReverse"){
    RecursiveFunctions.testReverse(List(1, 2)) shouldBe List(2, 1)
  }

  test("test method map"){
    RecursiveFunctions.map(List(1, -2, 3, -4, 5))((i:Int) => if(i < 0) i * -1 else i ) shouldBe List(1, 2, 3, 4, 5)
  }

  test("test method testMap"){
    RecursiveFunctions.testMap((List(1, -2, 3, -4, 5)), ((i:Int) => if(i < 0) i * -1 else i )) shouldBe List(1, 2, 3, 4, 5)
  }

  test("test method append"){
    RecursiveFunctions.append(List(10, 20, 30), List(40, 50, 60)) shouldBe List(10, 20, 30, 40, 50, 60)
  }

  test("test method testAppend"){
    RecursiveFunctions.testAppend(List(), List()) shouldBe empty
  }

  test("test method flatMap"){
    RecursiveFunctions.flatMap(List(1, -2, -3, -4, 5))((i:Int) => List(i)).size shouldBe 5
  }

  test("test method testFlatMap"){
    RecursiveFunctions.testFlatMap(List(1, -2, -3, -4, 5),((i:Int) => List(i))).size shouldBe 5
  }
}
