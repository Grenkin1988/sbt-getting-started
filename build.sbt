
scalaVersion := "2.13.3"

name := "sbt-getting-started"

version := "1.0"

lazy val root = project.in(file("."))
    .aggregate(calculators)

lazy val calculators = project
