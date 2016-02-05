package rosalind.util

import subscript.language
import subscript.Predef._

trait SubScriptArgsApp {
  def main(args: Array[String]): Unit = {
    println("\n=== RUN STARTED ===")

    runScript(live(args))

    println("\n=== RUN ENDED   ===")
  }

  script live(args: Array[String]): Any
}