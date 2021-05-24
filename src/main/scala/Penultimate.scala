/**
 * Find the last but one element of a list.
 * Example:
 * scala> penultimate(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 5
 *
 * http://aperiodic.net/phil/scala/s-99/
 */

object Penultimate {
  def penultimate(ints: List[Int]): Option[Int] = {
    if ints.isEmpty || ints.length < 2 then
      None
    else
      ints.take(ints.length - 1).lastOption
  }
}
