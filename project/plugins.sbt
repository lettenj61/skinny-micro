resolvers += Classpaths.sbtPluginReleases
resolvers += "sonatype releases"  at "https://oss.sonatype.org/content/repositories/releases"

addSbtPlugin("io.get-coursier"      % "sbt-coursier"            % "1.0.0-RC3")
addSbtPlugin("com.typesafe"         % "sbt-mima-plugin"         % "0.1.14")
addSbtPlugin("org.skinny-framework" % "sbt-servlet-plugin"      % "2.2.3")
addSbtPlugin("org.scalariform"      % "sbt-scalariform"         % "1.6.0")
addSbtPlugin("com.github.mpeltonen" % "sbt-idea"                % "1.6.0")
addSbtPlugin("com.jsuereth"         % "sbt-pgp"                 % "1.0.0")
addSbtPlugin("org.xerial.sbt"       % "sbt-sonatype"            % "1.1")
addSbtPlugin("net.virtual-void"     % "sbt-dependency-graph"    % "0.8.2")
addSbtPlugin("com.timushev.sbt"     % "sbt-updates"             % "0.3.0")

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")
