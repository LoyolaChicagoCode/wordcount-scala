package impl

import org.scalatest.FunSuite
import org.scalatest.prop.Checkers

/**
 * Created by sauloaguiar on 9/15/14.
 */
class MapCheck extends FunSuite with Checkers {
  val map = new MapCounter

  test("A map should contains the right number of occurrences for a word") {
    check { (word: String) =>
      map.account(word) == map.getWordCount(word)
    }
  }
}
