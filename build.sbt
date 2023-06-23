ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.11"

lazy val root = (project in file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    //Test / scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.CommonJSModule) }, // works
    Test / scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.ESModule) }, // does not work
    name := "scala-js-tests-es-modules",
    scalaJSUseMainModuleInitializer := true,
    libraryDependencies += "net.exoego" %%% "scala-js-nodejs-v12" % "0.14.0" % Test,
    libraryDependencies += "org.scalatest" %%% "scalatest" % "3.2.12" % Test,
  )
