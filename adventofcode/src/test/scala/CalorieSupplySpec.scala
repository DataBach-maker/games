import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class CalorieSupplySpec extends AnyWordSpec with Matchers {

  /* Test Spec for CalorieSupply.scala */

  "Calorie Supply" should {

    val supplyCalories = Array(Some(1000), Some(2000), Some(3000), None, Some(4000), None, Some(5000), Some(6000), None, Some(7000), Some(8000), Some(9000), None, Some(10000))
    val expectedValue = (4, 24000)

    "find the strongest elf" in {

      // assert that the strongest elf is the fourth elf
      val strongestElf = CalorieSupply.findStrongestElf_noCheatCode(supplyCalories)
      strongestElf shouldEqual expectedValue

      // Note: This function could be optimized by avoiding the use of slice and flatten inside the loop. Currently,
      // it is no accounted for the case that two or more elfs might be the strongest elf simultaneously.
    }

    "find the strongest elf optimized" in {

      // assert that the strongest elf is the fourth elf
      val strongestElf = CalorieSupply.findStrongestElf_optimized(supplyCalories)
      strongestElf shouldEqual expectedValue

      // Note: This function is an optimized version of findStrongestElf_noCheatCode. It avoids the use of slice and
      // flatten inside the loop, resulting in a time complexity of O(n). Currently, it is no accounted for the case
      // that two or more elfs might be the strongest elf simultaneously.
    }

  }

}

