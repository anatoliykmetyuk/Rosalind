package rosalind.util

import subscript.language
import subscript.Predef._

import java.io.File

import org.apache.commons.io.FileUtils


trait FileIO {
  lazy val folder = new File(System.getenv("ROSALIND_WORKING_DIR"))

  script..
    file(name: String) = ^FileUtils.readFileToString(new File(folder, name))

    /** Reads a genetic DB from a file in FASTA format */
    fasta(name: String) = file(name) ~~(raw: String)~~^
      raw.split(">").tail.map(_.split("\n")).map {sp => sp.head -> sp.tail.mkString}.toList
}