# oneai-app

This repository contains the Nirvana Android application built with Jetpack Compose.

## Building the project

The project uses the Gradle wrapper. Ensure JDK 17 is installed and run:

```bash
cd Nirvana
./gradlew assembleDebug
```

The resulting APK can be found under `Nirvana/app/build/outputs/apk/debug/`.

### Analytics Setup

Set your Segment write key in `Nirvana/gradle.properties` before building:

```properties
segment.writeKey=YOUR_WRITE_KEY
```

`BuildConfig` exposes this value as `SEGMENT_WRITE_KEY` at runtime.

## Requirements

- JDK 17
- Android SDK with API level 34
- Gradle 8

## License

MIT
