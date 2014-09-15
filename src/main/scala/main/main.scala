package main

import impl.MapCounter

object Main extends App {

  val counter = new MapCounter

  for (word <- io.Source.stdin.getLines().flatMap(_.split("\\W+"))) {
    counter.account(word)
  }

  for ( (k,v) <- counter.getWords()) {
    println(k + " - " + v)
  }

}

/*for (word <- io.Source.stdin.getLines.flatMap(_.split("\\W+"))) {
	println(word)
}*/

/*
scala.io.Source.fromFile("file.txt")
  .getLines
  .flatMap(_.split("\\W+"))
  .foldLeft(Map.empty[String, Int]){
     (count, word) => count + (word -> (count.getOrElse(word, 0) + 1))
  }
*/
/*scala.io.Source.stdin.getLine(0) match {
			case "hello" =>
				println("hi")
			case "input" =>
				for (word <- io.Source.stdin.getLines.flatMap(_.split("\\W+"))) {
					println(word)
				}	
			case "exit" =>
				sys.exit
			case _ =>
				println("not found") 
		}*/