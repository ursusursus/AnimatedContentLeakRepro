# WireMock standalone

Requires Java 17+. WireMock 4.0.0-beta.41 includes WebSocket support.

From the repository root, download the JAR once and run it:

```sh
cd wiremock
curl -LO https://repo.maven.apache.org/maven2/org/wiremock/wiremock-standalone/4.0.0-beta.41/wiremock-standalone-4.0.0-beta.41.jar
java -jar wiremock-standalone-4.0.0-beta.41.jar
```

Open `client.http` in the JetBrains HTTP Client:

- `GET /hello` returns `{"message":"Hello, world!"}`.
- `/ws/ping-pong` replies to text `ping` with text `pong`.

WireMock loads `mappings/` and `message-mappings/` from the current directory.
Stop with Ctrl+C; restart with the same `java -jar` command.
