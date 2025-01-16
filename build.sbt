ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.pnordh"

lazy val root = (project in file("."))
  .enablePlugins(SbtPlugin)
  .settings(
    name := "sbt-renovate-33637",
  )
