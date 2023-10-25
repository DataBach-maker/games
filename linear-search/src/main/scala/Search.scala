object Search extends App {

  // first attempt: could be more functional
  def linar_noCheatCode(term: Array[Int], searchTerm: Int): Any = {

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
  def linear_optimized(term: Array[Int], searchTerm: Int): Any = {

    term.zipWithIndex.find(_._1 == searchTerm) match {
      case Some((value, index)) => (value, index)
      case None                 => "Could not be found"
    }

  }

  def binary_noCheatCode(term: Array[Int], searchTerm: Int): Any = {

    val termLength: Int = term.length;

    // binary Search assumes the array is sorted
    val sortedTerm = term.sorted;

    var leftIndex: Int  = 0;
    var rightIndex: Int = termLength;

    var foundValueAndIndex        = (0, 0);
    var couldNotFindValueAndIndex = "Could not be found";

    while (leftIndex <= rightIndex) {
      val middleIndex: Int = leftIndex + (rightIndex - leftIndex) / 2

      if (sortedTerm(middleIndex) == searchTerm) {
        // substract 1 from middleIndex, because index arrays start at 0
        foundValueAndIndex = (searchTerm, middleIndex - 1)
        return foundValueAndIndex

      } else if (sortedTerm(middleIndex) < searchTerm) {
        leftIndex = middleIndex + 1

      } else {
        rightIndex = middleIndex - 1
      }

    }
    couldNotFindValueAndIndex
  }

  def binary_optimized(term: Array[Int], searchTerm: Int): Any = {
    val sortedTerm = term.sorted
    val index      = java.util.Arrays.binarySearch(sortedTerm, searchTerm)
    // binarySearch returns negative index if the value is not found
    if (index >= 0) (searchTerm, index) else "Could not be found"
  }
}
