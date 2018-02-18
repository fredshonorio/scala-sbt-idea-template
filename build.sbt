
import ScalacOptions._

lazy val buildSettings = Seq(
  organization   := "com.example",
  version        := "0.0.1",
  scalaVersion   := "2.12.4",
  scalacOptions ++= compilerOptions,
)

lazy val deps = Seq(
  "org.scalatest" %% "scalatest" % "3.0.4" % Test
)

lazy val myproject = (project in file("."))
  .settings(
    buildSettings,
//    resolvers := Seq(),
    libraryDependencies ++= deps
  )

scalafixSettings

