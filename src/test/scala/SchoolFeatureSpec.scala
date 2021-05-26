import org.scalatest.featurespec.AnyFeatureSpec
import org.scalatest.GivenWhenThen
import org.scalatest.matchers.should.Matchers

class SchoolFeatureSpec extends AnyFeatureSpec with GivenWhenThen with Matchers {
  Feature("School") {
    val principal = Principal("Ms. Rodrigues")

    val grade1A = Classroom(1, "A")
    val grade1B = Classroom(1, "B")

    val anitaTeacher = Teacher("Anita", grade1A)
    val stephenTeacher = Teacher("Stephen", grade1B)

    val james = Student("James", anitaTeacher)
    val becca = Student("Becca", anitaTeacher)
    val jacine = Student("Jacine", stephenTeacher)
    val mark = Student("Mark", stephenTeacher)

    Scenario("A class teacher should only be able to see students of her class") {
      Given("We have students in a school")
      val schoolStudents: List[Student] = List(james, becca, jacine, mark)
      val school = School(schoolStudents)

      When("A class teacher logs in to see her students details")
      val teachersStudents = school.viewStudents(anitaTeacher)

      Then("She should only be able to see students of her class")
      teachersStudents should contain only (james, becca)
    }

    Scenario("A principal should be able to see all the students of the school") {
      Given("We have students in a school")
      val schoolStudents: List[Student] = List(james, becca, jacine, mark)
      val school = School(schoolStudents)

      When("A principal logs in to see her students details")
      val principalsStudents = school.viewStudents(principal)

      Then("She should only be able to see students of her class")
      principalsStudents should contain allOf (james, becca, jacine, mark)
    }

    Scenario("A student should be able to see only its details") {
      Given("We have students in a school")
      val schoolStudents: List[Student] = List(james, becca, jacine, mark)
      val school = School(schoolStudents)

      When("A student logs in to see its details")
      val student = school.viewStudents(becca)

      Then("Student should only be able to its details")
      student should contain only (becca)
    }
  }
}
