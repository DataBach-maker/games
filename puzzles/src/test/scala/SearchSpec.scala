import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class SearchSpec extends AnyWordSpec with Matchers {

  var term                   = Array(-1, 2, 3, 100, 5, 0)
  var searchTermSuccess: Int = 2
  var searchTermFailure: Int = -2

  "Search" should {

    "return the correct result for no-cheat Code linear search" in {
      val success = Search.linar_noCheatCode(term, searchTermSuccess)
      success shouldEqual (2, 1)

      val failure = Search.linar_noCheatCode(term, searchTermFailure)
      failure shouldEqual "Could not be found"
    }

    "return the correct result for no-cheat Code binary search" in {
      val success = Search.binary_noCheatCode(term, searchTermSuccess)
      success shouldEqual (2, 1)

      val failure = Search.binary_noCheatCode(term, searchTermFailure)
      failure shouldEqual "Could not be found"
    }

    "return the correct result for optimized linear search" in {
      val success = Search.linear_optimized(term, searchTermSuccess)
      success shouldEqual (2, 1)

      val failure = Search.linear_optimized(term, searchTermFailure)
      failure shouldEqual "Could not be found"
    }

    "return the correct result for optimized binary search" in {
      val success = Search.linear_optimized(term, searchTermSuccess)
      success shouldEqual (2, 1)

      val failure = Search.linear_optimized(term, searchTermFailure)
      failure shouldEqual "Could not be found"
    }

  }
}