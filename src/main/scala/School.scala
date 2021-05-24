case class Classroom(grade: Int, section: String)

trait Role
case class Principal(name: String) extends Role
case class Teacher(name: String, classroom: Classroom) extends Role
case class Student(name: String, classTeacher: Teacher) extends Role

class School(students: List[Student]):
  def viewStudents(viewingUser: Role): List[Student] =
    viewingUser match {
      case _: Principal => students
      case ct@Teacher(name, classroom) => students.filter(_.classTeacher == ct)
      case st@Student(name, classTeacher) => students.filter(_ == st)
    }