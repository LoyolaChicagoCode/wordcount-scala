package main
import scala.collection.mutable.Map
/**
 * Created by sauloaguiar on 9/14/14.
 */
trait Counter {
  def account(word: String) : Int
  def getWords() : Map[String, Int]
  def getWordCount(word: String) : Int
  def getWordCount() : Int
}
