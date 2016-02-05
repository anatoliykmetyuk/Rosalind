package rosalind.util

import subscript.language
import subscript.Predef._

import subscript.vm.ScriptNode

trait Dynamic[A, B] {

  val buffer = collection.mutable.Map[A, B]()

  script dynamic(key: A, s: ScriptNode[Any]) =
    ^buffer.get(key) ~~(Some(res: B))~~> ^res +~~(None)~~> 
    s ~~(res: B)~~> [let buffer(key) = res; ^res]

}