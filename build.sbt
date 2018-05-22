
import ScalacOptions._

lazy val buildSettings = Seq(
  organization   := "com.example",
  version        := "0.0.1",
  scalaVersion   := "2.12.4",
  scalacOptions ++= compilerOptions,
)

lazy val deps = Seq(
  // "a.private"   % "dependency" % "0.0.0",
  "org.scalatest" %% "scalatest"       % "3.0.5" % Test,
  "junit"         %  "junit"           % "4.12"  % Test, // if junit tests are needed
  "com.novocode"  %  "junit-interface" % "0.11"  % Test  // if junit tests are needed
)

lazy val myproject = (project in file("."))
  .settings(
    buildSettings,
    libraryDependencies ++= deps,
    mainClass in assembly := Some("myproject.Hello"),
    assemblyJarName in assembly := "myproject.jar",           // build a fat-jar with `sbt assembly` which runs the `mainClass` defined above
    crossPaths := false,                                      // sbt can pick up java tests if this is false, not sure what else it does
    testOptions += Tests.Argument(TestFrameworks.JUnit, "-a"),// -a shows a stack trace while running `sbt test` (if junit tests are needed)
    resolvers ++=
      Seq(
        // "A Private Repo" at "s3://bleep.bloop.s3-eu-west-1.amazonaws.com",
        Resolver.jcenterRepo
      )
)

scalafixSettings
