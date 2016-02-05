package rosalind

import subscript.language
import subscript.Predef._

import rosalind.util.SubScriptArgsApp

object HAMM extends SubScriptArgsApp {script..

  live(args: Array[String]) = extract: args ~~((first: String, second: String))~~>
    ^first.zip(second).count{case (c1, c2) => c1 != c2} ~~(x: Int)~~> println: x

  extract(args: Array[String]) = ^args(0)^^1 ^args(1)^^2
}