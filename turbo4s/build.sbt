val scala3Version = "3.1.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "turbo4s",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,

    // https://mvnrepository.com/artifact/com.google.guava/guava
    libraryDependencies += "com.google.guava" % "guava" % "31.1-jre",
    // https://mvnrepository.com/artifact/com.fasterxml.uuid/java-uuid-generator
    libraryDependencies += "com.fasterxml.uuid" % "java-uuid-generator" % "3.1.4",
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )
