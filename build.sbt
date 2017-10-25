name := "ensime-sbt-bug"

version := "0.1-SNAPSHOT"

publishArtifact in packageSrc := false  // Don't package source.

scalaVersion := "2.11.8"

def sparkJars() = {
  val home = System.getProperty("user.home")
  val jarsDir = new java.io.File(s"$home/spark-2.2.0/jars")
  (jarsDir * "*.jar").get
}

dependencyClasspath in Compile ++= sparkJars()

dependencyClasspath in Test ++= sparkJars()
