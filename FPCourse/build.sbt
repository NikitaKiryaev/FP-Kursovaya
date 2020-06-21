lazy val common = Seq(
  version := "0.1",
  scalaVersion := "2.13.2",
  libraryDependencies +=
  "org.scalatest" %% "scalatest" % "3.0.8" % Test
)
lazy val root = project
  .in(file("."))
  .aggregate(lab1, lab2, lab3, lab4)
  .settings(common)
  .dependsOn(lab1, lab2, lab3, lab4)

lazy val lab1 = Project ("lab1", file("lab1"))
.settings(common)

lazy val lab2 = Project ("lab2", file("lab2"))
  .settings(common)

lazy val lab3 = Project ("lab3", file("lab3"))
  .settings(common)

lazy val lab4 = Project ("lab4", file("lab4"))
  .settings(common)
