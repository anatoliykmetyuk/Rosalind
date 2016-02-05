scalaVersion := "2.11.7"
libraryDependencies += "org.subscript-lang" %% "subscript-swing" % "3.0.1-SNAPSHOT"
SubscriptSbt.projectSettings

mainClass in Compile := Some("rosalind.FIB")