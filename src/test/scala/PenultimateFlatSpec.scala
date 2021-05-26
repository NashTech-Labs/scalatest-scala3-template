import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PenultimateSpec extends AnyFlatSpec with Matchers {
  "Penultimate object" should "help in finding the penultimate element" in {
    val ints =  List(1,2,3,4,5,6,7)

    Penultimate.penultimate(ints) shouldBe Some(6)
  }

  it should "return None if the list is empty" in {
    Penultimate.penultimate(Nil) shouldBe None
  }

  it should "return None if the list is of size 1" in {
    Penultimate.penultimate(List(1)) should be (empty)
  }
}
