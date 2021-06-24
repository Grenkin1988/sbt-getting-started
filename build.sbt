
scalaVersion := "2.13.3"

name := "sbt-getting-started"

version := "1.0"

lazy val calculators = project
    .settings(
        libraryDependencies += ("org.scalatest" %% "scalatest" % "3.0.5" % Test)
    )

lazy val api = project
    .settings(
        libraryDependencies ++= Seq(
            "com.lihaoyi" %% "requests" % "0.1.7",
            "org.scala-lang.modules" %% "scala-xml" % "1.1.1",
            "org.scalatest" %% "scalatest" % "3.0.5" % Test
        )
    )
