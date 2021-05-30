object FizzBuzz {

  def returnFizzBuzz(n: Int): Int | String =
    if n % 3 == 0 && n % 5 == 0 then "FizzBuzz"
    else if n % 3 == 0 then "Fizz"
    else if n % 5 == 0 then "Buzz"
    else n

  def returnFizzBuzzList(limit: Int): Seq[Int | String] =
    (1 to limit).map(returnFizzBuzz)

}
