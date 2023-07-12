import sbt._

object Dependencies {
  lazy val scalaTestVersion = "3.2.16"

  lazy val catsVersion = "2.9.0"

  lazy val monixVersion = "3.4.0"
  lazy val sttpVersion = "3.8.16"
  lazy val pureConfigVersion = "0.17.4"

  lazy val scalaTest = "org.scalatest" %% "scalatest" % scalaTestVersion % Test
  lazy val cats = "org.typelevel" %% "cats-core" % catsVersion

  lazy val monix = "io.monix" %% "monix" % monixVersion
  lazy val sttp = "com.softwaremill.sttp.client3" %% "core" % sttpVersion
  lazy val pureConfig = "com.github.pureconfig" %% "pureconfig" % pureConfigVersion

  lazy val commonDeps: Seq[ModuleID] = Seq(
    scalaTest,
    cats
  )

  lazy val portsDeps: Seq[ModuleID] = Seq(
    pureConfig,
    monix,
    sttp
  )
}
