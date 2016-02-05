package rosalind

import subscript.language
import subscript.Predef._

import rosalind.util.SubScriptArgsApp

object PROT {

  def main(args: Array[String]) {
    println("\n=== START ===")

    val res = args.head.grouped(3).map(_.mkString)
      .takeWhile(!isStop(_))
      .map(toAminoAcid)
      .mkString

    println(res)

    println("\n=== STOP  ===")
  }

  def isStop(codon: String): Boolean = codon match {
    case "UAA" | "UAG" | "UGA" => true
    case _ => false
  }

  def toAminoAcid(codon: String): Char = codon match {
    case "UUU" => 'F'      
    case "CUU" => 'L'      
    case "AUU" => 'I'      
    case "GUU" => 'V'
    case "UUC" => 'F'      
    case "CUC" => 'L'      
    case "AUC" => 'I'      
    case "GUC" => 'V'
    case "UUA" => 'L'      
    case "CUA" => 'L'      
    case "AUA" => 'I'      
    case "GUA" => 'V'
    case "UUG" => 'L'      
    case "CUG" => 'L'      
    case "AUG" => 'M'      
    case "GUG" => 'V'
    case "UCU" => 'S'      
    case "CCU" => 'P'      
    case "ACU" => 'T'      
    case "GCU" => 'A'
    case "UCC" => 'S'      
    case "CCC" => 'P'      
    case "ACC" => 'T'      
    case "GCC" => 'A'
    case "UCA" => 'S'      
    case "CCA" => 'P'      
    case "ACA" => 'T'      
    case "GCA" => 'A'
    case "UCG" => 'S'      
    case "CCG" => 'P'      
    case "ACG" => 'T'      
    case "GCG" => 'A'
    case "UAU" => 'Y'      
    case "CAU" => 'H'      
    case "AAU" => 'N'      
    case "GAU" => 'D'
    case "UAC" => 'Y'      
    case "CAC" => 'H'      
    case "AAC" => 'N'      
    case "GAC" => 'D'
    case "CAA" => 'Q'      
    case "AAA" => 'K'      
    case "GAA" => 'E'
    case "CAG" => 'Q'      
    case "AAG" => 'K'      
    case "GAG" => 'E'
    case "UGU" => 'C'      
    case "CGU" => 'R'      
    case "AGU" => 'S'      
    case "GGU" => 'G'
    case "UGC" => 'C'      
    case "CGC" => 'R'      
    case "AGC" => 'S'      
    case "GGC" => 'G'
    case "CGA" => 'R'      
    case "AGA" => 'R'      
    case "GGA" => 'G'
    case "UGG" => 'W'      
    case "CGG" => 'R'      
    case "AGG" => 'R'      
    case "GGG" => 'G' 
  }
}