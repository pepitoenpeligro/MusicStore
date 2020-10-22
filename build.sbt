name := "scala1"
version := "1.0"
scalaVersion := "2.13.3"


libraryDependencies ++= Seq(
    "org.scalactic" %% "scalactic" % "3.1.2",
    "org.scalatest" %% "scalatest" % "3.1.2" % "test"
)

resolvers += "Artima Maven Repository" at "https://repo.artima.com/releases"
