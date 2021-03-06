name := "StreamingProcessor"

version := "1.0"

scalaVersion := "2.11.8"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
                        "com.typesafe.akka" %% "akka-actor" % "2.4.9-RC2",
                        "com.typesafe.akka" %% "akka-agent" % "2.4.9-RC2",
                        "com.typesafe.akka" %% "akka-stream" % "2.4.9-RC2",
                        "com.typesafe.akka" %% "akka-testkit" % "2.4.9-RC2"
                  )