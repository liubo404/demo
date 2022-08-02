val scala3Version = "3.1.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "cookbook",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
    
    // libraryDependencies ++= Seq(
    // "org.typelevel" %% "cats-core" % "2.6.0",
    // "org.typelevel" %% "cats-effect" % "3.1.0"
    // )
  )
