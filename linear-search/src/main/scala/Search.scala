object Search extends App {

  def linear(term: Array[Int], searchTerm: Int): Any = {
    var foundValueAndIndex        = (0, 0);
    var couldNotFindValueAndIndex = "Could not be found"

    for ((rowIndex, columnIndex) <- term.zipWithIndex) {

      if (rowIndex == searchTerm) {
        foundValueAndIndex = (rowIndex, columnIndex)
        return foundValueAndIndex
      } else if (rowIndex != searchTerm && columnIndex == term.length - 1) {
        return couldNotFindValueAndIndex
      }
    }

  }

  def binary(term: Array[Int], searchTerm: Int): Any = {
    println(term)
  }
}
