/*
 * Copyright (c) 2012 SnowPlow Analytics Ltd. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
import sbt._
import Keys._
import bintray.AttrMap
import bintray._
import bintray.BintrayPlugin._

object BuildSettings {

  // Basic settings for our app
  lazy val basicSettings = Seq[Setting[_]](
    organization  := "ed",
    version       := "0.1.8",
    description   := "Idiosyncratic, small general-purpose tools for Scala",
    scalaVersion  := "2.9.1",
    scalacOptions := Seq("-deprecation", "-encoding", "utf8")
  )

  lazy val publishSettings = Seq[Setting[_]](
    publishMavenStyle := false,
    licenses +=("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.txt"))
  )

  lazy val buildSettings = basicSettings ++ publishSettings ++ bintraySettings
}
