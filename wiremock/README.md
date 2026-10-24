# WireMock standalone: HTTP and WebSockets

Pinned to [WireMock 4.0.0-beta.41](https://github.com/wiremock/wiremock/releases/tag/4.0.0-beta.41),
the latest 4.x beta on Maven Central as of 2026-10-24. WebSockets are built in;
no extension or separate WebSocket server is needed.

## Run

Requires Java 17+, Bash, curl (first download only), and sha256sum or shasum.
From the repository root:

```sh
./wiremock/run.sh
```

The script downloads the standalone JAR from Maven Central into the ignored
`wiremock/.cache/` directory, verifies its SHA-256, and starts WireMock on
`127.0.0.1:8080`. Stop with Ctrl+C. The setup runs independently of the Android app
and Gradle build. For another port or verbose logging:

```sh
PORT=9090 ./wiremock/run.sh --verbose
```

## Try it

Open [`client.http`](client.http) in IntelliJ IDEA's HTTP Client (or another
JetBrains IDE with WebSocket HTTP Client support). Run the hello-world request,
then the WebSocket request. The WebSocket connects, sends `ping`, and displays
`pong` in the response pane. Send `ping` again in the same session to get another
`pong`. Disconnect when finished. Change `@host` if you use a different port.

The WebSocket syntax requires a client that supports `WEBSOCKET` requests;
VS Code REST Client does not support this syntax.

HTTP can also be tried with curl:

```sh
curl http://127.0.0.1:8080/hello
# {"message":"Hello, world!"}
```

## How the WebSocket integration works

- `mappings/hello.json` returns the hello-world JSON for `GET /hello`.
- `mappings/websocket.json` matches `GET /ws/ping-pong` and sets
  `openWebsocketChannel: true` to accept the WebSocket upgrade.
- `message-mappings/ping-pong.json` matches the exact text `ping` on that path
  and sends `pong` back to the originating connection. Other messages do not
  match this stub and receive no application response.
- The admin requests in `client.http` show the loaded message mappings and
  received/sent message journal. Restart WireMock after changing mapping files.

Here `ping` and `pong` are application text messages. WebSocket protocol Ping/Pong
control frames are handled separately by the underlying server.
