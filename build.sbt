import com.typesafe.sbt.SbtStartScript

name := "evertool"

version := "1.0"

scalaVersion := "2.10.2"

seq(SbtStartScript.startScriptForClassesSettings: _*)

libraryDependencies += "com.evernote" % "evernote-api" % "1.25.1"
