name := "data_warehouse"

version := "0.1"

scalaVersion := "2.11.8"

organization := "com.databricks.blog"

libraryDependencies ++= Seq("org.apache.spark" % "spark-sql_2.11" % "2.4.0" % "provided"
  % "com.holdenkarau" % "spark-testing-base" % "2.0.0_0.4.7" % "test")