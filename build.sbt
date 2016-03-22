name := "PlaySessionBug"

version := "1.0"

lazy val `playsessionbug` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"