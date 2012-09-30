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
package com.snowplowanalytics.util

// Java
import java.util.{Stack => JStack}

// Specs2
import org.specs2.mutable.Specification

// SnowPlow Util
import Tap._

/**
 * Specs2 test for our Ruby-style Tap
 */
class TapTest extends Specification {

	"A tapped object" should {

		val tappedStack = new JStack[Int]().tap { ts =>
			ts.push(1)
			ts.push(2)
			ts.pop()
		}

		"be identical to an equivalent untapped object" in {

			val untappedStack = new JStack[Int]()
			untappedStack.push(1)
			untappedStack.push(2)
			untappedStack.pop()

			tappedStack.pop() must beEqualTo (untappedStack.pop())
			// TODO: would be nice to do object equality test - but fails currently
		}
	}
}