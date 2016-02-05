package rosalind

import subscript.language
import subscript.Predef._

import rosalind.util.SubScriptArgsApp

object REVC extends SubScriptArgsApp {script..
  live(args: Array[String]) = println: args.head.reverse.map {
    case 'A' => 'T'; case 'T' => 'A'
    case 'C' => 'G'; case 'G' => 'C'
  }
}