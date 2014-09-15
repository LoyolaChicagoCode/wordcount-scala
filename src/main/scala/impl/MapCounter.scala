package impl

import scala.collection.mutable.Map

/**
 * Created by sauloaguiar on 9/14/14.
 */
class MapCounter extends main.Counter {

  private val scores = scala.collection.mutable.Map[String, Int]()

  def account(word: String) : Int = {
    if (scores.contains(word)) scores(word) += 1  else scores(word) = 1
    getWordCount(word)
  }

  def getWords() : Map[String, Int] = {
    scores
  }

  def getWordCount(word: String) : Int = {
    scores.getOrElse(word, -1);
  }

  def getWordCount() : Int = {
    scores.size
  }
}
