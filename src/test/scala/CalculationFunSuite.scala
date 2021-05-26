import org.scalatest.funsuite.*

class CalculationFunSuite extends AnyFunSuite {
  test("Add") {
    val calculation = Calculation()
    assert(calculation.add(2, 5) === 7)
  }
}
