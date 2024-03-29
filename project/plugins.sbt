// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository 
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("play" % "sbt-plugin" % "2.0.4")

addSbtPlugin("com.github.hexx" % "play-jsx" % "0.0.1")

addSbtPlugin("com.github.hexx" % "play-haxe" % "0.0.1")

addSbtPlugin("com.github.hexx" % "play-typescript" % "0.0.1")
