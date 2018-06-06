val scalaJSVersion =
  Option(System.getenv("SCALAJS_VERSION")).getOrElse("0.6.23")

// For sbt-crossproject support even with Scala.js 0.6.x
// {
//   if (scalaJSVersion.startsWith("0.6."))
//     Seq(addSbtPlugin("org.scala-native" % "sbt-scalajs-crossproject" % "0.2.2"))
//   else
//     Nil
// }
addSbtPlugin("org.scala-js"       % "sbt-scalajs"                   % scalaJSVersion)

addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject"      % "0.4.0")

addSbtPlugin("org.portable-scala" % "sbt-scala-native-crossproject" % "0.4.0")

addSbtPlugin("org.scala-native" % "sbt-scala-native" % "0.3.7")

// addSbtPlugin("org.scalastyle" % "scalastyle-sbt-plugin" % "1.0.0")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.3")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.0")

addSbtPlugin("io.github.cquiroz" % "sbt-locales" % "0.1.0-SNAPSHOT")
