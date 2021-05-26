import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers._

class DuplicateFunSpec extends AnyFunSpec {
  describe("The Duplicate") {
    describe("when passed a list") {
      it("should duplicate all the elements of the list") {
        Duplicate.doDuplicate(List(1,2,3)) shouldBe List(1,1,2,2,3,3)
      }
    }
  }

}
