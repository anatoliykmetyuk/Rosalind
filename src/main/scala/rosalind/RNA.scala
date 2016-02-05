package rosalind

import subscript.language
import subscript.Predef._

import rosalind.util.SubScriptArgsApp

object RNA extends SubScriptArgsApp {script..
  live(args: Array[String]) =
    println: args.head.map {case 'T' => 'U'; case x => x}
}