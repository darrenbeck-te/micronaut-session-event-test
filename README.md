## Micronaut Session Event Test

This repository contains a very simple application with a single controller and an event listener. 

The expected behaviour is that any HTTP session events should result in a log message being printed to the console. However, when running this example no events are logged despite sessions being created.

## Running

Start the application with:

```shell
./gradlew run
```

And test using CURL:

```shell
curl http://localhost:8080
```

The HTTP response will contain a string of the pattern:

```
Hello from session: <session-id>
```

