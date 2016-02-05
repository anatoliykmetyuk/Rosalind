package rosalind

import subscript.language
import subscript.Predef._

import rosalind.util.SubScriptArgsApp

object DNA extends SubScriptArgsApp {script..
  live(args: Array[String]) =
    dataset(args.head)
    ~~(res: (Int, Int, Int, Int))~~>
    println: res.productIterator.mkString(" ")

  dataset(str: String) =
    search(str, 'A')^^1
    search(str, 'C')^^2
    search(str, 'G')^^3
    search(str, 'T')^^4

  search(str: String, target: Char) =
    {!str.filter(_ == target).size!}
}