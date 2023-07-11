import Dependencies._

ThisBuild / scalaVersion     := "2.13.11"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.mundox"
ThisBuild / organizationName := "mundox"

lazy val core = (project in file("core"))
  .settings(
    name := "food-service-core",
    libraryDependencies ++= commonDeps
  )

lazy val ports = (project in file("ports"))
  .dependsOn(core)
  .aggregate(core)
  .settings(
    name := "food-service-ports",
    libraryDependencies ++= commonDeps
  )


// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
