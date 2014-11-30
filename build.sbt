name := "repox"

organization := "com.gtan"

scalaVersion := "2.11.4"

val akkaVersion = "2.3.7"

libraryDependencies ++= Seq(
  "io.undertow" % "undertow-core" % "1.1.0.Final" withSources(),
  "com.ning" % "async-http-client" % "1.8.15",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0",
  "ch.qos.logback" % "logback-classic" % "1.1.2",
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
  "com.typesafe.akka" %% "akka-agent" % akkaVersion,
  "com.typesafe.akka" %% "akka-persistence-experimental" % "2.3.7"
)

fork := true

Revolver.settings