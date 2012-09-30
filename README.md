# Scala Util

A fistful of idiosyncratic, small general-purpose tools for Scala. Inspired by Twitter's own [Util] [twitter-util] project.

## Quick start

### Tap

```scala
import com.snowplowanalytics.util.Tap._
val event = new SnowPlowEvent().tap { e =>
  e.mkt_medium = "cpc"
  e.mkt_source = null
  e.mkt_term = "buy scifi books"
  e.mkt_content = null
  e.mkt_campaign = "uk-fiction--scifi-books-text"
}
```

### More soon

More tools coming soon...

## Questions or need help?

This is a SnowPlow Analytics project. Please see the [Talk to us]
[snowplow-talk] page on the SnowPlow wiki for ways of getting in
touch.

## Copyright and license

Scala Util is copyright 2012 SnowPlow Analytics Ltd.

Licensed under the [Apache License, Version 2.0] [license] (the "License");
you may not use this software except in compliance with the License.

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

[twitter-util]: https://github.com/twitter/util
[issues]: https://github.com/snowplow/scala-util/issues
[license]: http://www.apache.org/licenses/LICENSE-2.0
[snowplow-talk]: https://github.com/snowplow/snowplow/wiki/Talk-to-us
