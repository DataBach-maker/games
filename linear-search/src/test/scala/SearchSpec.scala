class Searches extends org.scalatest.funsuite.AnyFunSuite {

  var term = Array(-1, 2, 3, 100, 2, 0)
  var searchTermSuccess: Int = 2
  var searchTermFailure: Int = -2

  test("Search.linear") {
    val success = Search.linear(term, searchTermSuccess)
    assert(success == (2,1))

    val failure = Search.linear(term, searchTermFailure)
    assert(failure == "Could not be found")
  }

  test("Search.binary") {
    Search.binary(term, searchTermSuccess)
  }
}
