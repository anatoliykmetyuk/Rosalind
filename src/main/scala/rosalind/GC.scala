package rosalind

import subscript.language
import subscript.Predef._

import rosalind.util._

object GC extends SubScriptArgsApp with FileIO {script..
  live(args: Array[String]) = fasta(args.head) ~~(data: List[(String, String)])~~^
    data.map {case (name, str) => name -> (str.count(c => c == 'C' || c == 'G') / str.size.toDouble * 100)}.maxBy(_._2)
    ~~((name: String, percentage: Double))~~> [println: name println: percentage]
}