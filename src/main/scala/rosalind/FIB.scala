package rosalind

import subscript.language
import subscript.Predef._

import subscript.vm.ScriptNode

import rosalind.util._

object FIB extends SubScriptArgsApp with Dynamic[Long, Long] {script..
  live(args: Array[String]) = ^args.toList.map(_.toLong) ~~(Seq(months: Long, pairs: Long))~~>
    fib: months, pairs ~~(res: Long)~~> println: res

  fib(n: Long, step: Long): Any = dynamic: n, [
    ^n ~~(x: Long if x <= 2)~~> ^(1.toLong) +~~(x: Long)~~>
    [fib(x - 2, step)^^1 fib(x - 1, step)^^2] ~~((n1: Long, n2: Long))~~> ^(n1 * step + n2)
  ]
}