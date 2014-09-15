package main

import impl.MapCounter

object Main extends App {

  val counter = new MapCounter

  for (word <- io.Source.stdin.getLines().flatMap(_.split("\\W+"))) {
    counter.account(word)
  }

  for ((k,v) <- counter.getWords()) {
    println(k + " - " + v)
  }

}