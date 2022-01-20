// build.sbt
scalaVersion := "2.12.3"
libraryDependencies += "org.apache.spark" %% "spark-core" % "3.1.2"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.1.2"
enablePlugins(PackPlugin) 
