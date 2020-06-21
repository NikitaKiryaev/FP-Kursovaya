import lab2.RecursiveData
import org.scalatest.concurrent.Eventually
import org.scalatest.{FunSuite, Matchers}

class RecursiveDataTest extends FunSuite with Matchers with Eventually{

  test("test method isEmpty"){
    RecursiveData.isEmpty(List(1, 3, 10)) shouldBe true
  }

  test("test method testListIntEmpty"){
    RecursiveData.testListIntEmpty(List()) shouldBe false
  }

  test("test method isEmptyHead"){
    RecursiveData.isEmptyHead(List()) shouldBe -1
  }

  test("test method testListIntHead"){
    RecursiveData.testListIntHead(List(45, 8, 7)) shouldBe 45
  }

  test("test method ListNotIsEmpty"){
    RecursiveData.ListNotIsEmpty(1, Nil) should not be empty
  }

  test("test method ListNotIsEmpty()"){
    RecursiveData.ListNotIsEmpty(4, List(4, 5, 6)) shouldBe List(4, 5, 6)
  }

  test("test class Tree"){
    val a = new RecursiveData.Tree[Int](new RecursiveData.Tree[Int](null, null, 24), null, 1)
    a.LeftNode.leaf shouldBe 24
  }

}
