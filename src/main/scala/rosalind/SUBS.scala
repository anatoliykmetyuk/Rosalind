package rosalind

import subscript.language
import subscript.Predef._

import rosalind.util.SubScriptArgsApp

object SUBS extends SubScriptArgsApp {script..

  live(args: Array[String]) = extract: args ~~((string: String, target: String))~~>
    [loop: string, 1, target, Nil ~~^ {x: List[Int] => x.mkString(" ")}] ~~(str: String)~~> println: str

  loop(substr: String, index: Int, target: String, accum: List[Int]): Any =
    if substr.size < target.size      then ^accum
    else if substr.startsWith(target) then loop(substr.tail, index + 1, target, accum :+ index)^
                                      else loop(substr.tail, index + 1, target, accum         )^

  extract(args: Array[String]) = ^(args(0))^^1 ^(args(1))^^2
  
}