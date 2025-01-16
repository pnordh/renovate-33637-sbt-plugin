version := "1.1.0"
organization := "com.pnordh"

lazy val root = (project in file("."))
  .enablePlugins(SbtPlugin)
  .settings(
    name := "sbt-renovate-33637",
    scalaVersion := "2.12.20"
  )

githubOwner := "pnordh"
githubRepository := "renovate-33637-sbt-plugin"
