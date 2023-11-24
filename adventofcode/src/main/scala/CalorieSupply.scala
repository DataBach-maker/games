object CalorieSupply extends App {

  /**
   * Santa's reindeer typically eat regular reindeer food, but they need a lot of magical energy to deliver presents on
   * Christmas. For that, their favorite snack is a special type of star fruit that only grows deep in the jungle. The
   * Elves have brought you on their annual expedition to the grove where the fruit grows.
   *
   * To supply enough magical energy, the expedition needs to retrieve a minimum of fifty stars by December 25th.
   * Although the Elves assure you that the grove has plenty of fruit, you decide to grab any fruit you see along the
   * way, just in case.
   *
   * Collect stars by solving puzzles. Two puzzles will be made available on each day in the Advent calendar; the
   * second puzzle is unlocked when you complete the first. Each puzzle grants one star. Good luck!
   *
   * The jungle must be too overgrown and difficult to navigate in vehicles or access from the air; the Elves'
   * expedition traditionally goes on foot. As your boats approach land, the Elves begin taking inventory of their
   * supplies. One important consideration is food - in particular, the number of Calories each Elf is carrying
   * (your puzzle input).
   *
   * The Elves take turns writing down the number of Calories contained by the various meals, snacks, rations, etc.
   * that they've brought with them, one item per line. Each Elf separates their own inventory from the previous Elf's
   * inventory (if any) by a blank line.
   *
   * For example, suppose the Elves finish writing their items' Calories and end up with the following list:
   *
   * 1000
   * 2000
   * 3000
   *
   * 4000
   *
   * 5000
   * 6000
   *
   * 7000
   * 8000
   * 9000
   *
   * 10000
   * This list represents the Calories of the food carried by five Elves:
   *
   * The first Elf is carrying food with 1000, 2000, and 3000 Calories, a total of 6000 Calories.
   * The second Elf is carrying one food item with 4000 Calories.
   * The third Elf is carrying food with 5000 and 6000 Calories, a total of 11000 Calories.
   * The fourth Elf is carrying food with 7000, 8000, and 9000 Calories, a total of 24000 Calories.
   * The fifth Elf is carrying one food item with 10000 Calories.
   * In case the Elves get hungry and need extra snacks, they need to know which Elf to ask: they'd like to know how
   * many Calories are being carried by the Elf carrying the most Calories. In the example above,
   * this is 24000 (carried by the fourth Elf).
   *
   * Find the Elf carrying the most Calories. How many total Calories is that Elf carrying?
   */

  def findStrongestElf_noCheatCode(supplyCalories: Array[Option[Int]]): (Int, Int) = {

    /**
     * This function finds the strongest elf in a given array of calorie supplies.
     *
     * @param supplyCalories An array of Option[Int] where each element represents the calorie supply of an elf.
     *                       A value of None indicates the end of one elf's supplies and the start of another's.
     * @return A tuple (Int, Int) where the first element is the index of the strongest elf (1-based index)
     *         and the second element is the maximum calorie intake of the strongest elf.
     *
     *         Time complexity: O(n^2), where n is the length of the supplyCalories array. This is due to the use of
     *         slice operation
     *         inside the loop which can be expensive for large arrays.
     */

    var strongestElf = 0
    var calorieMaximum = 0
    var previousIndex = -1

    val splitIndices = supplyCalories.zipWithIndex.collect {
      case (None, index) => index
    }

    for (index <- splitIndices) {

      strongestElf += 1
      val currentSum = supplyCalories.slice(previousIndex + 1, index).flatten.sum

      if (currentSum > calorieMaximum) {
        calorieMaximum = currentSum
      }
      previousIndex = index
    }
    (strongestElf, calorieMaximum)
  }

  def findStrongestElf_optimized(supplyCalories: Array[Option[Int]]): (Int, Int) = {

    /**
     * This function finds the strongest elf in a given array of calorie supplies in an optimized manner.
     *
     * @param supplyCalories An array of Option[Int] where each element represents the calorie supply of an elf.
     *                       A value of None indicates the end of one elf's supplies and the start of another's.
     * @return A tuple (Int, Int) where the first element is the index of the strongest elf (1-based index)
     *         and the second element is the maximum calorie intake of the strongest elf.
     *
     *         Time complexity: O(n), where n is the length of the supplyCalories array. This is due to the single pass through
     *         the array, making it more efficient than the non-optimized version.
     */

    var currentSum = 0
    var maxSum = 0
    var strongestElf = 0
    var currentElf = 0

    for ((calorie, index) <- supplyCalories.zipWithIndex) {

      calorie match {

        case Some(value) => currentSum += value
        case None =>

          if (currentSum > maxSum) {
            maxSum = currentSum
            strongestElf = currentElf
          }
          currentSum = 0
          currentElf += 1
      }
    }

    // Check the last elf
    if (currentSum > maxSum) {
      maxSum = currentSum
      strongestElf = currentElf
    }

    // Assuming 'elfs' do not starting counting at 0 but at 1 (as in the example)
    (strongestElf + 1, maxSum)
  }

}

