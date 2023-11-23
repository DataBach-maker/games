object Search extends App {

  /**
   * Linear search algorithm that iterates through the array and compares each element to the search term.
   * Note: Could be more Functional by using a recursive function.
   *
   * @param term The array of integers to search.
   * @param searchTerm The integer to search for.
   * @return A tuple of the found value and its index, or a string indicating that the value could not be found.
   */

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

  /**
   * Optimized linear search algorithm that uses the `find` method to search for the integer.
   *
   * @param term The array of integers to search.
   * @param searchTerm The integer to search for.
   * @return A tuple of the found value and its index, or a string indicating that the value could not be found.
   */

  def linear_optimized(term: Array[Int], searchTerm: Int): Any = {

    term.zipWithIndex.find(_._1 == searchTerm) match {
      case Some((value, index)) => (value, index)
      case None                 => "Could not be found"
    }

  }

  /**
   * Binary search algorithm that assumes the array is sorted and uses a divide-and-conquer approach to find the search term.
   *
   * @param term The array of integers to search.
   * @param searchTerm The integer to search for.
   * @return A tuple of the found value and its index, or a string indicating that the value could not be found.
   */

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

  /**
   * Optimized binary search algorithm that assumes the array is sorted and uses the `binarySearch` method to find the search term.
   *
   * @param term The array of integers to search.
   * @param searchTerm The integer to search for.
   * @return A tuple of the found value and its index, or a string indicating that the value could not be found.
   */
  
  def binary_optimized(term: Array[Int], searchTerm: Int): Any = {
    val sortedTerm = term.sorted
    val index      = java.util.Arrays.binarySearch(sortedTerm, searchTerm)
    // binarySearch returns negative index if the value is not found
    if (index >= 0) (searchTerm, index) else "Could not be found"
  }
}
