resolvers += Classpaths.sbtPluginReleases
resolvers += "sonatype releases"  at "https://oss.sonatype.org/content/repositories/releases"
//addMavenResolverPlugin

addSbtPlugin("com.typesafe"         % "sbt-mima-plugin"         % "0.1.8")
addSbtPlugin("org.skinny-framework" % "sbt-servlet-plugin"      % "2.0.2")
addSbtPlugin("com.typesafe.sbt"     % "sbt-scalariform"         % "1.3.0")
addSbtPlugin("com.github.mpeltonen" % "sbt-idea"                % "1.6.0")
addSbtPlugin("com.jsuereth"         % "sbt-pgp"                 % "1.0.0")
addSbtPlugin("net.virtual-void"     % "sbt-dependency-graph"    % "0.7.5")
addSbtPlugin("com.timushev.sbt"     % "sbt-updates"             % "0.1.9")

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")
