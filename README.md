# Scala Util

A fistful of idiosyncratic, small general-purpose tools for Scala. Inspired by (and in some cases, [rejected by] [tap-request]) Twitter's own [Util] [twitter-util] project.

## Quick start

### Tap

```scala
val expectedEvent = new SnowPlowEvent().tap { e =>
  e.mkt_medium = "cpc"
  e.mkt_source = null
  e.mkt_term = "buy scifi books"
  e.mkt_content = null
  e.mkt_campaign = "uk-fiction--scifi-books-text"
}
```

## Questions or need help?

Please [raise an issue] [issues], contact us at [support@snowplowanalytics.com] [email] or join our [SnowPlow Google Group] [snowplow-user].

## Copyright and license

Scala Util is copyright 2012 SnowPlow Analytics Ltd.

Licensed under the [Apache License, Version 2.0] [license] (the "License");
you may not use this software except in compliance with the License.

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

[tap-request]: https://github.com/twitter/util/pull/38
[twitter-util]: https://github.com/twitter/util
[issues]: https://github.com/snowplow/scala-util/issues
[email]: mailto:support@snowplowanalytics.com
[license]: http://www.apache.org/licenses/LICENSE-2.0
[snowplow-user]: https://groups.google.com/d/forum/snowplow-user