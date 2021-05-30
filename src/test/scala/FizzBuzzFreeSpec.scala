import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.matchers.should.Matchers._

class FizzBuzzFreeSpec extends AnyFreeSpec:
  "FizzBuzz" - {
    "when called for single value" - {
      "should tell if the number is FizzBuzz" in {
        FizzBuzz.returnFizzBuzz(15) shouldBe "FizzBuzz"
      }
      "should tell if the number is Fizz" in {
        FizzBuzz.returnFizzBuzz(9) shouldBe "Fizz"
      }
      "should tell if the number is Buzz" in {
        FizzBuzz.returnFizzBuzz(10) shouldBe "Buzz"
      }
      "should return the number as it is when it is neither" in {
        FizzBuzz.returnFizzBuzz(11) shouldBe 11
      }
    }

    "when called for a limit" - {
      "should return the FizzBuzz series until the limit" in {
        FizzBuzz.returnFizzBuzzList(5) shouldBe List(1, 2, "Fizz", 4, "Buzz")
      }
    }
  }
