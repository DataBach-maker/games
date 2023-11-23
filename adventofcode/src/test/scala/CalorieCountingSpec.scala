import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class CalorieCountingSpec extends AnyWordSpec with Matchers {

  "Calorie Counting" should {

    "return the correct result for the first part" in {

      val calories = Array(Some(1000), Some(2000), Some(3000), None, Some(5000), Some(6000), Some(7000), Some(8000))

      val success = CalorieCounting.findStrongestElf(calories)
      success shouldEqual 2

    }
  }
}
