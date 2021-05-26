object Duplicate:
  def doDuplicate[T](elements: List[T]): List[T] =
    elements.foldRight(List[T]()) {(l, r) => l :: l :: r}