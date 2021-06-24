
scalaVersion := "2.13.3"

name := "sbt-getting-started"

version := "1.0"

lazy val calculators = project
  .dependsOn(api)
  .enablePlugins(JavaAppPackaging)
  .settings(
    libraryDependencies ++= Dependencies.calculatorDependencies
  )

lazy val api = project
  .enablePlugins(JavaAppPackaging)
  .settings(
    libraryDependencies ++= Dependencies.apiDependencies
  )
