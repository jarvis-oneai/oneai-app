# oneai-app

This repository contains the Nirvana Android application built with Jetpack Compose.

## Building the project

The project uses the Gradle wrapper. Ensure JDK 17 is installed and set the
`JAVA_HOME` environment variable to its location, for example:

```bash
export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
```

Then run:

```bash
cd Nirvana
./gradlew assembleDebug
```

The resulting APK can be found under `Nirvana/app/build/outputs/apk/debug/`.

## Requirements

- JDK 17 (set `JAVA_HOME` to the JDK path)
- Android SDK with API level 34
- Gradle 8

## License

MIT
