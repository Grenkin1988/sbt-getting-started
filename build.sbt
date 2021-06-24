
scalaVersion := "2.13.3"

name := "sbt-getting-started"

version := "1.0"

lazy val calculators = project
    .dependsOn(api)
    .settings(
        libraryDependencies ++= Dependencies.calculatorDependencies
    )

lazy val api = project
    .settings(
        libraryDependencies ++= Dependencies.apiDependencies
    )
