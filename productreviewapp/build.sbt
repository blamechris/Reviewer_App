name := """ProductReviewApp"""
organization := "chris"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.10"

// Play Framework dependencies
libraryDependencies ++= Seq(
  guice,
  "com.typesafe.play" %% "play" % "2.8.19",
  "com.typesafe.play" %% "play-java" % "2.8.19",
  "com.typesafe.play" %% "play-guice" % "2.8.19",
  "com.typesafe.play" %% "play-akka-http-server" % "2.8.19"
)

dependencyOverrides ++= Seq(
  "com.google.inject" % "guice" % "5.1.0",
  "com.google.inject.extensions" % "guice-assistedinject" % "5.1.0"
)
