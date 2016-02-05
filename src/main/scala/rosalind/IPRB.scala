package rosalind

import subscript.language
import subscript.Predef._

import subscript.vm.ScriptNode

import rosalind.util.SubScriptArgsApp

object IPRB extends SubScriptArgsApp {

  def comb(x: Int) = ((x - 1) * x) / 2

  script..
    live(args: Array[String]) = extract: args ~~((homD: Int, het: Int, homR: Int)) ~~> [
      val res = (
        1.0  * (comb(homD) + homD * het + homD * homR) +
        0.75 * comb(het) +
        0.5  * het * homR
      ) / comb(homD + het + homR)

      println: res
    ]

    extract(args: Array[String]) =
      val work: Int => ScriptNode[Any] = x => [{!args(x).toInt!}^]
      work(0)^^1
      work(1)^^2
      work(2)^^3

}