object Input { 
	def main(args: Array[String]) = {

		val scores = scala.collection.mutable.Map[String, Int]()
		for (line <- io.Source.stdin.getLines().flatMap(_.split("\\W+"))) {
			if (scores.contains(line)) scores(line) += 1  else scores(line) = 1
		}
				
		for ( (k,v) <- scores) {
			println(k + " - " + v)
		}
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