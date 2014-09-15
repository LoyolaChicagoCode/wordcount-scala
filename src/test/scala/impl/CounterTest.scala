package impl
import org.scalatest.FunSuite
/**
 * Created by sauloaguiar on 9/14/14.
 */
class CounterTest extends FunSuite {

  test("An empty map should have no word") {
    val counter = new MapCounter

  }

  test("Check whether the first occurrence of a word is correctly computed") {
    val counter = new MapCounter
    counter.account("first")
    assert(counter.getWordCount("first") == 1)

    counter.account("second")
    assert(counter.getWordCount("second") == 1)
  }

  test("Check whether a inexistent word is asked") {
    val counter = new MapCounter
    assert(counter.getWordCount("trial") == -1)
  }

  test("Check whether a second addition is summed") {
    val counter = new MapCounter
    counter.account("first")
    counter.account("first")
    assert(counter.getWordCount("first") == 2)
  }
}
